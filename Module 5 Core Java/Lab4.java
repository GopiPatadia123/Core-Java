package Assignment;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int a,b;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome To Basic Calculator..!!");
		
		System.out.println("Enter First Number : ");
		a=sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		b=sc.nextInt();
		
		int ch=0;
		System.out.println("Enter Your Choice"+ch);
		ch=sc.nextInt();
	
		switch(ch) {
		//Arithmatic Operators
		case 1:
			System.out.println(a+b);
			break;
			
		case 2:
			System.out.println(a-b);
			break;
			
		case 3:
			System.out.println(a*b);
			break;
			
		case 4:
			System.out.println(a/b);
			break;
			
		case 5:
			System.out.println(a%b);
			break;
			
		//Relational Operators
			
		case 6:
			System.out.println(a==b);
			break;
			
		case 7:
			System.out.println(a!=b);
			break;
			
		case 8:
			System.out.println(a<b);
			break;
			
		case 9:
			System.out.println(a>b);
			break;
			
		case 10:
			System.out.println(a<=b);
			break;
			
		case 11:
			System.out.println(a>=b);
			break;
		default:
			System.out.println("Invalid Choice!!");
		}
		
	}
}