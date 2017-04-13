/**
 * Pagamento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class Pagamento  implements java.io.Serializable {
    private connect.TipoPagamento tipoPagamento;

    private java.lang.String origem;

    private connect.Cartao cartao;

    private connect.Boleto boleto;

    private connect.Cupom cupom;

    private connect.Debito debito;

    private connect.PagamentoOnline online;

    public Pagamento() {
    }

    public Pagamento(
           connect.TipoPagamento tipoPagamento,
           java.lang.String origem,
           connect.Cartao cartao,
           connect.Boleto boleto,
           connect.Cupom cupom,
           connect.Debito debito,
           connect.PagamentoOnline online) {
           this.tipoPagamento = tipoPagamento;
           this.origem = origem;
           this.cartao = cartao;
           this.boleto = boleto;
           this.cupom = cupom;
           this.debito = debito;
           this.online = online;
    }


    /**
     * Gets the tipoPagamento value for this Pagamento.
     * 
     * @return tipoPagamento
     */
    public connect.TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }


    /**
     * Sets the tipoPagamento value for this Pagamento.
     * 
     * @param tipoPagamento
     */
    public void setTipoPagamento(connect.TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }


    /**
     * Gets the origem value for this Pagamento.
     * 
     * @return origem
     */
    public java.lang.String getOrigem() {
        return origem;
    }


    /**
     * Sets the origem value for this Pagamento.
     * 
     * @param origem
     */
    public void setOrigem(java.lang.String origem) {
        this.origem = origem;
    }


    /**
     * Gets the cartao value for this Pagamento.
     * 
     * @return cartao
     */
    public connect.Cartao getCartao() {
        return cartao;
    }


    /**
     * Sets the cartao value for this Pagamento.
     * 
     * @param cartao
     */
    public void setCartao(connect.Cartao cartao) {
        this.cartao = cartao;
    }


    /**
     * Gets the boleto value for this Pagamento.
     * 
     * @return boleto
     */
    public connect.Boleto getBoleto() {
        return boleto;
    }


    /**
     * Sets the boleto value for this Pagamento.
     * 
     * @param boleto
     */
    public void setBoleto(connect.Boleto boleto) {
        this.boleto = boleto;
    }


    /**
     * Gets the cupom value for this Pagamento.
     * 
     * @return cupom
     */
    public connect.Cupom getCupom() {
        return cupom;
    }


    /**
     * Sets the cupom value for this Pagamento.
     * 
     * @param cupom
     */
    public void setCupom(connect.Cupom cupom) {
        this.cupom = cupom;
    }


    /**
     * Gets the debito value for this Pagamento.
     * 
     * @return debito
     */
    public connect.Debito getDebito() {
        return debito;
    }


    /**
     * Sets the debito value for this Pagamento.
     * 
     * @param debito
     */
    public void setDebito(connect.Debito debito) {
        this.debito = debito;
    }


    /**
     * Gets the online value for this Pagamento.
     * 
     * @return online
     */
    public connect.PagamentoOnline getOnline() {
        return online;
    }


    /**
     * Sets the online value for this Pagamento.
     * 
     * @param online
     */
    public void setOnline(connect.PagamentoOnline online) {
        this.online = online;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pagamento)) return false;
        Pagamento other = (Pagamento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoPagamento==null && other.getTipoPagamento()==null) || 
             (this.tipoPagamento!=null &&
              this.tipoPagamento.equals(other.getTipoPagamento()))) &&
            ((this.origem==null && other.getOrigem()==null) || 
             (this.origem!=null &&
              this.origem.equals(other.getOrigem()))) &&
            ((this.cartao==null && other.getCartao()==null) || 
             (this.cartao!=null &&
              this.cartao.equals(other.getCartao()))) &&
            ((this.boleto==null && other.getBoleto()==null) || 
             (this.boleto!=null &&
              this.boleto.equals(other.getBoleto()))) &&
            ((this.cupom==null && other.getCupom()==null) || 
             (this.cupom!=null &&
              this.cupom.equals(other.getCupom()))) &&
            ((this.debito==null && other.getDebito()==null) || 
             (this.debito!=null &&
              this.debito.equals(other.getDebito()))) &&
            ((this.online==null && other.getOnline()==null) || 
             (this.online!=null &&
              this.online.equals(other.getOnline())));
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
        if (getTipoPagamento() != null) {
            _hashCode += getTipoPagamento().hashCode();
        }
        if (getOrigem() != null) {
            _hashCode += getOrigem().hashCode();
        }
        if (getCartao() != null) {
            _hashCode += getCartao().hashCode();
        }
        if (getBoleto() != null) {
            _hashCode += getBoleto().hashCode();
        }
        if (getCupom() != null) {
            _hashCode += getCupom().hashCode();
        }
        if (getDebito() != null) {
            _hashCode += getDebito().hashCode();
        }
        if (getOnline() != null) {
            _hashCode += getOnline().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pagamento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Pagamento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPagamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TipoPagamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "tipoPagamento"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Origem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cartao"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Cartao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boleto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Boleto"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Boleto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cupom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cupom"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Cupom"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Debito"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Debito"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("online");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Online"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "PagamentoOnline"));
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
