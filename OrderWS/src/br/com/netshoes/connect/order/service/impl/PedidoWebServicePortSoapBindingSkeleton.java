/**
 * PedidoWebServicePortSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.netshoes.connect.order.service.impl;

public class PedidoWebServicePortSoapBindingSkeleton implements br.com.netshoes.connect.order.service.impl.PedidoWebService, org.apache.axis.wsdl.Skeleton {
    private br.com.netshoes.connect.order.service.impl.PedidoWebService impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AlterarStatusPedidoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("commerce:connect", "AlterarStatusPedidoRequest"), connect.AlterarStatusPedidoRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("alterarStatusPedido", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("commerce:connect", "Result"));
        _oper.setElementQName(new javax.xml.namespace.QName("commerce:connect", "alterarStatusPedido"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("alterarStatusPedido") == null) {
            _myOperations.put("alterarStatusPedido", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("alterarStatusPedido")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ListarNovosPedidosRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("commerce:connect", "ListarNovosPedidosRequest"), connect.ListarNovosPedidosRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("listarNovosPedidos", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("commerce:connect", "ListarPedidosResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("commerce:connect", "listarNovosPedidos"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("listarNovosPedidos") == null) {
            _myOperations.put("listarNovosPedidos", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("listarNovosPedidos")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValidarBaixaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("commerce:connect", "ValidarBaixaRequest"), connect.ValidarBaixaRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validarBaixa", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("commerce:connect", "Result"));
        _oper.setElementQName(new javax.xml.namespace.QName("commerce:connect", "validarBaixa"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validarBaixa") == null) {
            _myOperations.put("validarBaixa", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validarBaixa")).add(_oper);
    }

    public PedidoWebServicePortSoapBindingSkeleton() {
        this.impl = new br.com.netshoes.connect.order.service.impl.PedidoWebServicePortSoapBindingImpl();
    }

    public PedidoWebServicePortSoapBindingSkeleton(br.com.netshoes.connect.order.service.impl.PedidoWebService impl) {
        this.impl = impl;
    }
    public connect.Result alterarStatusPedido(connect.AlterarStatusPedidoRequest alterarStatusPedidoRequest) throws java.rmi.RemoteException
    {
        connect.Result ret = impl.alterarStatusPedido(alterarStatusPedidoRequest);
        return ret;
    }

    public connect.ListarPedidosResponse listarNovosPedidos(connect.ListarNovosPedidosRequest listarNovosPedidosRequest) throws java.rmi.RemoteException
    {
        connect.ListarPedidosResponse ret = impl.listarNovosPedidos(listarNovosPedidosRequest);
        return ret;
    }

    public connect.Result validarBaixa(connect.ValidarBaixaRequest validarBaixaRequest) throws java.rmi.RemoteException
    {
        connect.Result ret = impl.validarBaixa(validarBaixaRequest);
        return ret;
    }

}
