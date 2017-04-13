/**
 * StatusEntrega.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class StatusEntrega implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected StatusEntrega(java.lang.String value) {
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
    public static final StatusEntrega PEDIDO_REALIZADO = new StatusEntrega(_PEDIDO_REALIZADO);
    public static final StatusEntrega PAGAMENTO_CONFIRMADO = new StatusEntrega(_PAGAMENTO_CONFIRMADO);
    public static final StatusEntrega PREPARADO_PARA_ENVIO = new StatusEntrega(_PREPARADO_PARA_ENVIO);
    public static final StatusEntrega DESPACHADO = new StatusEntrega(_DESPACHADO);
    public static final StatusEntrega ENTREGA_EFETUADA = new StatusEntrega(_ENTREGA_EFETUADA);
    public static final StatusEntrega CANCELADO = new StatusEntrega(_CANCELADO);
    public static final StatusEntrega PAGAMENTO_NAO_CONFIRMADO = new StatusEntrega(_PAGAMENTO_NAO_CONFIRMADO);
    public static final StatusEntrega AGUARDANDO_DEBITO = new StatusEntrega(_AGUARDANDO_DEBITO);
    public static final StatusEntrega ENVIO_PARCIAL = new StatusEntrega(_ENVIO_PARCIAL);
    public static final StatusEntrega ENTREGA_EM_AMENDAMENTO = new StatusEntrega(_ENTREGA_EM_AMENDAMENTO);
    public static final StatusEntrega SEPARADO_PARA_ENVIO = new StatusEntrega(_SEPARADO_PARA_ENVIO);
    public java.lang.String getValue() { return _value_;}
    public static StatusEntrega fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        StatusEntrega enumeration = (StatusEntrega)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static StatusEntrega fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(StatusEntrega.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "statusEntrega"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
