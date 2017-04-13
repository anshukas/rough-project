package ws;

public class Message implements java.io.Serializable {

	private static final long serialVersionUID = 7722720933048126691L;
	
	private ws.MessageStatus status;

	private java.lang.String information;
	 
	public Message() {
		super();
	}

	public Message(MessageStatus status, String information) {
		super();
		this.status = status;
		this.information = information;
	}

	public ws.MessageStatus getStatus() {
		return status;
	}

	public void setStatus(ws.MessageStatus status) {
		this.status = status;
	}

	public java.lang.String getInformation() {
		return information;
	}

	public void setInformation(java.lang.String information) {
		this.information = information;
	}
	
}
