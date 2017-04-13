/**
 * PedidoWebServiceImplLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.netshoes.connect.order.service.impl;

public class PedidoWebServiceImplLocator extends org.apache.axis.client.Service implements br.com.netshoes.connect.order.service.impl.PedidoWebServiceImpl {

    public PedidoWebServiceImplLocator() {
    }


    public PedidoWebServiceImplLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PedidoWebServiceImplLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PedidoWebServicePort
    private java.lang.String PedidoWebServicePort_address = "http://hmg06-atg-app.ns2online.com.br:8080/ns_order_service/services/PedidoWebServicePort";

    public java.lang.String getPedidoWebServicePortAddress() {
        return PedidoWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PedidoWebServicePortWSDDServiceName = "PedidoWebServicePort";

    public java.lang.String getPedidoWebServicePortWSDDServiceName() {
        return PedidoWebServicePortWSDDServiceName;
    }

    public void setPedidoWebServicePortWSDDServiceName(java.lang.String name) {
        PedidoWebServicePortWSDDServiceName = name;
    }

    public br.com.netshoes.connect.order.service.impl.PedidoWebService getPedidoWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PedidoWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPedidoWebServicePort(endpoint);
    }

    public br.com.netshoes.connect.order.service.impl.PedidoWebService getPedidoWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.netshoes.connect.order.service.impl.PedidoWebServicePortSoapBindingStub _stub = new br.com.netshoes.connect.order.service.impl.PedidoWebServicePortSoapBindingStub(portAddress, this);
            _stub.setPortName(getPedidoWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPedidoWebServicePortEndpointAddress(java.lang.String address) {
        PedidoWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.netshoes.connect.order.service.impl.PedidoWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.netshoes.connect.order.service.impl.PedidoWebServicePortSoapBindingStub _stub = new br.com.netshoes.connect.order.service.impl.PedidoWebServicePortSoapBindingStub(new java.net.URL(PedidoWebServicePort_address), this);
                _stub.setPortName(getPedidoWebServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PedidoWebServicePort".equals(inputPortName)) {
            return getPedidoWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "PedidoWebServiceImpl");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "PedidoWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PedidoWebServicePort".equals(portName)) {
            setPedidoWebServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
