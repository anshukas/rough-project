package ws;

public class ActivateGiftCertificateRes implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5672331925390293736L;
	
	private ws.GiftCertificate[] giftCertificate;
	
	private ws.Result result;
	
	public ActivateGiftCertificateRes() {
	}
	
	public ActivateGiftCertificateRes(GiftCertificate[] giftCertificate,
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
