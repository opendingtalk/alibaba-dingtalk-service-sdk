package com.taobao.api.internal.sign;

import java.util.LinkedHashMap;
import java.util.Map;

import com.taobao.api.ApiException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoClient;
import com.taobao.api.internal.util.DESUtil;
import com.taobao.api.internal.util.json.ExceptionErrorListener;
import com.taobao.api.internal.util.json.JSONReader;
import com.taobao.api.internal.util.json.JSONValidatingReader;

/**
 * 签名校验客户端
 * @author xuteng.xt
 *
 * 用于SDK本地校验签名有效性。
 * 本地缓存的SK信息，不自动更新，也不过期。
 * 因为如果保证了连接建立的时候或者是第一次检查的时候，SK的有效的，那么运行时SK信息应当是固定的。
 * 对于客户端重置SK的时候，客户运行的本地代码肯定是还没来得及修改，这个时候，不应该报错签名失败。
 * 当客户端修改了SK，重新建立连接，那么这个时候才能更新本地的SK。
 */
public class SignatureCheckClient {
	
	private TaobaoClient taobaoClient;
	
	private Map<String,SignCheckDO> secretCacheMap ;
	
	private Map<Long,String> accountCacheMap ;
	
	public SignatureCheckClient(TaobaoClient taobaoClient) {
		
		secretCacheMap = new LinkedHashMap<String,SignCheckDO>() {
			private static final long serialVersionUID = 1L;
			@Override
			protected boolean removeEldestEntry(Map.Entry<String,SignCheckDO> eldest) {
				return size() > 1024 * 32;
			}
		};
		
		accountCacheMap = new LinkedHashMap<Long,String>() {
			private static final long serialVersionUID = 1L;
			@Override
			protected boolean removeEldestEntry(Map.Entry<Long,String> eldest) {
				return size() > 1024 * 32;
			}
		};
		
		this.taobaoClient = taobaoClient;
	}
	
	/**
	 * 客户端连接的时候调用此方法
	 * 校验签名是否正确，直接调用远程服务，不走本地缓存的SK信息
	 * 如果远程校验是成功的，那么更新本地SK信息
	 * @param appKey
	 * @param body
	 * @param signature
	 * @param algorithm
	 * @param charset
	 * @return
	 */
	public boolean checkApiRequestSign(String appKey, byte[] body, String signature, String algorithm, String charset) {
		if(!checkParams(appKey,body,signature)){
			return false;
		}

		try{
			SignatureValidateResponse response =  invokeRemote(appKey,body,algorithm,signature,charset);

			if(response.isSuccess() && response.getValid() != null && response.getValid().booleanValue()){
				//更新secret到本地,这里主要是为了更新过期时间
				if(response.getSecret() != null && response.getSecret().length() > 0){
					secretCacheMap.put(appKey, new SignCheckDO(DESUtil.decrypt(response.getSecret(), signature.substring(0,8)),response.getIsvId()));
				}
				return true;
			}
			return false;
		}catch(ApiException e){
			//网络异常的情况
		}
		
		return true;
	}

	/**
	 * 收发消息的时候调用此方法，签名检查全部走本地secret校验
	 * @param appKey
	 * @param body
	 * @param signature
	 * @param algorithm
	 * @param charset
	 * @return
	 */
	public boolean checkApiRequestSignWithCache(String appKey, byte[] body, String signature, String algorithm,String charset) {

		if(!checkParams(appKey,body,signature)){
			return false;
		}
		
		SignCheckDO signCheckDO = secretCacheMap.get(appKey);
		if (signCheckDO != null) {
			
			String topSignature = SignUtils.signAndBase64Encode(body, signCheckDO.getSecret(), algorithm, charset);
			if (topSignature.equals(signature)) {
				return true;
			}
			//如果验证失败，不做额外处理，请求远程
			//远程验证成功，修改本地secret信息；或者不修改内存secret，防止攻击者频繁失效内存Secret
		}
		
		//如果本地签名上下文不存在，调用远程
		return checkApiRequestSign(appKey,body,signature,algorithm,charset);
	}
	
	private boolean checkParams(String appKey, byte[] body, String signature) {
		
		if(appKey == null || appKey.length() == 0){
			return false;
		}
		
		if(signature == null || signature.length() == 0){
			return false;
		}
		
		if(body == null || body.length == 0){
			return false;
		}
		
		return true;
	}
	
	/**
	 * 清除本地的SK缓存信息
	 * @param appKey
	 * @return
	 */
	public SignCheckDO removeCahceSignCheckInfo(String appKey) {
		return secretCacheMap.remove(appKey);
	}
	
	/**
	 * 获取本地缓存的IsvId
	 * @param appKey
	 * @return
	 */
	public Long getIsvId(String appKey) {
		SignCheckDO signCheck = secretCacheMap.get(appKey);
		if(signCheck != null){
			return signCheck.getIsvId();
		}
		return null;
	}
	
	/**
	 * 通过appkey获取aliyun账号Id
	 * @param appKey
	 * @return
	 */
	public String getAliyunUserId(String appKey) {
		SignCheckDO signCheck = secretCacheMap.get(appKey);
		if(signCheck != null){
			return getAliyunUserId(signCheck.getIsvId());
		}
		return null;
	}
	
	/**
	 * 通过淘宝Id获取aliyun账号Id
	 * @param isvId
	 * @return
	 */
	public String getAliyunUserId(Long isvId) {
		
		String account = accountCacheMap.get(isvId);
		
		if(account == null){
			account = invokeRemoteGetAliyunUserId(isvId);
			if(account != null){
				accountCacheMap.put(isvId, account);
			}
		}
		
		return account;
	}
	
	
	/**
	 * 调用top远端获取aliyun用户信息
	 * @param userId
	 * @return
	 * @throws ApiException
	 */
	@SuppressWarnings("unchecked")
	private String invokeRemoteGetAliyunUserId(long userId) {
		try{
			AliyunUserGetRequest request = new AliyunUserGetRequest();
			request.setUserId(userId);
			AliyunUserGetResponse response = taobaoClient.execute(request);

			if(response.isSuccess()){
				String acountJson = response.getAccount();
				if(acountJson != null){
					JSONReader reader = new JSONValidatingReader(new ExceptionErrorListener());
					Map<String,Object> rootObj = (Map<String,Object>)reader.read(acountJson);
					if(rootObj != null){
						return rootObj.get("aliyunPK").toString();
					}
				}
			}
			//一般是用户没有开通阿里云服务，没有对应的阿里云账号
		}catch(ApiException e){
			//网络问题
		}
		return null;
	}
	
	public void removeAllCacheInfo(){
		secretCacheMap.clear();
	}
	
	public SignatureValidateResponse invokeRemote(String appKey, byte[] body, String algorithm, String signature, String charset) throws ApiException {
		SignatureValidateRequest request = new SignatureValidateRequest();
		request.setAlgorithm(algorithm);
		request.setSignature(signature);
		request.setCharset(charset);
		request.setBody(new FileItem("body", body));
		request.setProxyAppKey(appKey);
		return taobaoClient.execute(request);
	}
	
}
