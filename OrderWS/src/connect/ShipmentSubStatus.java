/**
 * ShipmentSubStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class ShipmentSubStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShipmentSubStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ENVIADO_PARA_TRANSPORTADORA = "ENVIADO_PARA_TRANSPORTADORA";
    public static final java.lang.String _RECEBIDO_NA_TRANSPORTADORA = "RECEBIDO_NA_TRANSPORTADORA";
    public static final java.lang.String _SAIU_PARA_ENTREGA = "SAIU_PARA_ENTREGA";
    public static final java.lang.String _FALHA_NA_ENTREGA = "FALHA_NA_ENTREGA";
    public static final java.lang.String _SEPARADO_PARA_ENVIO = "SEPARADO_PARA_ENVIO";
    public static final java.lang.String _ENTREGA_EFETUADA = "ENTREGA_EFETUADA";
    public static final ShipmentSubStatus ENVIADO_PARA_TRANSPORTADORA = new ShipmentSubStatus(_ENVIADO_PARA_TRANSPORTADORA);
    public static final ShipmentSubStatus RECEBIDO_NA_TRANSPORTADORA = new ShipmentSubStatus(_RECEBIDO_NA_TRANSPORTADORA);
    public static final ShipmentSubStatus SAIU_PARA_ENTREGA = new ShipmentSubStatus(_SAIU_PARA_ENTREGA);
    public static final ShipmentSubStatus FALHA_NA_ENTREGA = new ShipmentSubStatus(_FALHA_NA_ENTREGA);
    public static final ShipmentSubStatus SEPARADO_PARA_ENVIO = new ShipmentSubStatus(_SEPARADO_PARA_ENVIO);
    public static final ShipmentSubStatus ENTREGA_EFETUADA = new ShipmentSubStatus(_ENTREGA_EFETUADA);
    public java.lang.String getValue() { return _value_;}
    public static ShipmentSubStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ShipmentSubStatus enumeration = (ShipmentSubStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ShipmentSubStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ShipmentSubStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "shipmentSubStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
