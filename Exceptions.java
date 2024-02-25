//Program to handle arithmetic exception.

import java.util.Scanner;

public class Exceptions {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two integers to divide: ");
		int a=s.nextInt();
		int b=s.nextInt();
		try {
			int result=a/b;
			System.out.println("Result = "+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error: division by zero.");
			System.out.println(e);
		}
	}
}
