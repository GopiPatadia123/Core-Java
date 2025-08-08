package Assignment;
import java.util.Scanner;

public class Lab7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
		
		System.out.println("-----MENU-----");
		System.out.println("1 For Option 1");
		System.out.println("2 For Option 2");
		System.out.println("3 For Exit");
		System.out.println("Enter Your Choice : ");
		
		ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("You Choose 1");
			break;
			
		case 2:
			System.out.println("You Choose 2");
			break;
			
		case 3:
			System.out.println("Thank You!!");
			break;
		}
	}
}
