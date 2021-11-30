package com.dingtalk.api.request;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.TaobaoObject;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;
import com.dingtalk.api.response.OapiRelationRemarkModifyResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.relation.remark.modify request
 * 
 * @author top auto create
 * @since 1.0, 2019.07.01
 */
public class OapiRelationRemarkModifyRequest extends BaseTaobaoRequest<OapiRelationRemarkModifyResponse> {
	
	

	/** 
	* 系统自动生成
	 */
	private String markees;

	/** 
	* 修改者的userid
	 */
	private String markers;

	public void setMarkees(String markees) {
		this.markees = markees;
	}

	public void setMarkees(List<RemarkModel> markees) {
		this.markees = new JSONWriter(false,false,true).write(markees);
	}

	public String getMarkees() {
		return this.markees;
	}

	public void setMarkers(String markers) {
		this.markers = markers;
	}

	public String getMarkers() {
		return this.markers;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.relation.remark.modify";
	}

	private String topResponseType = Constants.RESPONSE_TYPE_DINGTALK_OAPI;

     public String getTopResponseType() {
        return this.topResponseType;
     }

     public void setTopResponseType(String topResponseType) {
        this.topResponseType = topResponseType;
     }

     public String getTopApiCallType() {
        return DingTalkConstants.CALL_TYPE_OAPI;
     }

     private String topHttpMethod = DingTalkConstants.HTTP_METHOD_POST;

     public String getTopHttpMethod() {
     	return this.topHttpMethod;
     }

     public void setTopHttpMethod(String topHttpMethod) {
        this.topHttpMethod = topHttpMethod;
     }

     public void setHttpMethod(String httpMethod) {
         this.setTopHttpMethod(httpMethod);
     }

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("markees", this.markees);
		txtParams.put("markers", this.markers);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiRelationRemarkModifyResponse> getResponseClass() {
		return OapiRelationRemarkModifyResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkObjectMaxListSize(markees, 100, "markees");
		RequestCheckUtils.checkNotEmpty(markers, "markers");
		RequestCheckUtils.checkMaxListSize(markers, 100, "markers");
	}
	
	/**
	 * 系统自动生成
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class RemarkModel extends TaobaoObject {
		private static final long serialVersionUID = 7547272257892124757L;
		/**
		 * 被修改的备注名
		 */
		@ApiField("remark_name")
		private String remarkName;
		/**
		 * 被修改的userid
		 */
		@ApiField("userid")
		private String userid;
	
		public String getRemarkName() {
			return this.remarkName;
		}
		public void setRemarkName(String remarkName) {
			this.remarkName = remarkName;
		}
		public String getUserid() {
			return this.userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
	}
	

}