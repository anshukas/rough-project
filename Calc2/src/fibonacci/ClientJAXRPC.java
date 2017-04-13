package fibonacci;

import javax.xml.rpc.Stub;

public class ClientJAXRPC {

	public static void main (String[] args) throws Exception {
		int n1 = Integer.parseInt(args[0]);

		int port = 8080;
		if (args.length > 1)
			port = Integer.parseInt(args[1]);

		boolean wss = false;
		if (args.length > 2)
			wss = "true".equals(args[2]);

		// Make a service
		fibonacci.ws.FibonacciService service = new fibonacci.ws.FibonacciServiceLocator(wss ? "fibonacci-sec" : "fibonacci");

		// Now use the service to get a stub which implements the SDI.
		fibonacci.ws.Fibonacci fib = service.getfibonacci();

		Stub stub = (Stub) fib;
		stub._setProperty(Stub.USERNAME_PROPERTY, "wsuser");
		stub._setProperty(Stub.PASSWORD_PROPERTY, "wspwd");

		stub._setProperty(Stub.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:"+port+"/axis/services/fibonacci"+(wss?"-sec":""));

		// Make the actual call
		int result = fib.calculateFibonacci(n1);
		System.out.println("Fibonacci("+n1+") = "+result);
	}
}

