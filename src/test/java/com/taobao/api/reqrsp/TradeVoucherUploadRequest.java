package com.taobao.api.reqrsp;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

public class TradeVoucherUploadRequest extends BaseTaobaoRequest<TradeVoucherUploadResponse> implements TaobaoUploadRequest<TradeVoucherUploadResponse> {

	private String fileName;

	private FileItem fileData;

	private String sellerNick;

	private String buyerNick;

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public FileItem getFileData() {
		return this.fileData;
	}

	public void setFileData(FileItem fileData) {
		this.fileData = fileData;
	}

	public String getSellerNick() {
		return this.sellerNick;
	}

	public void setSellerNick(String sellerNick) {
		this.sellerNick = sellerNick;
	}

	public String getBuyerNick() {
		return this.buyerNick;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}

	public String getApiMethodName() {
		return "taobao.trade.voucher.upload";
	}

	public String getContentType() {
		return null;
	}

	public String getResponseType() {
		return null;
	}

	public String getApiVersion() {
		return null;
	}

	public String getApiCallType() {
		return null;
	}

	public String getHttpMethod() {
		return null;
	}

	public Map<String, String> getTextParams() {
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("file_name", this.fileName);
		txtParams.put("seller_nick", this.sellerNick);
		txtParams.put("buyer_nick", this.buyerNick);
		return txtParams;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> fileParams = new HashMap<String, FileItem>();
		fileParams.put("file_data", this.fileData);
		return fileParams;
	}

	public Class<TradeVoucherUploadResponse> getResponseClass() {
		return TradeVoucherUploadResponse.class;
	}

	public void check() throws ApiRuleException {
	}

}
