/**
 * PedidoSku.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class PedidoSku  implements java.io.Serializable {
    private java.lang.String codigoSku;

    private java.lang.String sellerID;

    private java.math.BigDecimal precoUnitario;

    private java.math.BigDecimal descontoUnitario;

    private java.math.BigDecimal descontoUnitarioNCard;

    private int quantidade;

    private java.lang.Boolean brinde;

    private java.lang.Boolean presente;

    private java.math.BigDecimal valorPresente;

    private connect.Personalizacao[] listaPersona;

    private connect.Programa[] listaProgramas;

    public PedidoSku() {
    }

    public PedidoSku(
           java.lang.String codigoSku,
           java.lang.String sellerID,
           java.math.BigDecimal precoUnitario,
           java.math.BigDecimal descontoUnitario,
           java.math.BigDecimal descontoUnitarioNCard,
           int quantidade,
           java.lang.Boolean brinde,
           java.lang.Boolean presente,
           java.math.BigDecimal valorPresente,
           connect.Personalizacao[] listaPersona,
           connect.Programa[] listaProgramas) {
           this.codigoSku = codigoSku;
           this.sellerID = sellerID;
           this.precoUnitario = precoUnitario;
           this.descontoUnitario = descontoUnitario;
           this.descontoUnitarioNCard = descontoUnitarioNCard;
           this.quantidade = quantidade;
           this.brinde = brinde;
           this.presente = presente;
           this.valorPresente = valorPresente;
           this.listaPersona = listaPersona;
           this.listaProgramas = listaProgramas;
    }


    /**
     * Gets the codigoSku value for this PedidoSku.
     * 
     * @return codigoSku
     */
    public java.lang.String getCodigoSku() {
        return codigoSku;
    }


    /**
     * Sets the codigoSku value for this PedidoSku.
     * 
     * @param codigoSku
     */
    public void setCodigoSku(java.lang.String codigoSku) {
        this.codigoSku = codigoSku;
    }


    /**
     * Gets the sellerID value for this PedidoSku.
     * 
     * @return sellerID
     */
    public java.lang.String getSellerID() {
        return sellerID;
    }


    /**
     * Sets the sellerID value for this PedidoSku.
     * 
     * @param sellerID
     */
    public void setSellerID(java.lang.String sellerID) {
        this.sellerID = sellerID;
    }


    /**
     * Gets the precoUnitario value for this PedidoSku.
     * 
     * @return precoUnitario
     */
    public java.math.BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }


    /**
     * Sets the precoUnitario value for this PedidoSku.
     * 
     * @param precoUnitario
     */
    public void setPrecoUnitario(java.math.BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }


    /**
     * Gets the descontoUnitario value for this PedidoSku.
     * 
     * @return descontoUnitario
     */
    public java.math.BigDecimal getDescontoUnitario() {
        return descontoUnitario;
    }


    /**
     * Sets the descontoUnitario value for this PedidoSku.
     * 
     * @param descontoUnitario
     */
    public void setDescontoUnitario(java.math.BigDecimal descontoUnitario) {
        this.descontoUnitario = descontoUnitario;
    }


    /**
     * Gets the descontoUnitarioNCard value for this PedidoSku.
     * 
     * @return descontoUnitarioNCard
     */
    public java.math.BigDecimal getDescontoUnitarioNCard() {
        return descontoUnitarioNCard;
    }


    /**
     * Sets the descontoUnitarioNCard value for this PedidoSku.
     * 
     * @param descontoUnitarioNCard
     */
    public void setDescontoUnitarioNCard(java.math.BigDecimal descontoUnitarioNCard) {
        this.descontoUnitarioNCard = descontoUnitarioNCard;
    }


    /**
     * Gets the quantidade value for this PedidoSku.
     * 
     * @return quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }


    /**
     * Sets the quantidade value for this PedidoSku.
     * 
     * @param quantidade
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    /**
     * Gets the brinde value for this PedidoSku.
     * 
     * @return brinde
     */
    public java.lang.Boolean getBrinde() {
        return brinde;
    }


    /**
     * Sets the brinde value for this PedidoSku.
     * 
     * @param brinde
     */
    public void setBrinde(java.lang.Boolean brinde) {
        this.brinde = brinde;
    }


    /**
     * Gets the presente value for this PedidoSku.
     * 
     * @return presente
     */
    public java.lang.Boolean getPresente() {
        return presente;
    }


    /**
     * Sets the presente value for this PedidoSku.
     * 
     * @param presente
     */
    public void setPresente(java.lang.Boolean presente) {
        this.presente = presente;
    }


    /**
     * Gets the valorPresente value for this PedidoSku.
     * 
     * @return valorPresente
     */
    public java.math.BigDecimal getValorPresente() {
        return valorPresente;
    }


    /**
     * Sets the valorPresente value for this PedidoSku.
     * 
     * @param valorPresente
     */
    public void setValorPresente(java.math.BigDecimal valorPresente) {
        this.valorPresente = valorPresente;
    }


    /**
     * Gets the listaPersona value for this PedidoSku.
     * 
     * @return listaPersona
     */
    public connect.Personalizacao[] getListaPersona() {
        return listaPersona;
    }


    /**
     * Sets the listaPersona value for this PedidoSku.
     * 
     * @param listaPersona
     */
    public void setListaPersona(connect.Personalizacao[] listaPersona) {
        this.listaPersona = listaPersona;
    }


    /**
     * Gets the listaProgramas value for this PedidoSku.
     * 
     * @return listaProgramas
     */
    public connect.Programa[] getListaProgramas() {
        return listaProgramas;
    }


    /**
     * Sets the listaProgramas value for this PedidoSku.
     * 
     * @param listaProgramas
     */
    public void setListaProgramas(connect.Programa[] listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PedidoSku)) return false;
        PedidoSku other = (PedidoSku) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoSku==null && other.getCodigoSku()==null) || 
             (this.codigoSku!=null &&
              this.codigoSku.equals(other.getCodigoSku()))) &&
            ((this.sellerID==null && other.getSellerID()==null) || 
             (this.sellerID!=null &&
              this.sellerID.equals(other.getSellerID()))) &&
            ((this.precoUnitario==null && other.getPrecoUnitario()==null) || 
             (this.precoUnitario!=null &&
              this.precoUnitario.equals(other.getPrecoUnitario()))) &&
            ((this.descontoUnitario==null && other.getDescontoUnitario()==null) || 
             (this.descontoUnitario!=null &&
              this.descontoUnitario.equals(other.getDescontoUnitario()))) &&
            ((this.descontoUnitarioNCard==null && other.getDescontoUnitarioNCard()==null) || 
             (this.descontoUnitarioNCard!=null &&
              this.descontoUnitarioNCard.equals(other.getDescontoUnitarioNCard()))) &&
            this.quantidade == other.getQuantidade() &&
            ((this.brinde==null && other.getBrinde()==null) || 
             (this.brinde!=null &&
              this.brinde.equals(other.getBrinde()))) &&
            ((this.presente==null && other.getPresente()==null) || 
             (this.presente!=null &&
              this.presente.equals(other.getPresente()))) &&
            ((this.valorPresente==null && other.getValorPresente()==null) || 
             (this.valorPresente!=null &&
              this.valorPresente.equals(other.getValorPresente()))) &&
            ((this.listaPersona==null && other.getListaPersona()==null) || 
             (this.listaPersona!=null &&
              java.util.Arrays.equals(this.listaPersona, other.getListaPersona()))) &&
            ((this.listaProgramas==null && other.getListaProgramas()==null) || 
             (this.listaProgramas!=null &&
              java.util.Arrays.equals(this.listaProgramas, other.getListaProgramas())));
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
        if (getCodigoSku() != null) {
            _hashCode += getCodigoSku().hashCode();
        }
        if (getSellerID() != null) {
            _hashCode += getSellerID().hashCode();
        }
        if (getPrecoUnitario() != null) {
            _hashCode += getPrecoUnitario().hashCode();
        }
        if (getDescontoUnitario() != null) {
            _hashCode += getDescontoUnitario().hashCode();
        }
        if (getDescontoUnitarioNCard() != null) {
            _hashCode += getDescontoUnitarioNCard().hashCode();
        }
        _hashCode += getQuantidade();
        if (getBrinde() != null) {
            _hashCode += getBrinde().hashCode();
        }
        if (getPresente() != null) {
            _hashCode += getPresente().hashCode();
        }
        if (getValorPresente() != null) {
            _hashCode += getValorPresente().hashCode();
        }
        if (getListaPersona() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaPersona());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaPersona(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaProgramas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaProgramas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaProgramas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PedidoSku.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "PedidoSku"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoSku");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodigoSku"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("precoUnitario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PrecoUnitario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descontoUnitario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DescontoUnitario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descontoUnitarioNCard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DescontoUnitarioNCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Quantidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brinde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Brinde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Presente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorPresente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValorPresente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaPersona");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ListaPersona"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Personalizacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaProgramas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ListaProgramas"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Programa"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item"));
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
