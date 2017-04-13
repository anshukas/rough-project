/**
 * OrderShipmentStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class OrderShipmentStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OrderShipmentStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AWAITING_INVENTORY = "AWAITING_INVENTORY";
    public static final java.lang.String _INVENTORY_ASSIGNED = "INVENTORY_ASSIGNED";
    public static final java.lang.String _RELEASED = "RELEASED";
    public static final java.lang.String _PACKING = "PACKING";
    public static final java.lang.String _SHIPPED = "SHIPPED";
    public static final java.lang.String _ONHOLD = "ONHOLD";
    public static final java.lang.String _CANCELLED = "CANCELLED";
    public static final java.lang.String _PGTO_CONFIRMADO = "PGTO_CONFIRMADO";
    public static final java.lang.String _PREPARADO_PARA_ENVIO = "PREPARADO_PARA_ENVIO";
    public static final java.lang.String _DESPACHADO = "DESPACHADO";
    public static final java.lang.String _ENTREGA_EFETUADA = "ENTREGA_EFETUADA";
    public static final java.lang.String _CANCELADO = "CANCELADO";
    public static final java.lang.String _PGTO_NAO_CONFIRMADO = "PGTO_NAO_CONFIRMADO";
    public static final java.lang.String _PEDIDO_INVALIDO = "PEDIDO_INVALIDO";
    public static final java.lang.String _EM_ANALISE_CREDITO = "EM_ANALISE_CREDITO";
    public static final java.lang.String _SEPARADO_PARA_ENVIO = "SEPARADO_PARA_ENVIO";
    public static final OrderShipmentStatus AWAITING_INVENTORY = new OrderShipmentStatus(_AWAITING_INVENTORY);
    public static final OrderShipmentStatus INVENTORY_ASSIGNED = new OrderShipmentStatus(_INVENTORY_ASSIGNED);
    public static final OrderShipmentStatus RELEASED = new OrderShipmentStatus(_RELEASED);
    public static final OrderShipmentStatus PACKING = new OrderShipmentStatus(_PACKING);
    public static final OrderShipmentStatus SHIPPED = new OrderShipmentStatus(_SHIPPED);
    public static final OrderShipmentStatus ONHOLD = new OrderShipmentStatus(_ONHOLD);
    public static final OrderShipmentStatus CANCELLED = new OrderShipmentStatus(_CANCELLED);
    public static final OrderShipmentStatus PGTO_CONFIRMADO = new OrderShipmentStatus(_PGTO_CONFIRMADO);
    public static final OrderShipmentStatus PREPARADO_PARA_ENVIO = new OrderShipmentStatus(_PREPARADO_PARA_ENVIO);
    public static final OrderShipmentStatus DESPACHADO = new OrderShipmentStatus(_DESPACHADO);
    public static final OrderShipmentStatus ENTREGA_EFETUADA = new OrderShipmentStatus(_ENTREGA_EFETUADA);
    public static final OrderShipmentStatus CANCELADO = new OrderShipmentStatus(_CANCELADO);
    public static final OrderShipmentStatus PGTO_NAO_CONFIRMADO = new OrderShipmentStatus(_PGTO_NAO_CONFIRMADO);
    public static final OrderShipmentStatus PEDIDO_INVALIDO = new OrderShipmentStatus(_PEDIDO_INVALIDO);
    public static final OrderShipmentStatus EM_ANALISE_CREDITO = new OrderShipmentStatus(_EM_ANALISE_CREDITO);
    public static final OrderShipmentStatus SEPARADO_PARA_ENVIO = new OrderShipmentStatus(_SEPARADO_PARA_ENVIO);
    public java.lang.String getValue() { return _value_;}
    public static OrderShipmentStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        OrderShipmentStatus enumeration = (OrderShipmentStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OrderShipmentStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OrderShipmentStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "orderShipmentStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
