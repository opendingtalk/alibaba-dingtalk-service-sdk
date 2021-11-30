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

import com.dingtalk.api.response.OapiEduCourseSummadataListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.summadata.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.26
 */
public class OapiEduCourseSummadataListRequest extends BaseTaobaoRequest<OapiEduCourseSummadataListResponse> {
	
	

	/** 
	* 数据类别编码数组
	 */
	private String categoryCodes;

	/** 
	* 课程编码
	 */
	private String courseCode;

	/** 
	* 分页游标，从0开始
	 */
	private Long cursor;

	/** 
	* 当前操作人的用户ID
	 */
	private String opUserid;

	/** 
	* 分页大小
	 */
	private Long size;

	public void setCategoryCodes(String categoryCodes) {
		this.categoryCodes = categoryCodes;
	}

	public String getCategoryCodes() {
		return this.categoryCodes;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseCode() {
		return this.courseCode;
	}

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setOpUserid(String opUserid) {
		this.opUserid = opUserid;
	}

	public String getOpUserid() {
		return this.opUserid;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.course.summadata.list";
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
		txtParams.put("category_codes", this.categoryCodes);
		txtParams.put("course_code", this.courseCode);
		txtParams.put("cursor", this.cursor);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("size", this.size);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCourseSummadataListResponse> getResponseClass() {
		return OapiEduCourseSummadataListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(categoryCodes, "categoryCodes");
		RequestCheckUtils.checkMaxListSize(categoryCodes, 100, "categoryCodes");
		RequestCheckUtils.checkNotEmpty(courseCode, "courseCode");
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkMinValue(cursor, 0L, "cursor");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxValue(size, 100L, "size");
		RequestCheckUtils.checkMinValue(size, 1L, "size");
	}
	

}