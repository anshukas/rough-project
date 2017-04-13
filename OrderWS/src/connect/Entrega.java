/**
 * Entrega.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class Entrega  implements java.io.Serializable {
    private java.lang.String servicoEntrega;

    private java.lang.String numeroEntrega;

    private java.lang.String sellerID;

    private connect.StatusEntrega status;

    private java.lang.String prazoEntrega;

    private java.util.Calendar dataAgendada;

    private java.lang.Integer periodoAgendada;

    private java.math.BigDecimal valorEntrega;

    private connect.Endereco enderecoEntrega;

    public Entrega() {
    }

    public Entrega(
           java.lang.String servicoEntrega,
           java.lang.String numeroEntrega,
           java.lang.String sellerID,
           connect.StatusEntrega status,
           java.lang.String prazoEntrega,
           java.util.Calendar dataAgendada,
           java.lang.Integer periodoAgendada,
           java.math.BigDecimal valorEntrega,
           connect.Endereco enderecoEntrega) {
           this.servicoEntrega = servicoEntrega;
           this.numeroEntrega = numeroEntrega;
           this.sellerID = sellerID;
           this.status = status;
           this.prazoEntrega = prazoEntrega;
           this.dataAgendada = dataAgendada;
           this.periodoAgendada = periodoAgendada;
           this.valorEntrega = valorEntrega;
           this.enderecoEntrega = enderecoEntrega;
    }


    /**
     * Gets the servicoEntrega value for this Entrega.
     * 
     * @return servicoEntrega
     */
    public java.lang.String getServicoEntrega() {
        return servicoEntrega;
    }


    /**
     * Sets the servicoEntrega value for this Entrega.
     * 
     * @param servicoEntrega
     */
    public void setServicoEntrega(java.lang.String servicoEntrega) {
        this.servicoEntrega = servicoEntrega;
    }


    /**
     * Gets the numeroEntrega value for this Entrega.
     * 
     * @return numeroEntrega
     */
    public java.lang.String getNumeroEntrega() {
        return numeroEntrega;
    }


    /**
     * Sets the numeroEntrega value for this Entrega.
     * 
     * @param numeroEntrega
     */
    public void setNumeroEntrega(java.lang.String numeroEntrega) {
        this.numeroEntrega = numeroEntrega;
    }


    /**
     * Gets the sellerID value for this Entrega.
     * 
     * @return sellerID
     */
    public java.lang.String getSellerID() {
        return sellerID;
    }


    /**
     * Sets the sellerID value for this Entrega.
     * 
     * @param sellerID
     */
    public void setSellerID(java.lang.String sellerID) {
        this.sellerID = sellerID;
    }


    /**
     * Gets the status value for this Entrega.
     * 
     * @return status
     */
    public connect.StatusEntrega getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Entrega.
     * 
     * @param status
     */
    public void setStatus(connect.StatusEntrega status) {
        this.status = status;
    }


    /**
     * Gets the prazoEntrega value for this Entrega.
     * 
     * @return prazoEntrega
     */
    public java.lang.String getPrazoEntrega() {
        return prazoEntrega;
    }


    /**
     * Sets the prazoEntrega value for this Entrega.
     * 
     * @param prazoEntrega
     */
    public void setPrazoEntrega(java.lang.String prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }


    /**
     * Gets the dataAgendada value for this Entrega.
     * 
     * @return dataAgendada
     */
    public java.util.Calendar getDataAgendada() {
        return dataAgendada;
    }


    /**
     * Sets the dataAgendada value for this Entrega.
     * 
     * @param dataAgendada
     */
    public void setDataAgendada(java.util.Calendar dataAgendada) {
        this.dataAgendada = dataAgendada;
    }


    /**
     * Gets the periodoAgendada value for this Entrega.
     * 
     * @return periodoAgendada
     */
    public java.lang.Integer getPeriodoAgendada() {
        return periodoAgendada;
    }


    /**
     * Sets the periodoAgendada value for this Entrega.
     * 
     * @param periodoAgendada
     */
    public void setPeriodoAgendada(java.lang.Integer periodoAgendada) {
        this.periodoAgendada = periodoAgendada;
    }


    /**
     * Gets the valorEntrega value for this Entrega.
     * 
     * @return valorEntrega
     */
    public java.math.BigDecimal getValorEntrega() {
        return valorEntrega;
    }


    /**
     * Sets the valorEntrega value for this Entrega.
     * 
     * @param valorEntrega
     */
    public void setValorEntrega(java.math.BigDecimal valorEntrega) {
        this.valorEntrega = valorEntrega;
    }


    /**
     * Gets the enderecoEntrega value for this Entrega.
     * 
     * @return enderecoEntrega
     */
    public connect.Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }


    /**
     * Sets the enderecoEntrega value for this Entrega.
     * 
     * @param enderecoEntrega
     */
    public void setEnderecoEntrega(connect.Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Entrega)) return false;
        Entrega other = (Entrega) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servicoEntrega==null && other.getServicoEntrega()==null) || 
             (this.servicoEntrega!=null &&
              this.servicoEntrega.equals(other.getServicoEntrega()))) &&
            ((this.numeroEntrega==null && other.getNumeroEntrega()==null) || 
             (this.numeroEntrega!=null &&
              this.numeroEntrega.equals(other.getNumeroEntrega()))) &&
            ((this.sellerID==null && other.getSellerID()==null) || 
             (this.sellerID!=null &&
              this.sellerID.equals(other.getSellerID()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.prazoEntrega==null && other.getPrazoEntrega()==null) || 
             (this.prazoEntrega!=null &&
              this.prazoEntrega.equals(other.getPrazoEntrega()))) &&
            ((this.dataAgendada==null && other.getDataAgendada()==null) || 
             (this.dataAgendada!=null &&
              this.dataAgendada.equals(other.getDataAgendada()))) &&
            ((this.periodoAgendada==null && other.getPeriodoAgendada()==null) || 
             (this.periodoAgendada!=null &&
              this.periodoAgendada.equals(other.getPeriodoAgendada()))) &&
            ((this.valorEntrega==null && other.getValorEntrega()==null) || 
             (this.valorEntrega!=null &&
              this.valorEntrega.equals(other.getValorEntrega()))) &&
            ((this.enderecoEntrega==null && other.getEnderecoEntrega()==null) || 
             (this.enderecoEntrega!=null &&
              this.enderecoEntrega.equals(other.getEnderecoEntrega())));
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
        if (getServicoEntrega() != null) {
            _hashCode += getServicoEntrega().hashCode();
        }
        if (getNumeroEntrega() != null) {
            _hashCode += getNumeroEntrega().hashCode();
        }
        if (getSellerID() != null) {
            _hashCode += getSellerID().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPrazoEntrega() != null) {
            _hashCode += getPrazoEntrega().hashCode();
        }
        if (getDataAgendada() != null) {
            _hashCode += getDataAgendada().hashCode();
        }
        if (getPeriodoAgendada() != null) {
            _hashCode += getPeriodoAgendada().hashCode();
        }
        if (getValorEntrega() != null) {
            _hashCode += getValorEntrega().hashCode();
        }
        if (getEnderecoEntrega() != null) {
            _hashCode += getEnderecoEntrega().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrega.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Entrega"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicoEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServicoEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NumeroEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SellerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "statusEntrega"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prazoEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrazoEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAgendada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DataAgendada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodoAgendada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PeriodoAgendada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValorEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enderecoEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EnderecoEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Endereco"));
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
