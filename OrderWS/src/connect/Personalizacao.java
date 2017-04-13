/**
 * Personalizacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class Personalizacao  implements java.io.Serializable {
    private java.lang.String personaDescricao;

    private java.lang.String personaSku;

    private java.math.BigDecimal personaValor;

    public Personalizacao() {
    }

    public Personalizacao(
           java.lang.String personaDescricao,
           java.lang.String personaSku,
           java.math.BigDecimal personaValor) {
           this.personaDescricao = personaDescricao;
           this.personaSku = personaSku;
           this.personaValor = personaValor;
    }


    /**
     * Gets the personaDescricao value for this Personalizacao.
     * 
     * @return personaDescricao
     */
    public java.lang.String getPersonaDescricao() {
        return personaDescricao;
    }


    /**
     * Sets the personaDescricao value for this Personalizacao.
     * 
     * @param personaDescricao
     */
    public void setPersonaDescricao(java.lang.String personaDescricao) {
        this.personaDescricao = personaDescricao;
    }


    /**
     * Gets the personaSku value for this Personalizacao.
     * 
     * @return personaSku
     */
    public java.lang.String getPersonaSku() {
        return personaSku;
    }


    /**
     * Sets the personaSku value for this Personalizacao.
     * 
     * @param personaSku
     */
    public void setPersonaSku(java.lang.String personaSku) {
        this.personaSku = personaSku;
    }


    /**
     * Gets the personaValor value for this Personalizacao.
     * 
     * @return personaValor
     */
    public java.math.BigDecimal getPersonaValor() {
        return personaValor;
    }


    /**
     * Sets the personaValor value for this Personalizacao.
     * 
     * @param personaValor
     */
    public void setPersonaValor(java.math.BigDecimal personaValor) {
        this.personaValor = personaValor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Personalizacao)) return false;
        Personalizacao other = (Personalizacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.personaDescricao==null && other.getPersonaDescricao()==null) || 
             (this.personaDescricao!=null &&
              this.personaDescricao.equals(other.getPersonaDescricao()))) &&
            ((this.personaSku==null && other.getPersonaSku()==null) || 
             (this.personaSku!=null &&
              this.personaSku.equals(other.getPersonaSku()))) &&
            ((this.personaValor==null && other.getPersonaValor()==null) || 
             (this.personaValor!=null &&
              this.personaValor.equals(other.getPersonaValor())));
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
        if (getPersonaDescricao() != null) {
            _hashCode += getPersonaDescricao().hashCode();
        }
        if (getPersonaSku() != null) {
            _hashCode += getPersonaSku().hashCode();
        }
        if (getPersonaValor() != null) {
            _hashCode += getPersonaValor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Personalizacao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Personalizacao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personaDescricao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PersonaDescricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personaSku");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PersonaSku"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personaValor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PersonaValor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
