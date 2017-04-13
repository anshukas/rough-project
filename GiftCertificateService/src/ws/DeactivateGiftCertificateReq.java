package ws;

import javax.xml.bind.annotation.XmlElement;


public class DeactivateGiftCertificateReq implements java.io.Serializable {

	private static final long serialVersionUID = 389735933188960221L;
	
	@XmlElement(name = "giftCertificateIds", required = true, nillable = false)
	private java.lang.String[] gcIds;

	public java.lang.String[] getGcIds() {
		return gcIds;
	}

	public void setGcIds(java.lang.String[] gcIds) {
		this.gcIds = gcIds;
	}

	public DeactivateGiftCertificateReq(String[] gcIds) {
		super();
		this.gcIds = gcIds;
	}

	public DeactivateGiftCertificateReq() {
		super();
	}

}
