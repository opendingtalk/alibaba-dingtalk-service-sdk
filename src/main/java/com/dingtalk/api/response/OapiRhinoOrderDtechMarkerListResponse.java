package com.dingtalk.api.response;

import java.util.List;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;
import com.taobao.api.TaobaoObject;

import com.taobao.api.TaobaoResponse;

/**
 * TOP DingTalk-API: dingtalk.oapi.rhino.order.dtech.marker.list response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class OapiRhinoOrderDtechMarkerListResponse extends TaobaoResponse {

	private static final long serialVersionUID = 8715277196243553463L;

	/** 
	 * 钉钉响应码
	 */
	@ApiField("errcode")
	private Long errcode;

	/** 
	 * 响应信息
	 */
	@ApiField("errmsg")
	private String errmsg;

	/** 
	 * 额外的错误信息
	 */
	@ApiField("external_msg_info")
	private String externalMsgInfo;

	/** 
	 * 返回结果
	 */
	@ApiListField("model")
	@ApiField("marker_and_marker_fabric_item")
	private List<MarkerAndMarkerFabricItem> model;


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

	public void setExternalMsgInfo(String externalMsgInfo) {
		this.externalMsgInfo = externalMsgInfo;
	}
	public String getExternalMsgInfo( ) {
		return this.externalMsgInfo;
	}

	public void setModel(List<MarkerAndMarkerFabricItem> model) {
		this.model = model;
	}
	public List<MarkerAndMarkerFabricItem> getModel( ) {
		return this.model;
	}

	public boolean isSuccess() {
        return getErrcode() == null || getErrcode().equals(0L);
    }
	
	/**
	 * 层列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class IndexCountDto extends TaobaoObject {
		private static final long serialVersionUID = 3878895127745598952L;
		/**
		 * 层数
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 床次
		 */
		@ApiField("index")
		private Long index;
	
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public Long getIndex() {
			return this.index;
		}
		public void setIndex(Long index) {
			this.index = index;
		}
	}
	
	/**
	 * 尺码分布
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class SizeCountDto extends TaobaoObject {
		private static final long serialVersionUID = 7545997924511366535L;
		/**
		 * key的bizId
		 */
		@ApiField("biz_id_size_key")
		private String bizIdSizeKey;
		/**
		 * 当前尺码号对应的裁片数量
		 */
		@ApiField("count")
		private Long count;
		/**
		 * 尺码号
		 */
		@ApiField("size")
		private String size;
	
		public String getBizIdSizeKey() {
			return this.bizIdSizeKey;
		}
		public void setBizIdSizeKey(String bizIdSizeKey) {
			this.bizIdSizeKey = bizIdSizeKey;
		}
		public Long getCount() {
			return this.count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public String getSize() {
			return this.size;
		}
		public void setSize(String size) {
			this.size = size;
		}
	}
	
	/**
	 * 唛架床列表
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DtechMarkerBedDto extends TaobaoObject {
		private static final long serialVersionUID = 1171924974744782496L;
		/**
		 * 唛架床次编号
		 */
		@ApiField("biz_id_marker_bed")
		private String bizIdMarkerBed;
		/**
		 * 长度
		 */
		@ApiField("breadth")
		private String breadth;
		/**
		 * 层列表
		 */
		@ApiListField("layer_list")
		@ApiField("index_count_dto")
		private List<IndexCountDto> layerList;
		/**
		 * 长度
		 */
		@ApiField("length")
		private String length;
		/**
		 * 排料文件ID
		 */
		@ApiField("marker_bed_biz_id_file")
		private String markerBedBizIdFile;
		/**
		 * 唛架图文件名
		 */
		@ApiField("marker_bed_file_original_name")
		private String markerBedFileOriginalName;
		/**
		 * 排料文件URL
		 */
		@ApiField("marker_bed_url")
		private String markerBedUrl;
		/**
		 * 尺码分布
		 */
		@ApiListField("sizeList")
		@ApiField("size_count_dto")
		private List<SizeCountDto> sizeList;
		/**
		 * 铺布速度
		 */
		@ApiField("speed")
		private String speed;
		/**
		 * 铺布张力
		 */
		@ApiField("tension")
		private String tension;
	
		public String getBizIdMarkerBed() {
			return this.bizIdMarkerBed;
		}
		public void setBizIdMarkerBed(String bizIdMarkerBed) {
			this.bizIdMarkerBed = bizIdMarkerBed;
		}
		public String getBreadth() {
			return this.breadth;
		}
		public void setBreadth(String breadth) {
			this.breadth = breadth;
		}
		public List<IndexCountDto> getLayerList() {
			return this.layerList;
		}
		public void setLayerList(List<IndexCountDto> layerList) {
			this.layerList = layerList;
		}
		public String getLength() {
			return this.length;
		}
		public void setLength(String length) {
			this.length = length;
		}
		public String getMarkerBedBizIdFile() {
			return this.markerBedBizIdFile;
		}
		public void setMarkerBedBizIdFile(String markerBedBizIdFile) {
			this.markerBedBizIdFile = markerBedBizIdFile;
		}
		public String getMarkerBedFileOriginalName() {
			return this.markerBedFileOriginalName;
		}
		public void setMarkerBedFileOriginalName(String markerBedFileOriginalName) {
			this.markerBedFileOriginalName = markerBedFileOriginalName;
		}
		public String getMarkerBedUrl() {
			return this.markerBedUrl;
		}
		public void setMarkerBedUrl(String markerBedUrl) {
			this.markerBedUrl = markerBedUrl;
		}
		public List<SizeCountDto> getSizeList() {
			return this.sizeList;
		}
		public void setSizeList(List<SizeCountDto> sizeList) {
			this.sizeList = sizeList;
		}
		public String getSpeed() {
			return this.speed;
		}
		public void setSpeed(String speed) {
			this.speed = speed;
		}
		public String getTension() {
			return this.tension;
		}
		public void setTension(String tension) {
			this.tension = tension;
		}
	}
	
	/**
	 * 唛架面料信息
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class DtechMarkerFabricDto extends TaobaoObject {
		private static final long serialVersionUID = 6631212257571124713L;
		/**
		 * 颜色编号
		 */
		@ApiField("biz_id_color")
		private String bizIdColor;
		/**
		 * 面料编号
		 */
		@ApiField("biz_id_fabric")
		private String bizIdFabric;
		/**
		 * 唛架面料编号
		 */
		@ApiField("biz_id_marker_fabric")
		private String bizIdMarkerFabric;
		/**
		 * 颜色名称
		 */
		@ApiField("color_name")
		private String colorName;
		/**
		 * 面料名称
		 */
		@ApiField("fabric_name")
		private String fabricName;
	
		public String getBizIdColor() {
			return this.bizIdColor;
		}
		public void setBizIdColor(String bizIdColor) {
			this.bizIdColor = bizIdColor;
		}
		public String getBizIdFabric() {
			return this.bizIdFabric;
		}
		public void setBizIdFabric(String bizIdFabric) {
			this.bizIdFabric = bizIdFabric;
		}
		public String getBizIdMarkerFabric() {
			return this.bizIdMarkerFabric;
		}
		public void setBizIdMarkerFabric(String bizIdMarkerFabric) {
			this.bizIdMarkerFabric = bizIdMarkerFabric;
		}
		public String getColorName() {
			return this.colorName;
		}
		public void setColorName(String colorName) {
			this.colorName = colorName;
		}
		public String getFabricName() {
			return this.fabricName;
		}
		public void setFabricName(String fabricName) {
			this.fabricName = fabricName;
		}
	}
	
	/**
	 * 返回结果
	 *
	 * @author top auto create
	 * @since 1.0, null
	 */
	public static class MarkerAndMarkerFabricItem extends TaobaoObject {
		private static final long serialVersionUID = 2686412629875415226L;
		/**
		 * 唛架床列表
		 */
		@ApiListField("dtech_marker_bed_list")
		@ApiField("dtech_marker_bed_dto")
		private List<DtechMarkerBedDto> dtechMarkerBedList;
		/**
		 * 唛架面料信息
		 */
		@ApiField("dtech_marker_fabric")
		private DtechMarkerFabricDto dtechMarkerFabric;
	
		public List<DtechMarkerBedDto> getDtechMarkerBedList() {
			return this.dtechMarkerBedList;
		}
		public void setDtechMarkerBedList(List<DtechMarkerBedDto> dtechMarkerBedList) {
			this.dtechMarkerBedList = dtechMarkerBedList;
		}
		public DtechMarkerFabricDto getDtechMarkerFabric() {
			return this.dtechMarkerFabric;
		}
		public void setDtechMarkerFabric(DtechMarkerFabricDto dtechMarkerFabric) {
			this.dtechMarkerFabric = dtechMarkerFabric;
		}
	}
	


}
