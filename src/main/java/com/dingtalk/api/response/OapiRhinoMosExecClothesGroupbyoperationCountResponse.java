package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.mos.exec.clothes.groupbyoperation.count response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoMosExecClothesGroupbyoperationCountResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4211125489128838318L;

	/** 
	 * 返回编码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 结果
	 */
	@ApiListField("model")
	@ApiField("count_group_by_id_dto")
	private List<CountGroupByIdDto> model;


	public void setErrcode(Long errcode) {
		this.errcode = errcode;
	}
	public Long getErrcode( ) {
		return this.errcode;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	public String getErrmsg( ) {
		return this.errmsg;
	}

	public void setModel(List<CountGroupByIdDto> model) {
		this.model = model;
	}
	public List<CountGroupByIdDto> getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class CountGroupByIdDto extends TaobaoObject {
		private static final long serialVersionUID = 3165442527487961772L;
		/**
		 * 完成数量
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 工序uid
		 */
		@ApiField("id")
		private Long id;
	
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public Long getId() {
			return this.id;
		}
		public void setId(Long id) {
			this.id = id;
		}
	}
	


}
