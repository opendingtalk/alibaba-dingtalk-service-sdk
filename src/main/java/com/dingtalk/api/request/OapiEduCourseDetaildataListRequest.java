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

import com.dingtalk.api.response.OapiEduCourseDetaildataListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.course.detaildata.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.10.26
 */
public class OapiEduCourseDetaildataListRequest extends BaseTaobaoRequest<OapiEduCourseDetaildataListResponse> {
	
	

	/** 
	* 数据类别编码
	 */
	private String categoryCode;

	/** 
	* 课程编码
	 */
	private String courseCode;

	/** 
	* 分页游标，从0开始
	 */
	private Long cursor;

	/** 
	* 数据因子编码数组，不填的话自动填充类别下全部的明细因子
	 */
	private String factorCodes;

	/** 
	* 当前操作人的用户ID
	 */
	private String opUserid;

	/** 
	* 分页大小
	 */
	private Long size;

	/** 
	* 需要获取的用户CropId（必须和用户ID同时传值或同时为空）
	 */
	private String userCropid;

	/** 
	* 需要获取的用户ID
	 */
	private String userIds;

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryCode() {
		return this.categoryCode;
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

	public void setFactorCodes(String factorCodes) {
		this.factorCodes = factorCodes;
	}

	public String getFactorCodes() {
		return this.factorCodes;
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

	public void setUserCropid(String userCropid) {
		this.userCropid = userCropid;
	}

	public String getUserCropid() {
		return this.userCropid;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public String getUserIds() {
		return this.userIds;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.course.detaildata.list";
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
		txtParams.put("category_code", this.categoryCode);
		txtParams.put("course_code", this.courseCode);
		txtParams.put("cursor", this.cursor);
		txtParams.put("factor_codes", this.factorCodes);
		txtParams.put("op_userid", this.opUserid);
		txtParams.put("size", this.size);
		txtParams.put("user_cropid", this.userCropid);
		txtParams.put("user_ids", this.userIds);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduCourseDetaildataListResponse> getResponseClass() {
		return OapiEduCourseDetaildataListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(categoryCode, "categoryCode");
		RequestCheckUtils.checkNotEmpty(courseCode, "courseCode");
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkMinValue(cursor, 0L, "cursor");
		RequestCheckUtils.checkMaxListSize(factorCodes, 100, "factorCodes");
		RequestCheckUtils.checkNotEmpty(opUserid, "opUserid");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkMaxValue(size, 100L, "size");
		RequestCheckUtils.checkMinValue(size, 1L, "size");
		RequestCheckUtils.checkMaxListSize(userIds, 100, "userIds");
	}
	

}