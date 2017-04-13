package ws;

public class CreateSingleGiftCertificateResponse implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private ws.Result result;

	public CreateSingleGiftCertificateResponse() {
		super();
	}

	public CreateSingleGiftCertificateResponse(Result result) {
		super();
		this.result = result;
	}

	public ws.Result getResult() {
		return result;
	}

	public void setResult(ws.Result result) {
		this.result = result;
	}

}
