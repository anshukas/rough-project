package ws;

import java.math.BigDecimal;

public class CreateSingleGiftCertificateRequest implements java.io.Serializable{

	private static final long serialVersionUID = 7457843504804099618L;
	
	private java.lang.String ids;
	
	private java.math.BigDecimal amount;
	
	private java.lang.String siteIds;
	
	public CreateSingleGiftCertificateRequest() {
		super();
	}

	public CreateSingleGiftCertificateRequest(String ids, String siteIds,
			BigDecimal amount) {
		super();
		this.ids = ids;
		this.siteIds = siteIds;
		this.amount = amount;
	}

	public java.lang.String getIds() {
		return ids;
	}

	public void setIds(java.lang.String ids) {
		this.ids = ids;
	}

	public java.lang.String getSiteIds() {
		return siteIds;
	}

	public void setSiteIds(java.lang.String siteIds) {
		this.siteIds = siteIds;
	}

	public java.math.BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(java.math.BigDecimal amount) {
		this.amount = amount;
	}
	
	
}
