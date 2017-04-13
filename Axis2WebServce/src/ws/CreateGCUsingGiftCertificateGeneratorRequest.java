package ws;

import java.math.BigDecimal;
import java.util.Date;

public class CreateGCUsingGiftCertificateGeneratorRequest implements java.io.Serializable {

	private static final long serialVersionUID = -7539173735407913006L;
	
	private java.lang.Boolean syncWithET;
	
	private java.lang.String folderName;

    private java.math.BigDecimal valor;

    private java.lang.Boolean applyToShipping;
    
    private java.lang.Integer maxUses;
    
    private java.lang.Integer noOfGiftCertificate;
    
    private java.lang.Integer length;
    
    private java.lang.String prefix;
    
    private java.lang.String loja;
    
    private java.lang.String suffix;
    
    private java.util.Date expirationDate;
    
    private ws.Origin origin;

	public CreateGCUsingGiftCertificateGeneratorRequest() {
	}

	public CreateGCUsingGiftCertificateGeneratorRequest(Boolean syncWithET,
			String folderName, BigDecimal valor, Boolean applyToShipping,
			Integer maxUses, Integer noOfGiftCertificate, Integer length,
			String prefix, String loja, String suffix, Date expirationDate,
			Origin origin) {
		super();
		this.syncWithET = syncWithET;
		this.folderName = folderName;
		this.valor = valor;
		this.applyToShipping = applyToShipping;
		this.maxUses = maxUses;
		this.noOfGiftCertificate = noOfGiftCertificate;
		this.length = length;
		this.prefix = prefix;
		this.loja = loja;
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

	public java.lang.String getLoja() {
		return loja;
	}

	public void setLoja(java.lang.String loja) {
		this.loja = loja;
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

	public ws.Origin getOrigin() {
		return origin;
	}

	public void setOrigin(ws.Origin origin) {
		this.origin = origin;
	}
    
}
