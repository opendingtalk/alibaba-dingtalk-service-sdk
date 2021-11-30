package com.taobao.api.internal.cluster;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

public class DnsConfig {

	private Map<String, String> globalMap;
	private Map<String, Integer> modleMap;
	private Map<String, ApiConfig> apiMap;
	private Map<String, List<EnvConfig>> envMap;
	private Map<String, Map<String, String>> userMap;

	public static DnsConfig parse(String json) {
		if(json == null || json.length() == 0){
			return null;
		}
		DnsConfig dnsConfig = new DnsConfig();
		Map<?, ?> root = (Map<?, ?>) TaobaoUtils.jsonToObject(json);

		for (Object configType : root.keySet()) {
			if ("config".equals(configType)) {
				dnsConfig.globalMap = new HashMap<String, String>();
				Map<?, ?> globalInfo = (Map<?, ?>) root.get(configType);
				for (Object key : globalInfo.keySet()) {
					dnsConfig.globalMap.put(String.valueOf(key), String.valueOf(globalInfo.get(key)));
				}
			} else if ("env".equals(configType)) {
				Map<?, ?> envInfos = (Map<?, ?>) root.get(configType);
				dnsConfig.envMap = new HashMap<String, List<EnvConfig>>();
				for (Object envName : envInfos.keySet()) {
					Map<?, ?> envInfo = (Map<?, ?>) envInfos.get(envName);
					List<EnvConfig> envConfigs = new ArrayList<EnvConfig>();

					for (Object domainName : envInfo.keySet()) {
						Map<?, ?> domainInfo = (Map<?, ?>) envInfo.get(domainName);
						EnvConfig envConfig = new EnvConfig();
						envConfig.setDomain(String.valueOf(domainName));
						envConfig.setProtocol(String.valueOf(domainInfo.get("proto")));
						List<?> vipInfos = (List<?>) domainInfo.get("vip");
						List<VipRule> vipRules = new ArrayList<VipRule>();
						for (Object vipInfo : vipInfos) {
							String[] vipInfoTmp = vipInfo.toString().split("\\|");
							VipRule vipRule = new VipRule();
							vipRule.setVip(vipInfoTmp[0]);
							vipRule.setWeight(Double.parseDouble(vipInfoTmp[1]));
							vipRules.add(vipRule);
						}
						envConfig.setVipRules(vipRules);
						envConfigs.add(envConfig);
					}
					dnsConfig.envMap.put(String.valueOf(envName), envConfigs);
				}
			} else if ("api".equals(configType)) {
				dnsConfig.apiMap = new HashMap<String, ApiConfig>();
				Map<?, ?> apiInfos = (Map<?, ?>) root.get(configType);
				for (Object apiName : apiInfos.keySet()) {
					Map<?, ?> apiInfo = (Map<?, ?>) apiInfos.get(apiName);
					ApiConfig apiConfig = new ApiConfig();
					apiConfig.setUser(String.valueOf(apiInfo.get("user")));
					if(apiInfo.get("modle") != null){
						ApiModle apiModle = new ApiModle();
						String modle = String.valueOf(apiInfo.get("modle"));
						apiModle.setField(modle.split("\\|")[1]);
						apiModle.setModle(modle.split("\\|")[0]);
						apiConfig.setModle(apiModle);
					}
					List<ApiRule> apiRules = new ArrayList<ApiRule>();
					List<?> apiRuleInfos = (List<?>) apiInfo.get("rule");
					for (Object apiRuleInfo : apiRuleInfos) {
						String[] apiRuleInfoTmp = apiRuleInfo.toString().split("\\|");
						ApiRule apiRule = new ApiRule();
						apiRule.setName(apiRuleInfoTmp[0]);
						apiRule.setWeight(Double.parseDouble(apiRuleInfoTmp[1]));
						apiRules.add(apiRule);
					}
					apiConfig.setRules(apiRules);
					dnsConfig.apiMap.put(String.valueOf(apiName), apiConfig);
				}
			} else if ("user".equals(configType)) {
				dnsConfig.userMap = new HashMap<String, Map<String, String>>();
				Map<?, ?> userInfos = (Map<?, ?>) root.get(configType);
				for (Object routeName : userInfos.keySet()) {
					Map<?, ?> envInfos = (Map<?, ?>) userInfos.get(routeName);
					Map<String, String> tags = new HashMap<String, String>();
					for (Object envName : envInfos.keySet()) {
						List<?> tagInfos = (List<?>) envInfos.get(envName);
						for (Object tagName : tagInfos) {
							tags.put(String.valueOf(tagName), String.valueOf(envName));
						}
					}
					dnsConfig.userMap.put(String.valueOf(routeName), tags);
				}
			} else if("modle".equals(configType)){
				dnsConfig.modleMap = new HashMap<String, Integer>();
				Map<?, ?> modleInfo = (Map<?, ?>) root.get(configType);
				for (Object key : modleInfo.keySet()) {
					dnsConfig.modleMap.put(String.valueOf(key), Integer.parseInt(modleInfo.get(key).toString()));
				}
			}
		}

		return dnsConfig;
	}
	
	public String getEnvVip(String envName,String serverUrl) {
		List<EnvConfig> envVipList = envMap.get(envName);
		if(envVipList != null && envVipList.size() > 0){
			return getEnvVipUrl(serverUrl,envVipList);
		}
		return serverUrl;
	}

