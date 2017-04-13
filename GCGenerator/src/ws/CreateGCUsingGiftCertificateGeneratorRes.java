package ws;

public class CreateGCUsingGiftCertificateGeneratorRes implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private ws.Result result;

	public CreateGCUsingGiftCertificateGeneratorRes() {
	}

	public CreateGCUsingGiftCertificateGeneratorRes(Result result) {
		this.result = result;
	}

	public ws.Result getResult() {
		return result;
	}

	public void setResult(ws.Result result) {
		this.result = result;
	}
}
