package ws;

public class ActivateGiftCertificateRequest implements java.io.Serializable{

	private static final long serialVersionUID = 8313305439324045826L;
	
	private java.lang.String[] giftCertificateIds;
	
	public ActivateGiftCertificateRequest() {
	}

	public ActivateGiftCertificateRequest(String[] giftCertificateIds) {
		super();
		this.giftCertificateIds = giftCertificateIds;
	}

	public java.lang.String[] getGiftCertificateIds() {
		return giftCertificateIds;
	}

	public void setGiftCertificateIds(java.lang.String[] giftCertificateIds) {
		this.giftCertificateIds = giftCertificateIds;
	}
}
