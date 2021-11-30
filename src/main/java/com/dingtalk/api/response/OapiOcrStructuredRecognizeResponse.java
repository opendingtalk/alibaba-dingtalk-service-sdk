package com.dingtalk.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.ocr.structured.recognize response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiOcrStructuredRecognizeResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4448245768326565378L;

	/** 
	 * 错误码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 错误描述
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 识别结果
	 */
	@ApiField("result")
	private OcrStructuredResult result;


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

	public void setResult(OcrStructuredResult result) {
		this.result = result;
	}
	public OcrStructuredResult getResult( ) {
		return this.result;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 识别结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class OcrStructuredResult extends TaobaoObject {
		private static final long serialVersionUID = 7776153889974425679L;
		/**
		 * 旋转度
		 */
		@ApiField("angle")
		private Long angle;
		/**
		 * 图片识别内容json字符串，不同的类型有不同的字段，例如身份证{"姓名":"王xx","性别":"男","民族":"汉","出生日期":"1986年1月9日","住址":"四川省攀枝xxxx","身份证号码":"5101241988xxxxx"}
		 */
		@ApiField("data")
		private String data;
		/**
		 * 旋转后图片高度
		 */
		@ApiField("height")
		private Long height;
		/**
		 * 原始图片高度
		 */
		@ApiField("original_height")
		private Long originalHeight;
		/**
		 * 原始图片宽度
		 */
		@ApiField("original_width")
		private Long originalWidth;
		/**
		 * 旋转后图片宽度
		 */
		@ApiField("width")
		private Long width;
	
		public Long getAngle() {
			return this.angle;
		}
		public void setAngle(Long angle) {
			this.angle = angle;
		}
		public String getData() {
			return this.data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public Long getHeight() {
			return this.height;
		}
		public void setHeight(Long height) {
			this.height = height;
		}
		public Long getOriginalHeight() {
			return this.originalHeight;
		}
		public void setOriginalHeight(Long originalHeight) {
			this.originalHeight = originalHeight;
		}
		public Long getOriginalWidth() {
			return this.originalWidth;
		}
		public void setOriginalWidth(Long originalWidth) {
			this.originalWidth = originalWidth;
		}
		public Long getWidth() {
			return this.width;
		}
		public void setWidth(Long width) {
			this.width = width;
		}
	}
	


}
