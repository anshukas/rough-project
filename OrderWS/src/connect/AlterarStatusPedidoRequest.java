/**
 * AlterarStatusPedidoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class AlterarStatusPedidoRequest  implements java.io.Serializable {
    private pedidoRequest.Pedido pedido;

    public AlterarStatusPedidoRequest() {
    }

    public AlterarStatusPedidoRequest(
           pedidoRequest.Pedido pedido) {
           this.pedido = pedido;
    }


    /**
     * Gets the pedido value for this AlterarStatusPedidoRequest.
     * 
     * @return pedido
     */
    public pedidoRequest.Pedido getPedido() {
        return pedido;
    }


    /**
     * Sets the pedido value for this AlterarStatusPedidoRequest.
     * 
     * @param pedido
     */
    public void setPedido(pedidoRequest.Pedido pedido) {
        this.pedido = pedido;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlterarStatusPedidoRequest)) return false;
        AlterarStatusPedidoRequest other = (AlterarStatusPedidoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pedido==null && other.getPedido()==null) || 
             (this.pedido!=null &&
              this.pedido.equals(other.getPedido())));
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
        if (getPedido() != null) {
            _hashCode += getPedido().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlterarStatusPedidoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "AlterarStatusPedidoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pedido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Pedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("pedidoRequest", "Pedido"));
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
