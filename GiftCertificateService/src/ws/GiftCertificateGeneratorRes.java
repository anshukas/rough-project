package ws;

public class GiftCertificateGeneratorRes implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private String[] giftCertificateIds;
	
	private String folderId;
	
	private ws.Result result;

	public GiftCertificateGeneratorRes() {
	}
	
	public GiftCertificateGeneratorRes(
			String[] giftCertificateIds, String folderId, Result result) {
		super();
		this.giftCertificateIds = giftCertificateIds;
		this.folderId = folderId;
		this.result = result;
	}

	public ws.Result getResult() {
		return result;
	}

	public void setResult(ws.Result result) {
		this.result = result;
	}
	
	public String[] getGiftCertificateIds() {
		return giftCertificateIds;
	}

	public void setGiftCertificateIds(String[] giftCertificateIds) {
		this.giftCertificateIds = giftCertificateIds;
	}

	public String getFolderId() {
		return folderId;
	}

	public void setFolderId(String folderId) {
		this.folderId = folderId;
	}
}
