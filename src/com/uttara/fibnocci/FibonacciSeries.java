package com.uttara.fibnocci;

import java.util.Iterator;
public class FibonacciSeries {

	public static void main(String[] args) {
//		try
//		{
//			int a =10;
//			for (int i = 3; i >=0; i--) 
//				System.out.println(a/i);
//			System.out.println("Inside try block");
//			System.exit(1);
//			System.out.println("Inside try block");
//			System.exit(0);
//				 
//				
//		}
//		catch (ArithmeticException e) 
//		{
//			 System.out.println("Inside Arithmetic Exception catch block");
//		}
//	 catch (Exception e)
//		{
//		 System.out.println("Inside catch block");
//		}
//		finally {
//			System.out.println("Inside finally block");
//		}
		fibonacci(10);
	}

	static void fibonacci(int n) {
		int a = 0, b = 1;
		int counter = 0;
		while (counter <=n) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
			counter++;
		}
		
	}

}
