package ws;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class GiftCertificateGeneratorReq implements java.io.Serializable {

	private static final long serialVersionUID = -7539173735407913006L;
	
	@XmlElement(name = "syncWithET", required = true)
	private java.lang.Boolean syncWithET;
	
	@XmlElement(name = "folderName", required = true)
	private java.lang.String folderName;
	
	@XmlElement(name = "valor", required = true)
    private java.math.BigDecimal valor;
	
	@XmlElement(name = "applyToShipping", required = true)
    private java.lang.Boolean applyToShipping;
    
	@XmlElement(name = "maxUses", required = true)
    private java.lang.Integer maxUses;
    
    @XmlElement(name = "noOfGiftCertificate", required = true)
    private java.lang.Integer noOfGiftCertificate;
    
    @XmlElement(name = "length", required = true)
    private java.lang.Integer length;
    
    @XmlElement(name = "origin", required = true)
    private java.lang.String origin;
    
    @XmlElement(name = "enable", required = true)
    private java.lang.Boolean enable;
    
    @XmlElement(name = "siteIds", required = true)
    private java.lang.String[] siteIds;
    
    @XmlElement(name = "prefix", required = false, nillable=true)
    private java.util.Date expirationDate;
    
    @XmlElement(name = "prefix", required = false, nillable=true)
    private java.lang.String prefix;
    
    @XmlElement(name = "suffix", required = false, nillable=true)
    private java.lang.String suffix;
    
	public GiftCertificateGeneratorReq() {
	}
	
	public GiftCertificateGeneratorReq(Boolean syncWithET, String folderName,
			BigDecimal valor, Boolean applyToShipping, Integer maxUses,
			Integer noOfGiftCertificate, Integer length, String origin,
			Boolean enable, String[] siteIds, Date expirationDate,
			String prefix, String suffix) {
		super();
		this.syncWithET = syncWithET;
		this.folderName = folderName;
		this.valor = valor;
		this.applyToShipping = applyToShipping;
		this.maxUses = maxUses;
		this.noOfGiftCertificate = noOfGiftCertificate;
		this.length = length;
		this.origin = origin;
		this.enable = enable;
		this.siteIds = siteIds;
		this.expirationDate = expirationDate;
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	public java.lang.Boolean getSyncWithET() {
		return syncWithET;
	}

	public void setSyncWithET(java.lang.Boolean syncWithET) {
		this.syncWithET = syncWithET;
	}

	public java.lang.String getFolderName() {
		return folderName;
	}

	public void setFolderName(java.lang.String folderName) {
		this.folderName = folderName;
	}

	public java.math.BigDecimal getValor() {
		return valor;
	}

	public void setValor(java.math.BigDecimal valor) {
		this.valor = valor;
	}

	public java.lang.Boolean getApplyToShipping() {
		return applyToShipping;
	}

	public void setApplyToShipping(java.lang.Boolean applyToShipping) {
		this.applyToShipping = applyToShipping;
	}

	public java.lang.Integer getMaxUses() {
		return maxUses;
	}

	public void setMaxUses(java.lang.Integer maxUses) {
		this.maxUses = maxUses;
	}

	public java.lang.Integer getNoOfGiftCertificate() {
		return noOfGiftCertificate;
	}

	public void setNoOfGiftCertificate(java.lang.Integer noOfGiftCertificate) {
		this.noOfGiftCertificate = noOfGiftCertificate;
	}

	public java.lang.Integer getLength() {
		return length;
	}

	public void setLength(java.lang.Integer length) {
		this.length = length;
	}

	public java.lang.String getPrefix() {
		return prefix;
	}

	public void setPrefix(java.lang.String prefix) {
		this.prefix = prefix;
	}

	public java.lang.String getSuffix() {
		return suffix;
	}

	public void setSuffix(java.lang.String suffix) {
		this.suffix = suffix;
	}

	public java.util.Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(java.util.Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public java.lang.String getOrigin() {
		return origin;
	}

	public void setOrigin(java.lang.String origin) {
		this.origin = origin;
	}

	public java.lang.Boolean getEnable() {
		return enable;
	}

	public void setEnable(java.lang.Boolean enable) {
		this.enable = enable;
	}


	public java.lang.String[] getSiteIds() {
		return siteIds;
	}


	public void setSiteIds(java.lang.String[] siteIds) {
		this.siteIds = siteIds;
	}

}
