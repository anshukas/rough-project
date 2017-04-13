package ws;

import java.math.BigDecimal;

public class GiftCertificate implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private java.lang.String gcId;
	
	public GiftCertificate() {
		super();
	}
	
	public GiftCertificate(String gcId, BigDecimal amount) {
		super();
		this.gcId = gcId;
	}

	public java.lang.String getGcId() {
		return gcId;
	}

	public void setGcId(java.lang.String gcId) {
		this.gcId = gcId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gcId == null) ? 0 : gcId.hashCode());
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
		if (gcId == null) {
			if (other.gcId != null)
				return false;
		} else if (!gcId.equals(other.gcId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GiftCertificate [gcId=" + gcId + "]";
	}
	
	
}
