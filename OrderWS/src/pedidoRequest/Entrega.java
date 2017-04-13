/**
 * Entrega.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package pedidoRequest;

public class Entrega  implements java.io.Serializable {
    private java.lang.String numero;

    private java.lang.String urlRastreamento;

    private java.lang.String[] listaSkus;

    private connect.OrderShipmentStatus status;

    private connect.ShipmentSubStatus subStatus;

    private java.util.Calendar prazoEntrega;

    private java.util.Calendar prazoTroca;

    private java.util.Calendar dataEntrega;

    private java.lang.Boolean trocaWebDisponivel;

    private java.lang.String detalheErro;

    private java.util.Calendar timeStampStatus;

    public Entrega() {
    }

    public Entrega(
           java.lang.String numero,
           java.lang.String urlRastreamento,
           java.lang.String[] listaSkus,
           connect.OrderShipmentStatus status,
           connect.ShipmentSubStatus subStatus,
           java.util.Calendar prazoEntrega,
           java.util.Calendar prazoTroca,
           java.util.Calendar dataEntrega,
           java.lang.Boolean trocaWebDisponivel,
           java.lang.String detalheErro,
           java.util.Calendar timeStampStatus) {
           this.numero = numero;
           this.urlRastreamento = urlRastreamento;
           this.listaSkus = listaSkus;
           this.status = status;
           this.subStatus = subStatus;
           this.prazoEntrega = prazoEntrega;
           this.prazoTroca = prazoTroca;
           this.dataEntrega = dataEntrega;
           this.trocaWebDisponivel = trocaWebDisponivel;
           this.detalheErro = detalheErro;
           this.timeStampStatus = timeStampStatus;
    }


    /**
     * Gets the numero value for this Entrega.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Entrega.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the urlRastreamento value for this Entrega.
     * 
     * @return urlRastreamento
     */
    public java.lang.String getUrlRastreamento() {
        return urlRastreamento;
    }


    /**
     * Sets the urlRastreamento value for this Entrega.
     * 
     * @param urlRastreamento
     */
    public void setUrlRastreamento(java.lang.String urlRastreamento) {
        this.urlRastreamento = urlRastreamento;
    }


    /**
     * Gets the listaSkus value for this Entrega.
     * 
     * @return listaSkus
     */
    public java.lang.String[] getListaSkus() {
        return listaSkus;
    }


    /**
     * Sets the listaSkus value for this Entrega.
     * 
     * @param listaSkus
     */
    public void setListaSkus(java.lang.String[] listaSkus) {
        this.listaSkus = listaSkus;
    }


    /**
     * Gets the status value for this Entrega.
     * 
     * @return status
     */
    public connect.OrderShipmentStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Entrega.
     * 
     * @param status
     */
    public void setStatus(connect.OrderShipmentStatus status) {
        this.status = status;
    }


    /**
     * Gets the subStatus value for this Entrega.
     * 
     * @return subStatus
     */
    public connect.ShipmentSubStatus getSubStatus() {
        return subStatus;
    }


    /**
     * Sets the subStatus value for this Entrega.
     * 
     * @param subStatus
     */
    public void setSubStatus(connect.ShipmentSubStatus subStatus) {
        this.subStatus = subStatus;
    }


    /**
     * Gets the prazoEntrega value for this Entrega.
     * 
     * @return prazoEntrega
     */
    public java.util.Calendar getPrazoEntrega() {
        return prazoEntrega;
    }


    /**
     * Sets the prazoEntrega value for this Entrega.
     * 
     * @param prazoEntrega
     */
    public void setPrazoEntrega(java.util.Calendar prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }


    /**
     * Gets the prazoTroca value for this Entrega.
     * 
     * @return prazoTroca
     */
    public java.util.Calendar getPrazoTroca() {
        return prazoTroca;
    }


    /**
     * Sets the prazoTroca value for this Entrega.
     * 
     * @param prazoTroca
     */
    public void setPrazoTroca(java.util.Calendar prazoTroca) {
        this.prazoTroca = prazoTroca;
    }


    /**
     * Gets the dataEntrega value for this Entrega.
     * 
     * @return dataEntrega
     */
    public java.util.Calendar getDataEntrega() {
        return dataEntrega;
    }


    /**
     * Sets the dataEntrega value for this Entrega.
     * 
     * @param dataEntrega
     */
    public void setDataEntrega(java.util.Calendar dataEntrega) {
        this.dataEntrega = dataEntrega;
    }


    /**
     * Gets the trocaWebDisponivel value for this Entrega.
     * 
     * @return trocaWebDisponivel
     */
    public java.lang.Boolean getTrocaWebDisponivel() {
        return trocaWebDisponivel;
    }


    /**
     * Sets the trocaWebDisponivel value for this Entrega.
     * 
     * @param trocaWebDisponivel
     */
    public void setTrocaWebDisponivel(java.lang.Boolean trocaWebDisponivel) {
        this.trocaWebDisponivel = trocaWebDisponivel;
    }


    /**
     * Gets the detalheErro value for this Entrega.
     * 
     * @return detalheErro
     */
    public java.lang.String getDetalheErro() {
        return detalheErro;
    }


    /**
     * Sets the detalheErro value for this Entrega.
     * 
     * @param detalheErro
     */
    public void setDetalheErro(java.lang.String detalheErro) {
        this.detalheErro = detalheErro;
    }


    /**
     * Gets the timeStampStatus value for this Entrega.
     * 
     * @return timeStampStatus
     */
    public java.util.Calendar getTimeStampStatus() {
        return timeStampStatus;
    }


    /**
     * Sets the timeStampStatus value for this Entrega.
     * 
     * @param timeStampStatus
     */
    public void setTimeStampStatus(java.util.Calendar timeStampStatus) {
        this.timeStampStatus = timeStampStatus;
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
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.urlRastreamento==null && other.getUrlRastreamento()==null) || 
             (this.urlRastreamento!=null &&
              this.urlRastreamento.equals(other.getUrlRastreamento()))) &&
            ((this.listaSkus==null && other.getListaSkus()==null) || 
             (this.listaSkus!=null &&
              java.util.Arrays.equals(this.listaSkus, other.getListaSkus()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subStatus==null && other.getSubStatus()==null) || 
             (this.subStatus!=null &&
              this.subStatus.equals(other.getSubStatus()))) &&
            ((this.prazoEntrega==null && other.getPrazoEntrega()==null) || 
             (this.prazoEntrega!=null &&
              this.prazoEntrega.equals(other.getPrazoEntrega()))) &&
            ((this.prazoTroca==null && other.getPrazoTroca()==null) || 
             (this.prazoTroca!=null &&
              this.prazoTroca.equals(other.getPrazoTroca()))) &&
            ((this.dataEntrega==null && other.getDataEntrega()==null) || 
             (this.dataEntrega!=null &&
              this.dataEntrega.equals(other.getDataEntrega()))) &&
            ((this.trocaWebDisponivel==null && other.getTrocaWebDisponivel()==null) || 
             (this.trocaWebDisponivel!=null &&
              this.trocaWebDisponivel.equals(other.getTrocaWebDisponivel()))) &&
            ((this.detalheErro==null && other.getDetalheErro()==null) || 
             (this.detalheErro!=null &&
              this.detalheErro.equals(other.getDetalheErro()))) &&
            ((this.timeStampStatus==null && other.getTimeStampStatus()==null) || 
             (this.timeStampStatus!=null &&
              this.timeStampStatus.equals(other.getTimeStampStatus())));
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
        if (getUrlRastreamento() != null) {
            _hashCode += getUrlRastreamento().hashCode();
        }
        if (getListaSkus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaSkus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaSkus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubStatus() != null) {
            _hashCode += getSubStatus().hashCode();
        }
        if (getPrazoEntrega() != null) {
            _hashCode += getPrazoEntrega().hashCode();
        }
        if (getPrazoTroca() != null) {
            _hashCode += getPrazoTroca().hashCode();
        }
        if (getDataEntrega() != null) {
            _hashCode += getDataEntrega().hashCode();
        }
        if (getTrocaWebDisponivel() != null) {
            _hashCode += getTrocaWebDisponivel().hashCode();
        }
        if (getDetalheErro() != null) {
            _hashCode += getDetalheErro().hashCode();
        }
        if (getTimeStampStatus() != null) {
            _hashCode += getTimeStampStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Entrega.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("pedidoRequest", "Entrega"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlRastreamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UrlRastreamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaSkus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ListaSkus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "orderShipmentStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SubStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "shipmentSubStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prazoEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrazoEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prazoTroca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrazoTroca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataEntrega");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DataEntrega"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trocaWebDisponivel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TrocaWebDisponivel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detalheErro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DetalheErro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStampStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TimeStampStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
