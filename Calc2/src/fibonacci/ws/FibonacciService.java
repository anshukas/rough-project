
package fibonacci.ws;

public interface FibonacciService extends javax.xml.rpc.Service {

	public java.lang.String getfibonacciAddress();

	public fibonacci.ws.Fibonacci getfibonacci() throws javax.xml.rpc.ServiceException;

	public fibonacci.ws.Fibonacci getfibonacci(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
