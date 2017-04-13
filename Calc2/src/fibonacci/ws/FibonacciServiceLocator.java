
package fibonacci.ws;

import java.net.URL;
import java.net.MalformedURLException;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

public class FibonacciServiceLocator extends org.apache.axis.client.Service implements fibonacci.ws.FibonacciService {

	private String fibonacciWSDDServiceName;

	public FibonacciServiceLocator (String fibonacciWSDDServiceName) {
		this.fibonacciWSDDServiceName = fibonacciWSDDServiceName;
	}

	// Use to get a proxy class for fibonacci
	private String fibonacci_address = "http://localhost:8079/axis/services/fibonacci";

	public String getfibonacciAddress() {
		return fibonacci_address;
	}

	public void setfibonacciEndpointAddress (String address) {
		fibonacci_address = address;
	}

	public String getfibonacciWSDDServiceName() {
		return fibonacciWSDDServiceName;
	}

	public fibonacci.ws.Fibonacci getfibonacci() throws ServiceException {
	   URL endpoint;
		try {
			endpoint = new URL(fibonacci_address);
		} catch (MalformedURLException e) {
			throw new ServiceException(e);
		}
		return getfibonacci(endpoint);
	}

	public fibonacci.ws.Fibonacci getfibonacci (URL portAddress) throws ServiceException {
		try {
			fibonacci.ws.FibonacciSoapBindingStub _stub = new fibonacci.ws.FibonacciSoapBindingStub(portAddress, this);
			_stub.setPortName(getfibonacciWSDDServiceName());
			_stub.setServiceName(fibonacciWSDDServiceName);
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	/**
	 * For the given interface, get the stub implementation.
	 * If this service has no port for the given interface, then ServiceException is thrown.
	 */
	public Remote getPort (Class serviceEndpointInterface) throws ServiceException {
		try {
			if (fibonacci.ws.Fibonacci.class.isAssignableFrom(serviceEndpointInterface)) {
				if ("fibonacci".equals(fibonacciWSDDServiceName)) {
					fibonacci.ws.FibonacciSoapBindingStub _stub = new fibonacci.ws.FibonacciSoapBindingStub(new URL(fibonacci_address), this);
					_stub.setPortName(fibonacciWSDDServiceName);
					_stub.setServiceName(fibonacciWSDDServiceName);
					return _stub;
				} else if ("fibonacci-sec".equals(fibonacciWSDDServiceName)) {
					fibonacci.ws.FibonacciSoapBindingStub _stub = new fibonacci.ws.FibonacciSoapBindingStub(new URL(fibonacci_address), this);
					_stub.setPortName(fibonacciWSDDServiceName);
					_stub.setServiceName(fibonacciWSDDServiceName);
					return _stub;
				}
			}
		} catch (Throwable t) {
			throw new ServiceException(t);
		}
		throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation.
	 * If this service has no port for the given interface, then ServiceException is thrown.
	 */
	public Remote getPort (QName portName, Class serviceEndpointInterface) throws ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		String inputPortName = portName.getLocalPart();
		if ("fibonacci".equals(inputPortName) || "fibonacci-sec".equals(inputPortName)) {
			return getfibonacci();
		} else  {
			Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public QName getServiceName() {
		return new QName("urn:fibonacci", "FibonacciService");
	}

	private HashSet ports = null;

	public Iterator getPorts() {
		if (ports == null) {
			ports = new HashSet();
			ports.add(new QName("urn:fibonacci", "fibonacci"));
		}
		return ports.iterator();
	}

	/**
	* Set the endpoint address for the specified port name.
	*/
	public void setEndpointAddress (String portName, String address) throws ServiceException {
		if ("fibonacci".equals(portName) || "fibonacci-sec".equals(portName)) {
			setfibonacciEndpointAddress(address);
		} else { // Unknown Port Name
			throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	* Set the endpoint address for the specified port name.
	*/
	public void setEndpointAddress (QName portName, String address) throws ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
