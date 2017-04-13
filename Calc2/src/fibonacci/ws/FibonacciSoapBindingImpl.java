
package fibonacci.ws;

import fibonacci.FibonacciImpl;

public class FibonacciSoapBindingImpl implements fibonacci.ws.Fibonacci{

	FibonacciImpl impl = new FibonacciImpl();

	public int calculateFibonacci(int in0) throws java.rmi.RemoteException {
		return impl.calculateFibonacci(in0);
	}

}
