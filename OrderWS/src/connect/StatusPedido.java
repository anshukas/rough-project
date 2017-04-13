/**
 * StatusPedido.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class StatusPedido implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StatusPedido(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PEDIDO_REALIZADO = "PEDIDO_REALIZADO";
    public static final java.lang.String _PAGAMENTO_CONFIRMADO = "PAGAMENTO_CONFIRMADO";
    public static final java.lang.String _PREPARADO_PARA_ENVIO = "PREPARADO_PARA_ENVIO";
    public static final java.lang.String _DESPACHADO = "DESPACHADO";
    public static final java.lang.String _ENTREGA_EFETUADA = "ENTREGA_EFETUADA";
    public static final java.lang.String _CANCELADO = "CANCELADO";
    public static final java.lang.String _PAGAMENTO_NAO_CONFIRMADO = "PAGAMENTO_NAO_CONFIRMADO";
    public static final java.lang.String _AGUARDANDO_DEBITO = "AGUARDANDO_DEBITO";
    public static final java.lang.String _ENVIO_PARCIAL = "ENVIO_PARCIAL";
    public static final java.lang.String _ENTREGA_EM_AMENDAMENTO = "ENTREGA_EM_AMENDAMENTO";
    public static final java.lang.String _SEPARADO_PARA_ENVIO = "SEPARADO_PARA_ENVIO";
    public static final StatusPedido PEDIDO_REALIZADO = new StatusPedido(_PEDIDO_REALIZADO);
    public static final StatusPedido PAGAMENTO_CONFIRMADO = new StatusPedido(_PAGAMENTO_CONFIRMADO);
    public static final StatusPedido PREPARADO_PARA_ENVIO = new StatusPedido(_PREPARADO_PARA_ENVIO);
    public static final StatusPedido DESPACHADO = new StatusPedido(_DESPACHADO);
    public static final StatusPedido ENTREGA_EFETUADA = new StatusPedido(_ENTREGA_EFETUADA);
    public static final StatusPedido CANCELADO = new StatusPedido(_CANCELADO);
    public static final StatusPedido PAGAMENTO_NAO_CONFIRMADO = new StatusPedido(_PAGAMENTO_NAO_CONFIRMADO);
    public static final StatusPedido AGUARDANDO_DEBITO = new StatusPedido(_AGUARDANDO_DEBITO);
    public static final StatusPedido ENVIO_PARCIAL = new StatusPedido(_ENVIO_PARCIAL);
    public static final StatusPedido ENTREGA_EM_AMENDAMENTO = new StatusPedido(_ENTREGA_EM_AMENDAMENTO);
    public static final StatusPedido SEPARADO_PARA_ENVIO = new StatusPedido(_SEPARADO_PARA_ENVIO);
    public java.lang.String getValue() { return _value_;}
    public static StatusPedido fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StatusPedido enumeration = (StatusPedido)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StatusPedido fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusPedido.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "statusPedido"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
