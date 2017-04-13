package ws;

public class CreateGCUsingGiftCertificateGeneratorResponse implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private ws.Result result;

	public CreateGCUsingGiftCertificateGeneratorResponse() {
	}

	public CreateGCUsingGiftCertificateGeneratorResponse(Result result) {
		this.result = result;
	}

	public ws.Result getResult() {
		return result;
	}

	public void setResult(ws.Result result) {
		this.result = result;
	}
}
