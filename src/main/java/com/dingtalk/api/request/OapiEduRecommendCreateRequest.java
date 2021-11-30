package com.dingtalk.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;
import java.util.List;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.dingtalk.api.DingTalkConstants;
import com.taobao.api.Constants;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.internal.util.TaobaoUtils;

import com.dingtalk.api.response.OapiEduRecommendCreateResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.recommend.create request
 * 
 * @author top auto create
 * @since 1.0, 2021.04.21
 */
public class OapiEduRecommendCreateRequest extends BaseTaobaoRequest<OapiEduRecommendCreateResponse> {
	
	

	/** 
	* 班级ID
	 */
	private Long classId;

	/** 
	* 内容标签，推荐扩散给其他用户使用
	 */
	private String labelList;

	/** 
	* ISV侧内容唯一ID
	 */
	private String outContentId;

	/** 
	* 学段
	 */
	private String periodCode;

	/** 
	* 回跳地址
	 */
	private String returnUrl;

	/** 
	* 学科
	 */
	private String subjectCode;

	/** 
	* 摘要
	 */
	private String summary;

	/** 
	* 教材版本
	 */
	private String textbookCode;

	/** 
	* 缩略图url地址
	 */
	private String thumbnail;

	/** 
	* 内容标题
	 */
	private String title;

	/** 
	* 内容总时长，单位秒
	 */
	private Long totalTime;

	/** 
	* 类型：1词汇 2课文 3题目 4考试 5知识点 6课程 7其他
	 */
	private String type;

	/** 
	* 当前用户userid
	 */
	private String userid;

	public void setClassId(Long classId) {
		this.classId = classId;
	}

	public Long getClassId() {
		return this.classId;
	}

	public void setLabelList(String labelList) {
		this.labelList = labelList;
	}

	public String getLabelList() {
		return this.labelList;
	}

	public void setOutContentId(String outContentId) {
		this.outContentId = outContentId;
	}

	public String getOutContentId() {
		return this.outContentId;
	}

	public void setPeriodCode(String periodCode) {
		this.periodCode = periodCode;
	}

	public String getPeriodCode() {
		return this.periodCode;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectCode() {
		return this.subjectCode;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setTextbookCode(String textbookCode) {
		this.textbookCode = textbookCode;
	}

	public String getTextbookCode() {
		return this.textbookCode;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getThumbnail() {
		return this.thumbnail;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTotalTime(Long totalTime) {
		this.totalTime = totalTime;
	}

	public Long getTotalTime() {
		return this.totalTime;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return this.userid;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.recommend.create";
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
		txtParams.put("class_id", this.classId);
		txtParams.put("labelList", this.labelList);
		txtParams.put("out_content_id", this.outContentId);
		txtParams.put("period_code", this.periodCode);
		txtParams.put("return_url", this.returnUrl);
		txtParams.put("subject_code", this.subjectCode);
		txtParams.put("summary", this.summary);
		txtParams.put("textbook_code", this.textbookCode);
		txtParams.put("thumbnail", this.thumbnail);
		txtParams.put("title", this.title);
		txtParams.put("totalTime", this.totalTime);
		txtParams.put("type", this.type);
		txtParams.put("userid", this.userid);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduRecommendCreateResponse> getResponseClass() {
		return OapiEduRecommendCreateResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkMaxListSize(labelList, 100, "labelList");
		RequestCheckUtils.checkNotEmpty(outContentId, "outContentId");
		RequestCheckUtils.checkNotEmpty(periodCode, "periodCode");
		RequestCheckUtils.checkNotEmpty(returnUrl, "returnUrl");
		RequestCheckUtils.checkNotEmpty(thumbnail, "thumbnail");
		RequestCheckUtils.checkNotEmpty(title, "title");
		RequestCheckUtils.checkNotEmpty(type, "type");
		RequestCheckUtils.checkNotEmpty(userid, "userid");
	}
	

}