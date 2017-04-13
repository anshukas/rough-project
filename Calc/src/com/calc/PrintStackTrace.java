package com.calc;

import java.util.Arrays;

public class PrintStackTrace {
	public static void main(String[] args) {
		System.out.println("Hello print stack trace without any exception. tht help whn you want to trace.");
		display();
	}

	private static void display() {
		// 
		System.out.println();
		System.out.println(Thread.currentThread().getStackTrace().toString());
		
		System.out.println();
		System.out.print(Arrays.deepToString(Thread.currentThread().getStackTrace()));
		
		System.out.println();
		for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
		    System.out.println(ste.toString());
		}
	}
}
