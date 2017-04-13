package ws;

import java.util.Date;


public class ActivateGiftCertificateReq implements java.io.Serializable{

	private static final long serialVersionUID = 8313305439324045826L;
	
	private java.lang.String[] giftCertificateIds;
	
	private java.util.Date expirationDate;
	
	public ActivateGiftCertificateReq() {
	}

	public ActivateGiftCertificateReq(String[] giftCertificateIds,
			Date expirationDate) {
		super();
		this.giftCertificateIds = giftCertificateIds;
		this.expirationDate = expirationDate;
	}

	public java.lang.String[] getGiftCertificateIds() {
		return giftCertificateIds;
	}

	public void setGiftCertificateIds(java.lang.String[] giftCertificateIds) {
		this.giftCertificateIds = giftCertificateIds;
	}

	public java.util.Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(java.util.Date expirationDate) {
		this.expirationDate = expirationDate;
	}
}
