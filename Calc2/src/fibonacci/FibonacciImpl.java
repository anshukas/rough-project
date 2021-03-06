package fibonacci;

public class FibonacciImpl implements Fibonacci {

	// Method to calculate the fibonacci sequence
	public int calculateFibonacci (int num) {

		if (num <= 0) return 0;
		if (num == 1) return 1;

		int previous1 = 1, previous2 = 0, fib = 0;

		for (int i=2; i <= num; i++) {
			// the fib is the answer of the previous two answers
			fib = previous1 + previous2;

			// reset the previous values
			previous2 = previous1;
			previous1 = fib;
		}

		return fib;
	}
}

