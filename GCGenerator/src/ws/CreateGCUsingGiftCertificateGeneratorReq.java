package ws;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateGCUsingGiftCertificateGeneratorReq", propOrder = {
    "syncWithET",
    "folderName",
    "valor",
    "applyToShipping",
    "maxUses",
    "noOfGiftCertificate",
    "length",
    "prefix",
    "siteIds",
    "suffix",
    "expirationDate",
    "origin"
})
public class CreateGCUsingGiftCertificateGeneratorReq implements java.io.Serializable {

	private static final long serialVersionUID = -7539173735407913006L;
	
	@XmlElement(name = "syncWithET", required = true, nillable = true)
	private java.lang.Boolean syncWithET;
	
	private java.lang.String folderName;
	
	@XmlElement(name = "valor", required = true, nillable = true)
    private java.math.BigDecimal valor;
	
	@XmlElement(name = "applyToShipping", required = true, nillable = true)
    private java.lang.Boolean applyToShipping;
    
	@XmlElement(name = "maxUses", required = true, nillable = true)
    private java.lang.Integer maxUses;
    
    @XmlElement(name = "noOfGiftCertificate", required = true, nillable = true)
    private java.lang.Integer noOfGiftCertificate;
    
    @XmlElement(name = "length", required = true, nillable = true)
    private java.lang.Integer length;
    
    private java.lang.String prefix;
    
    @XmlElement(name = "siteIds", required = true, nillable = true)
    private java.lang.String siteIds;
    
    private java.lang.String suffix;
    
    private java.util.Date expirationDate;
    
    @XmlElement(name = "origin", required = true, nillable = true)
    private java.lang.String origin;

	public CreateGCUsingGiftCertificateGeneratorReq() {
	}

	public CreateGCUsingGiftCertificateGeneratorReq(Boolean syncWithET,
			String folderName, BigDecimal valor, Boolean applyToShipping,
			Integer maxUses, Integer noOfGiftCertificate, Integer length,
			String prefix, String siteIds, String suffix, Date expirationDate,
			java.lang.String origin) {
		super();
		this.syncWithET = syncWithET;
		this.folderName = folderName;
		this.valor = valor;
		this.applyToShipping = applyToShipping;
		this.maxUses = maxUses;
		this.noOfGiftCertificate = noOfGiftCertificate;
		this.length = length;
		this.prefix = prefix;
		this.siteIds = siteIds;
		this.suffix = suffix;
		this.expirationDate = expirationDate;
		this.origin = origin;
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

	public java.lang.String getSiteIds() {
		return siteIds;
	}

	public void setSiteIds(java.lang.String siteIds) {
		this.siteIds = siteIds;
	}

	@Override
	public String toString() {
		return "CreateGCUsingGiftCertificateGeneratorReq [syncWithET="
				+ syncWithET + ", folderName=" + folderName + ", valor="
				+ valor + ", applyToShipping=" + applyToShipping + ", maxUses="
				+ maxUses + ", noOfGiftCertificate=" + noOfGiftCertificate
				+ ", length=" + length + ", prefix=" + prefix + ", siteIds="
				+ siteIds + ", suffix=" + suffix + ", expirationDate="
				+ expirationDate + ", origin=" + origin + "]";
	}
    
}
