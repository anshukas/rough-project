
package fibonacci.ws;

public interface Fibonacci extends java.rmi.Remote {

	public int calculateFibonacci (int in0) throws java.rmi.RemoteException;

}
