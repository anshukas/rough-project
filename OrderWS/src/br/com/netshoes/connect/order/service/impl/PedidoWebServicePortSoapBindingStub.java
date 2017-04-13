/**
 * PedidoWebServicePortSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.netshoes.connect.order.service.impl;

public class PedidoWebServicePortSoapBindingStub extends org.apache.axis.client.Stub implements br.com.netshoes.connect.order.service.impl.PedidoWebService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("alterarStatusPedido");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AlterarStatusPedidoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("commerce:connect", "AlterarStatusPedidoRequest"), connect.AlterarStatusPedidoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("commerce:connect", "Result"));
        oper.setReturnClass(connect.Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listarNovosPedidos");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ListarNovosPedidosRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("commerce:connect", "ListarNovosPedidosRequest"), connect.ListarNovosPedidosRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("commerce:connect", "ListarPedidosResponse"));
        oper.setReturnClass(connect.ListarPedidosResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarBaixa");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValidarBaixaRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("commerce:connect", "ValidarBaixaRequest"), connect.ValidarBaixaRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("commerce:connect", "Result"));
        oper.setReturnClass(connect.Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public PedidoWebServicePortSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PedidoWebServicePortSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PedidoWebServicePortSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("commerce:connect", "AlterarStatusPedidoRequest");
            cachedSerQNames.add(qName);
            cls = connect.AlterarStatusPedidoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "Boleto");
            cachedSerQNames.add(qName);
            cls = connect.Boleto.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "Cartao");
            cachedSerQNames.add(qName);
            cls = connect.Cartao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "Cupom");
            cachedSerQNames.add(qName);
            cls = connect.Cupom.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "Debito");
            cachedSerQNames.add(qName);
            cls = connect.Debito.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "Endereco");
            cachedSerQNames.add(qName);
            cls = connect.Endereco.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "Entrega");
            cachedSerQNames.add(qName);
            cls = connect.Entrega.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "ListarNovosPedidosRequest");
            cachedSerQNames.add(qName);
            cls = connect.ListarNovosPedidosRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "ListarPedidosResponse");
            cachedSerQNames.add(qName);
            cls = connect.ListarPedidosResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "Message");
            cachedSerQNames.add(qName);
            cls = connect.Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "messageStatus");
            cachedSerQNames.add(qName);
            cls = connect.MessageStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("commerce:connect", "orderShipmentStatus");
            cachedSerQNames.add(qName);
            cls = connect.OrderShipmentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("commerce:connect", "Pagamento");
            cachedSerQNames.add(qName);
            cls = connect.Pagamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "PagamentoOnline");
            cachedSerQNames.add(qName);
            cls = connect.PagamentoOnline.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "Pedido");
            cachedSerQNames.add(qName);
            cls = connect.Pedido.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "PedidoSku");
            cachedSerQNames.add(qName);
            cls = connect.PedidoSku.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "Personalizacao");
            cachedSerQNames.add(qName);
            cls = connect.Personalizacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "Programa");
            cachedSerQNames.add(qName);
            cls = connect.Programa.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "Result");
            cachedSerQNames.add(qName);
            cls = connect.Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("commerce:connect", "shipmentSubStatus");
            cachedSerQNames.add(qName);
            cls = connect.ShipmentSubStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("commerce:connect", "Status");
            cachedSerQNames.add(qName);
            cls = connect.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("commerce:connect", "statusEntrega");
            cachedSerQNames.add(qName);
            cls = connect.StatusEntrega.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("commerce:connect", "statusPedido");
            cachedSerQNames.add(qName);
            cls = connect.StatusPedido.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("commerce:connect", "tipoPagamento");
            cachedSerQNames.add(qName);
            cls = connect.TipoPagamento.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("commerce:connect", "ValidarBaixaRequest");
            cachedSerQNames.add(qName);
            cls = connect.ValidarBaixaRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "ArrayOf_tns1_Entrega");
            cachedSerQNames.add(qName);
            cls = connect.Entrega[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("commerce:connect", "Entrega");
            qName2 = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "ArrayOf_tns1_Message");
            cachedSerQNames.add(qName);
            cls = connect.Message[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("commerce:connect", "Message");
            qName2 = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "ArrayOf_tns1_Pagamento");
            cachedSerQNames.add(qName);
            cls = connect.Pagamento[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("commerce:connect", "Pagamento");
            qName2 = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "ArrayOf_tns1_Pedido");
            cachedSerQNames.add(qName);
            cls = connect.Pedido[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("commerce:connect", "Pedido");
            qName2 = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "ArrayOf_tns1_PedidoSku");
            cachedSerQNames.add(qName);
            cls = connect.PedidoSku[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("commerce:connect", "PedidoSku");
            qName2 = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "ArrayOf_tns1_Personalizacao");
            cachedSerQNames.add(qName);
            cls = connect.Personalizacao[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("commerce:connect", "Personalizacao");
            qName2 = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "ArrayOf_tns1_Programa");
            cachedSerQNames.add(qName);
            cls = connect.Programa[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("commerce:connect", "Programa");
            qName2 = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "ArrayOf_tns2_Entrega");
            cachedSerQNames.add(qName);
            cls = pedidoRequest.Entrega[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("pedidoRequest", "Entrega");
            qName2 = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "ArrayOf_xsd_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://impl.service.order.connect.netshoes.com.br/", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("pedidoRequest", "Entrega");
            cachedSerQNames.add(qName);
            cls = pedidoRequest.Entrega.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("pedidoRequest", "Pedido");
            cachedSerQNames.add(qName);
            cls = pedidoRequest.Pedido.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public connect.Result alterarStatusPedido(connect.AlterarStatusPedidoRequest alterarStatusPedidoRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("commerce:connect", "alterarStatusPedido"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {alterarStatusPedidoRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (connect.Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (connect.Result) org.apache.axis.utils.JavaUtils.convert(_resp, connect.Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public connect.ListarPedidosResponse listarNovosPedidos(connect.ListarNovosPedidosRequest listarNovosPedidosRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("commerce:connect", "listarNovosPedidos"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {listarNovosPedidosRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (connect.ListarPedidosResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (connect.ListarPedidosResponse) org.apache.axis.utils.JavaUtils.convert(_resp, connect.ListarPedidosResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public connect.Result validarBaixa(connect.ValidarBaixaRequest validarBaixaRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("commerce:connect", "validarBaixa"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {validarBaixaRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (connect.Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (connect.Result) org.apache.axis.utils.JavaUtils.convert(_resp, connect.Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
