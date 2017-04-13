package ws;

public class Result implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private ws.Status status;

	 private ws.Message[] messages;
	 
	public Result() {
		super();
	}

	public Result(Status status, Message[] messages) {
		super();
		this.status = status;
		this.messages = messages;
	}

	public ws.Status getStatus() {
		return status;
	}

	public void setStatus(ws.Status status) {
		this.status = status;
	}

	public ws.Message[] getMessages() {
		return messages;
	}

	public void setMessages(ws.Message[] messages) {
		this.messages = messages;
	}
}
