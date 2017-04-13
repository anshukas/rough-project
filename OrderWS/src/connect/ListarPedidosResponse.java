/**
 * ListarPedidosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class ListarPedidosResponse  implements java.io.Serializable {
    private connect.Pedido[] pedidos;

    private connect.Result result;

    public ListarPedidosResponse() {
    }

    public ListarPedidosResponse(
           connect.Pedido[] pedidos,
           connect.Result result) {
           this.pedidos = pedidos;
           this.result = result;
    }


    /**
     * Gets the pedidos value for this ListarPedidosResponse.
     * 
     * @return pedidos
     */
    public connect.Pedido[] getPedidos() {
        return pedidos;
    }


    /**
     * Sets the pedidos value for this ListarPedidosResponse.
     * 
     * @param pedidos
     */
    public void setPedidos(connect.Pedido[] pedidos) {
        this.pedidos = pedidos;
    }


    /**
     * Gets the result value for this ListarPedidosResponse.
     * 
     * @return result
     */
    public connect.Result getResult() {
        return result;
    }


    /**
     * Sets the result value for this ListarPedidosResponse.
     * 
     * @param result
     */
    public void setResult(connect.Result result) {
        this.result = result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarPedidosResponse)) return false;
        ListarPedidosResponse other = (ListarPedidosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pedidos==null && other.getPedidos()==null) || 
             (this.pedidos!=null &&
              java.util.Arrays.equals(this.pedidos, other.getPedidos()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult())));
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
        if (getPedidos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPedidos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPedidos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarPedidosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "ListarPedidosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pedidos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Pedidos"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Pedido"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("commerce:connect", "Result"));
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
