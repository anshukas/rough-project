package ws;


public class GiftCertificate implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2858169828176629341L;
	
	private String giftCertificateId;
	
	private String gcActivationStatus;
	
	public GiftCertificate() {
	}
	
	public GiftCertificate(String giftCertificateId, String gcActivationStatus) {
		super();
		this.giftCertificateId = giftCertificateId;
		this.gcActivationStatus = gcActivationStatus;
	}

	public String getGcActivationStatus() {
		return gcActivationStatus;
	}


	public void setGcActivationStatus(String gcActivationStatus) {
		this.gcActivationStatus = gcActivationStatus;
	}


	public String getGiftCertificateId() {
		return giftCertificateId;
	}


	public void setGiftCertificateId(String giftCertificateId) {
		this.giftCertificateId = giftCertificateId;
	}

	@Override
	public String toString() {
		return "GiftCertificate [giftCertificateId=" + giftCertificateId
				+ ", gcActivationStatus=" + gcActivationStatus + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((gcActivationStatus == null) ? 0 : gcActivationStatus
						.hashCode());
		result = prime
				* result
				+ ((giftCertificateId == null) ? 0 : giftCertificateId
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiftCertificate other = (GiftCertificate) obj;
		if (gcActivationStatus == null) {
			if (other.gcActivationStatus != null)
				return false;
		} else if (!gcActivationStatus.equals(other.gcActivationStatus))
			return false;
		if (giftCertificateId == null) {
			if (other.giftCertificateId != null)
				return false;
		} else if (!giftCertificateId.equals(other.giftCertificateId))
			return false;
		return true;
	}
	
}
