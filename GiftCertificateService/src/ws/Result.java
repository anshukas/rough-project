package ws;

public class Result implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String status;

	private String messages;
	 
	public Result() {
		super();
	}

	public Result(String status, String messages) {
		super();
		this.status = status;
		this.messages = messages;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}


}
