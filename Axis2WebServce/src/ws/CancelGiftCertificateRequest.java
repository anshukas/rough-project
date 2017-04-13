package ws;

public class CancelGiftCertificateRequest implements java.io.Serializable {

	private static final long serialVersionUID = 389735933188960221L;
	
	private java.lang.String giftCertificate;

	public CancelGiftCertificateRequest() {
		super();
	}

	public CancelGiftCertificateRequest(String giftCertificate) {
		super();
		this.giftCertificate = giftCertificate;
	}

	public java.lang.String getGiftCertificate() {
		return giftCertificate;
	}

	public void setGiftCertificate(java.lang.String giftCertificate) {
		this.giftCertificate = giftCertificate;
	}

}