	public String getBestVipUrl(String serverUrl, String apiName, String session,TaobaoHashMap appParams) {
		if (apiMap.containsKey(apiName)) {
			ApiConfig apiConfig = apiMap.get(apiName);
			String flag = null;
			//user modle,default
			if (!StringUtils.isEmpty(session) && apiConfig.getUser() != null && apiConfig.getModle() == null) {
				flag = getUserFlag(session);
			}
			//other modle
			if(apiConfig.getUser() != null && apiConfig.getModle() != null){
				flag = getModleFlag(apiConfig,appParams);
			}
			//if modle matched
			if (flag != null && userMap.containsKey(apiConfig.getUser())) {
				Map<String, String> userEnvs = userMap.get(apiConfig.getUser());
				if (userEnvs.containsKey(flag)) {
					String userEnv = userEnvs.get(flag);
					if (envMap.containsKey(userEnv)) {
						List<EnvConfig> envConfigs = envMap.get(userEnv);
						return getEnvVipUrl(serverUrl, envConfigs);
					}
				}
			}
			return getApiVipUrl(serverUrl, apiConfig);
		} else {
			List<EnvConfig> envConfigs = envMap.get(globalMap.get("def_env"));
			return getEnvVipUrl(serverUrl, envConfigs);
		}
	}
	
	public String getVipUrl(String serverUrl) {
	    if(envMap == null || globalMap == null || globalMap.get("def_env") == null
	                      || serverUrl == null || serverUrl.length() == 0){
	        return serverUrl;
	    }
        List<EnvConfig> envConfigs = envMap.get(globalMap.get("def_env"));
        if(envConfigs == null || envConfigs.isEmpty()){
            return serverUrl;
        }
        try {
            return getBalancedUrl(serverUrl, envConfigs);
        } catch (Exception e) {
            return  serverUrl;
        }
        
    }
	
	private String getModleFlag(ApiConfig apiConfig,TaobaoHashMap appParams){
		String modle = apiConfig.getModle().getModle();
		String field = apiConfig.getModle().getField();
		if(modle != null && field != null && appParams.containsKey(field)){
			String value = appParams.get(field);
			Integer modleFalg = modleMap.get(modle);
			if(modleFalg < 0){
				return value.substring(value.length() + modleFalg,value.length() + modleFalg+1);
			}else{
				return value.substring(modleFalg,modleFalg+1);
			}
		}
		return null;
	}

	private String getApiVipUrl(String serverUrl, ApiConfig apiConfig) {
		ApiRule apiRule = ClusterManager.getElementByWeight(apiConfig.getRules());
		if (envMap.containsKey(apiRule.getName())) {
			List<EnvConfig> envConfigs = envMap.get(apiRule.getName());
			return getEnvVipUrl(serverUrl, envConfigs);
		} else {
			List<EnvConfig> envConfigs = envMap.get(globalMap.get("def_env"));
			return getEnvVipUrl(serverUrl, envConfigs);
		}
	}

	private String getEnvVipUrl(String serverUrl, List<EnvConfig> envConfigs) {
		for (EnvConfig envConfig : envConfigs) {
			try {
				URI uri = new URI(serverUrl);
				if (uri.getHost().equalsIgnoreCase(envConfig.getDomain()) && uri.getScheme().equalsIgnoreCase(envConfig.getProtocol())) {
					String vip = ClusterManager.getElementByWeight(envConfig.getVipRules()).getVip();
					return serverUrl.replace(envConfig.getDomain(), vip);
				}
			} catch (Exception e) {
				continue; // ignore invalid url
			}
		}
		return serverUrl;
	}
	
	private String getBalancedUrl(String serverUrl, List<EnvConfig> envConfigs) throws Exception {
	    URL uri = new URL(serverUrl);
	    String host = uri.getHost();
	    String scheme = uri.getProtocol();
        for (EnvConfig envConfig : envConfigs) {
            try {
                if (host.equalsIgnoreCase(envConfig.getDomain())) {
                    List<VipRule>  vipRuleList = envConfig.getVipRules();
                    if(vipRuleList == null || vipRuleList.isEmpty()){
                        return serverUrl;
                    }
                    Random random = new Random();
                    String  vip = vipRuleList.get(random.nextInt(vipRuleList.size())).getVip();
                    if(vip == null || vip.length() == 0){
                        return serverUrl;
                    }
                    StringBuilder urlBuilder = new StringBuilder(); 
                    urlBuilder.append(scheme).append("://").append(vip);
                    if(uri.getPort() > 0){
                        urlBuilder.append(":").append(uri.getPort());
                    }
                    if(uri.getFile() != null){
                        urlBuilder.append(uri.getFile());
                    }
                    return urlBuilder.toString();
                }
            } catch (Exception e) {
                continue; // ignore invalid url
            }
        }
        return serverUrl;
    }
	
	

	private String getUserFlag(String session) {
		if (!StringUtils.isEmpty(session) && session.length() > 5) {
			if (session.startsWith("6") || session.startsWith("7")) {
				return session.substring(session.length() - 1, session.length());
			} else if (session.startsWith("5") || session.startsWith("8")) {
				return session.substring(5, 5 + 1);
			}
		}
		return null;
	}
	
	public long getVersion(){
		if(globalMap == null){
	        return 0L;
	    }
		String tmp = globalMap.get("version");
		try{
			if (tmp != null) {
				return Long.parseLong(tmp);
			} else {
				return 0L;
			}
		}catch(Exception e){
			return 0L;
		}
	}

	public int getRefreshInterval() {
	    if(globalMap == null){
	        return 15;
	    }
		String tmp = globalMap.get("interval");
		if (tmp != null) {
			return Integer.parseInt(tmp);
		} else {
			return 15;// 默认15分钟刷新一次
		}
	}
	

}
