package ws;

public class DeactivateGiftCertificateRes implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4238425338627474865L;
	
	private ws.GiftCertificate[] giftCertificate;
	
	private ws.Result result;
	
	public DeactivateGiftCertificateRes() {
	}
	
	public DeactivateGiftCertificateRes(GiftCertificate[] giftCertificate,
			Result result) {
		super();
		this.giftCertificate = giftCertificate;
		this.result = result;
	}

	public ws.Result getResult() {
		return result;
	}

	public void setResult(ws.Result result) {
		this.result = result;
	}


	public ws.GiftCertificate[] getGiftCertificate() {
		return giftCertificate;
	}


	public void setGiftCertificate(ws.GiftCertificate[] giftCertificate) {
		this.giftCertificate = giftCertificate;
	}
}
