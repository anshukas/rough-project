package ws;


public class CancelGiftCertificateRequest implements java.io.Serializable {

	private static final long serialVersionUID = 389735933188960221L;
	
	private java.lang.String[] gcIds;

	public java.lang.String[] getGcIds() {
		return gcIds;
	}

	public void setGcIds(java.lang.String[] gcIds) {
		this.gcIds = gcIds;
	}

	public CancelGiftCertificateRequest(String[] gcIds) {
		super();
		this.gcIds = gcIds;
	}

	public CancelGiftCertificateRequest() {
		super();
	}

}
