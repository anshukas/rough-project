package ws;

import java.util.Set;

public class ActivateGiftCertificateRequest implements java.io.Serializable{

	private static final long serialVersionUID = 8313305439324045826L;
	
	private java.util.Set<GiftCertificate> giftCertificate;
	
	public ActivateGiftCertificateRequest() {
	}

	public ActivateGiftCertificateRequest(Set<GiftCertificate> giftCertificate) {
		super();
		this.giftCertificate = giftCertificate;
	}

	public java.util.Set<GiftCertificate> getGiftCertificate() {
		return giftCertificate;
	}

	public void setGiftCertificate(java.util.Set<GiftCertificate> giftCertificate) {
		this.giftCertificate = giftCertificate;
	}
	
	

}
