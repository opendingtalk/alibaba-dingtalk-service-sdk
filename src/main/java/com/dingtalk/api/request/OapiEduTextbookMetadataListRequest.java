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

import com.dingtalk.api.response.OapiEduTextbookMetadataListResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.edu.textbook.metadata.list request
 * 
 * @author top auto create
 * @since 1.0, 2020.12.22
 */
public class OapiEduTextbookMetadataListRequest extends BaseTaobaoRequest<OapiEduTextbookMetadataListResponse> {
	
	

	/** 
	* 游标
	 */
	private Long cursor;

	/** 
	* 排序依赖字段类型
	 */
	private Long dataOrderType;

	/** 
	* 层级
	 */
	private Long level;

	/** 
	* 用户id
	 */
	private String opUserId;

	/** 
	* 父教材id
	 */
	private Long parentId;

	/** 
	* 每页条数
	 */
	private Long size;

	/** 
	* 排序规则（0:升序，1:降序）
	 */
	private Long sortType;

	/** 
	* 学科编码
	 */
	private String subjectCode;

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setDataOrderType(Long dataOrderType) {
		this.dataOrderType = dataOrderType;
	}

	public Long getDataOrderType() {
		return this.dataOrderType;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	public Long getLevel() {
		return this.level;
	}

	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
	}

	public String getOpUserId() {
		return this.opUserId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getSize() {
		return this.size;
	}

	public void setSortType(Long sortType) {
		this.sortType = sortType;
	}

	public Long getSortType() {
		return this.sortType;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectCode() {
		return this.subjectCode;
	}

	public String getApiMethodName() {
		return "dingtalk.oapi.edu.textbook.metadata.list";
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
		txtParams.put("cursor", this.cursor);
		txtParams.put("data_order_type", this.dataOrderType);
		txtParams.put("level", this.level);
		txtParams.put("op_user_id", this.opUserId);
		txtParams.put("parent_id", this.parentId);
		txtParams.put("size", this.size);
		txtParams.put("sort_type", this.sortType);
		txtParams.put("subject_code", this.subjectCode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<OapiEduTextbookMetadataListResponse> getResponseClass() {
		return OapiEduTextbookMetadataListResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(cursor, "cursor");
		RequestCheckUtils.checkNotEmpty(opUserId, "opUserId");
		RequestCheckUtils.checkNotEmpty(size, "size");
		RequestCheckUtils.checkNotEmpty(subjectCode, "subjectCode");
	}
	

}