/**
 * Cartao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class Cartao  implements java.io.Serializable {
    private java.lang.String numero;

    private java.lang.String seguranca;

    private java.lang.String titular;

    private java.lang.String validadeMes;

    private java.lang.String validadeAno;

    private java.lang.String bandeira;

    private int numeroParcelas;

    private java.math.BigDecimal valor;

    private java.lang.String token;

    private int optIn;

    public Cartao() {
    }

    public Cartao(
           java.lang.String numero,
           java.lang.String seguranca,
           java.lang.String titular,
           java.lang.String validadeMes,
           java.lang.String validadeAno,
           java.lang.String bandeira,
           int numeroParcelas,
           java.math.BigDecimal valor,
           java.lang.String token,
           int optIn) {
           this.numero = numero;
           this.seguranca = seguranca;
           this.titular = titular;
           this.validadeMes = validadeMes;
           this.validadeAno = validadeAno;
           this.bandeira = bandeira;
           this.numeroParcelas = numeroParcelas;
           this.valor = valor;
           this.token = token;
           this.optIn = optIn;
    }


    /**
     * Gets the numero value for this Cartao.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Cartao.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the seguranca value for this Cartao.
     * 
     * @return seguranca
     */
    public java.lang.String getSeguranca() {
        return seguranca;
    }


    /**
     * Sets the seguranca value for this Cartao.
     * 
     * @param seguranca
     */
    public void setSeguranca(java.lang.String seguranca) {
        this.seguranca = seguranca;
    }


    /**
     * Gets the titular value for this Cartao.
     * 
     * @return titular
     */
    public java.lang.String getTitular() {
        return titular;
    }


    /**
     * Sets the titular value for this Cartao.
     * 
     * @param titular
     */
    public void setTitular(java.lang.String titular) {
        this.titular = titular;
    }


    /**
     * Gets the validadeMes value for this Cartao.
     * 
     * @return validadeMes
     */
    public java.lang.String getValidadeMes() {
        return validadeMes;
    }


    /**
     * Sets the validadeMes value for this Cartao.
     * 
     * @param validadeMes
     */
    public void setValidadeMes(java.lang.String validadeMes) {
        this.validadeMes = validadeMes;
    }


    /**
     * Gets the validadeAno value for this Cartao.
     * 
     * @return validadeAno
     */
    public java.lang.String getValidadeAno() {
        return validadeAno;
    }


    /**
     * Sets the validadeAno value for this Cartao.
     * 
     * @param validadeAno
     */
    public void setValidadeAno(java.lang.String validadeAno) {
        this.validadeAno = validadeAno;
    }


    /**
     * Gets the bandeira value for this Cartao.
     * 
     * @return bandeira
     */
    public java.lang.String getBandeira() {
        return bandeira;
    }


    /**
     * Sets the bandeira value for this Cartao.
     * 
     * @param bandeira
     */
    public void setBandeira(java.lang.String bandeira) {
        this.bandeira = bandeira;
    }


    /**
     * Gets the numeroParcelas value for this Cartao.
     * 
     * @return numeroParcelas
     */
    public int getNumeroParcelas() {
        return numeroParcelas;
    }


    /**
     * Sets the numeroParcelas value for this Cartao.
     * 
     * @param numeroParcelas
     */
    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }


    /**
     * Gets the valor value for this Cartao.
     * 
     * @return valor
     */
    public java.math.BigDecimal getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this Cartao.
     * 
     * @param valor
     */
    public void setValor(java.math.BigDecimal valor) {
        this.valor = valor;
    }


    /**
     * Gets the token value for this Cartao.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this Cartao.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the optIn value for this Cartao.
     * 
     * @return optIn
     */
    public int getOptIn() {
        return optIn;
    }


    /**
     * Sets the optIn value for this Cartao.
     * 
     * @param optIn
     */
    public void setOptIn(int optIn) {
        this.optIn = optIn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cartao)) return false;
        Cartao other = (Cartao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.seguranca==null && other.getSeguranca()==null) || 
             (this.seguranca!=null &&
              this.seguranca.equals(other.getSeguranca()))) &&
            ((this.titular==null && other.getTitular()==null) || 
             (this.titular!=null &&
              this.titular.equals(other.getTitular()))) &&
            ((this.validadeMes==null && other.getValidadeMes()==null) || 
             (this.validadeMes!=null &&
              this.validadeMes.equals(other.getValidadeMes()))) &&
            ((this.validadeAno==null && other.getValidadeAno()==null) || 
             (this.validadeAno!=null &&
              this.validadeAno.equals(other.getValidadeAno()))) &&
            ((this.bandeira==null && other.getBandeira()==null) || 
             (this.bandeira!=null &&
              this.bandeira.equals(other.getBandeira()))) &&
            this.numeroParcelas == other.getNumeroParcelas() &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            this.optIn == other.getOptIn();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getSeguranca() != null) {
            _hashCode += getSeguranca().hashCode();
        }
        if (getTitular() != null) {
            _hashCode += getTitular().hashCode();
        }
        if (getValidadeMes() != null) {
            _hashCode += getValidadeMes().hashCode();
        }
        if (getValidadeAno() != null) {
            _hashCode += getValidadeAno().hashCode();
        }
        if (getBandeira() != null) {
            _hashCode += getBandeira().hashCode();
        }
        _hashCode += getNumeroParcelas();
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        _hashCode += getOptIn();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cartao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Cartao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seguranca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Seguranca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Titular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validadeMes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidadeMes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validadeAno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidadeAno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandeira");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Bandeira"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroParcelas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumeroParcelas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optIn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OptIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
