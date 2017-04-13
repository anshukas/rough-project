/**
 * ListarNovosPedidosRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connect;

public class ListarNovosPedidosRequest  implements java.io.Serializable {
    private java.lang.String codigoCatalogo;

    public ListarNovosPedidosRequest() {
    }

    public ListarNovosPedidosRequest(
           java.lang.String codigoCatalogo) {
           this.codigoCatalogo = codigoCatalogo;
    }


    /**
     * Gets the codigoCatalogo value for this ListarNovosPedidosRequest.
     * 
     * @return codigoCatalogo
     */
    public java.lang.String getCodigoCatalogo() {
        return codigoCatalogo;
    }


    /**
     * Sets the codigoCatalogo value for this ListarNovosPedidosRequest.
     * 
     * @param codigoCatalogo
     */
    public void setCodigoCatalogo(java.lang.String codigoCatalogo) {
        this.codigoCatalogo = codigoCatalogo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListarNovosPedidosRequest)) return false;
        ListarNovosPedidosRequest other = (ListarNovosPedidosRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoCatalogo==null && other.getCodigoCatalogo()==null) || 
             (this.codigoCatalogo!=null &&
              this.codigoCatalogo.equals(other.getCodigoCatalogo())));
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
        if (getCodigoCatalogo() != null) {
            _hashCode += getCodigoCatalogo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListarNovosPedidosRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("commerce:connect", "ListarNovosPedidosRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCatalogo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CodigoCatalogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
