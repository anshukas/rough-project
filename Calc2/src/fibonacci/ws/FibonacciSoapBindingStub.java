
package fibonacci.ws;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Enumeration;
import java.util.Vector;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;

public class FibonacciSoapBindingStub extends org.apache.axis.client.Stub implements fibonacci.ws.Fibonacci {

	private Vector cachedSerClasses = new Vector();
	private Vector cachedSerQNames = new Vector();
	private Vector cachedSerFactories = new Vector();
	private Vector cachedDeserFactories = new Vector();

	static org.apache.axis.description.OperationDesc _operation;

	static {
		_initOperationDesc1();
	}

	private static void _initOperationDesc1() {
		org.apache.axis.description.OperationDesc oper = new org.apache.axis.description.OperationDesc();
		oper.setName("calculateFibonacci");
		org.apache.axis.description.ParameterDesc param = new org.apache.axis.description.ParameterDesc(
				new QName("", "in0"),
				org.apache.axis.description.ParameterDesc.IN,
				new QName("http://www.w3.org/2001/XMLSchema", "int"),
				int.class,
				false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
		oper.setReturnClass(int.class);
		oper.setReturnQName(new QName("", "calculateFibonacciReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operation = oper;
	}

	private String serviceName = "fibonacci";

	public FibonacciSoapBindingStub() throws org.apache.axis.AxisFault {
		 this(null);
	}

	public FibonacciSoapBindingStub (URL endpointURL, Service service) throws org.apache.axis.AxisFault {
		 this(service);
		 super.cachedEndpoint = endpointURL;
	}

	public FibonacciSoapBindingStub (Service service) throws org.apache.axis.AxisFault {
		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		} else {
			super.service = service;
		}
		((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
			Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
			Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
			Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
			Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
			Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
			Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
			Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
			Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
			Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
			Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
			QName qName = new QName("urn:"+serviceName, "ArrayOf_xsd_int");
			cachedSerQNames.add(qName);
			Class cls = int[].class;
			cachedSerClasses.add(cls);
			qName = new QName("http://www.w3.org/2001/XMLSchema", "int");
			QName qName2 = null;
			cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
			cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());
	}

	public void setServiceName (String serviceName) {
		this.serviceName = this.serviceName;
	}

	protected org.apache.axis.client.Call createCall() throws RemoteException {
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
			Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
					_call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						Class cls = (Class) cachedSerClasses.get(i);
						QName qName = (QName) cachedSerQNames.get(i);
						Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							Class sf = (Class) cachedSerFactories.get(i);
							Class df = (Class) cachedDeserFactories.get(i);
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
		} catch (Throwable _t) {
			throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
		}
	}

	public int calculateFibonacci (int in0) throws RemoteException {
		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operation);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new QName("urn:"+serviceName, "calculateFibonacci"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			Object _resp = _call.invoke(new Object[] {new Integer(in0)});

			if (_resp instanceof RemoteException) {
				throw (RemoteException)_resp;
			} else {
				extractAttachments(_call);
				try {
					return ((Integer) _resp).intValue();
				} catch (Exception _exception) {
					return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}
}
