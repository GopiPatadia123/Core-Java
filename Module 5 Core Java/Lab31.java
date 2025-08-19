package Assignment;

import java.util.Scanner;

public class Lab31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		//User Input
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A = ");
		a=sc.nextInt();
		
		System.out.println("Enter B = ");
		b=sc.nextInt();
		
		//try catch and finally blocks..
		try {
			int result=a/b;
		}catch(ArithmeticException e) {
			System.out.println("Exception!! a is not divide by zero..");
		}finally {
			System.out.println("This is Finally Block..It Always Execute..");
		}
		System.out.println("Program Continue...");
	}

}
