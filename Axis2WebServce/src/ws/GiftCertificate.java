package ws;

import java.math.BigDecimal;

public class GiftCertificate implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private java.lang.String id;
	
	private java.math.BigDecimal amount;
	
	public GiftCertificate() {
		super();
	}

	public GiftCertificate(String id, BigDecimal amount) {
		super();
		this.id = id;
		this.amount = amount;
	}

	public java.lang.String getId() {
		return id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.math.BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(java.math.BigDecimal amount) {
		this.amount = amount;
	}
	
}
