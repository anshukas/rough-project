/**
 * Debito.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class Debito  implements java.io.Serializable {
    private java.util.Calendar dataPagamento;

    private java.lang.String observacao;

    private java.lang.String nsu;

    private java.lang.String tid;

    private java.lang.String codAutorizacao;

    private java.lang.String mensagemTransacao;

    private java.lang.String codRetorno;

    private java.lang.String administradora;

    public Debito() {
    }

    public Debito(
           java.util.Calendar dataPagamento,
           java.lang.String observacao,
           java.lang.String nsu,
           java.lang.String tid,
           java.lang.String codAutorizacao,
           java.lang.String mensagemTransacao,
           java.lang.String codRetorno,
           java.lang.String administradora) {
           this.dataPagamento = dataPagamento;
           this.observacao = observacao;
           this.nsu = nsu;
           this.tid = tid;
           this.codAutorizacao = codAutorizacao;
           this.mensagemTransacao = mensagemTransacao;
           this.codRetorno = codRetorno;
           this.administradora = administradora;
    }


    /**
     * Gets the dataPagamento value for this Debito.
     * 
     * @return dataPagamento
     */
    public java.util.Calendar getDataPagamento() {
        return dataPagamento;
    }


    /**
     * Sets the dataPagamento value for this Debito.
     * 
     * @param dataPagamento
     */
    public void setDataPagamento(java.util.Calendar dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    /**
     * Gets the observacao value for this Debito.
     * 
     * @return observacao
     */
    public java.lang.String getObservacao() {
        return observacao;
    }


    /**
     * Sets the observacao value for this Debito.
     * 
     * @param observacao
     */
    public void setObservacao(java.lang.String observacao) {
        this.observacao = observacao;
    }


    /**
     * Gets the nsu value for this Debito.
     * 
     * @return nsu
     */
    public java.lang.String getNsu() {
        return nsu;
    }


    /**
     * Sets the nsu value for this Debito.
     * 
     * @param nsu
     */
    public void setNsu(java.lang.String nsu) {
        this.nsu = nsu;
    }


    /**
     * Gets the tid value for this Debito.
     * 
     * @return tid
     */
    public java.lang.String getTid() {
        return tid;
    }


    /**
     * Sets the tid value for this Debito.
     * 
     * @param tid
     */
    public void setTid(java.lang.String tid) {
        this.tid = tid;
    }


    /**
     * Gets the codAutorizacao value for this Debito.
     * 
     * @return codAutorizacao
     */
    public java.lang.String getCodAutorizacao() {
        return codAutorizacao;
    }


    /**
     * Sets the codAutorizacao value for this Debito.
     * 
     * @param codAutorizacao
     */
    public void setCodAutorizacao(java.lang.String codAutorizacao) {
        this.codAutorizacao = codAutorizacao;
    }


    /**
     * Gets the mensagemTransacao value for this Debito.
     * 
     * @return mensagemTransacao
     */
    public java.lang.String getMensagemTransacao() {
        return mensagemTransacao;
    }


    /**
     * Sets the mensagemTransacao value for this Debito.
     * 
     * @param mensagemTransacao
     */
    public void setMensagemTransacao(java.lang.String mensagemTransacao) {
        this.mensagemTransacao = mensagemTransacao;
    }


    /**
     * Gets the codRetorno value for this Debito.
     * 
     * @return codRetorno
     */
    public java.lang.String getCodRetorno() {
        return codRetorno;
    }


    /**
     * Sets the codRetorno value for this Debito.
     * 
     * @param codRetorno
     */
    public void setCodRetorno(java.lang.String codRetorno) {
        this.codRetorno = codRetorno;
    }


    /**
     * Gets the administradora value for this Debito.
     * 
     * @return administradora
     */
    public java.lang.String getAdministradora() {
        return administradora;
    }


    /**
     * Sets the administradora value for this Debito.
     * 
     * @param administradora
     */
    public void setAdministradora(java.lang.String administradora) {
        this.administradora = administradora;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Debito)) return false;
        Debito other = (Debito) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataPagamento==null && other.getDataPagamento()==null) || 
             (this.dataPagamento!=null &&
              this.dataPagamento.equals(other.getDataPagamento()))) &&
            ((this.observacao==null && other.getObservacao()==null) || 
             (this.observacao!=null &&
              this.observacao.equals(other.getObservacao()))) &&
            ((this.nsu==null && other.getNsu()==null) || 
             (this.nsu!=null &&
              this.nsu.equals(other.getNsu()))) &&
            ((this.tid==null && other.getTid()==null) || 
             (this.tid!=null &&
              this.tid.equals(other.getTid()))) &&
            ((this.codAutorizacao==null && other.getCodAutorizacao()==null) || 
             (this.codAutorizacao!=null &&
              this.codAutorizacao.equals(other.getCodAutorizacao()))) &&
            ((this.mensagemTransacao==null && other.getMensagemTransacao()==null) || 
             (this.mensagemTransacao!=null &&
              this.mensagemTransacao.equals(other.getMensagemTransacao()))) &&
            ((this.codRetorno==null && other.getCodRetorno()==null) || 
             (this.codRetorno!=null &&
              this.codRetorno.equals(other.getCodRetorno()))) &&
            ((this.administradora==null && other.getAdministradora()==null) || 
             (this.administradora!=null &&
              this.administradora.equals(other.getAdministradora())));
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
        if (getDataPagamento() != null) {
            _hashCode += getDataPagamento().hashCode();
        }
        if (getObservacao() != null) {
            _hashCode += getObservacao().hashCode();
        }
        if (getNsu() != null) {
            _hashCode += getNsu().hashCode();
        }
        if (getTid() != null) {
            _hashCode += getTid().hashCode();
        }
        if (getCodAutorizacao() != null) {
            _hashCode += getCodAutorizacao().hashCode();
        }
        if (getMensagemTransacao() != null) {
            _hashCode += getMensagemTransacao().hashCode();
        }
        if (getCodRetorno() != null) {
            _hashCode += getCodRetorno().hashCode();
        }
        if (getAdministradora() != null) {
            _hashCode += getAdministradora().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Debito.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Debito"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DataPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Observacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nsu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Nsu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Tid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAutorizacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodAutorizacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensagemTransacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MensagemTransacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("administradora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Administradora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
