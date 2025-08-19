package Assignment;
//import java.util.Scanner;

public class Lab12 {
	public static int findMax(int n1,int n2,int n3){
		
		if(n1>=n2 && n1>=n3)
		{
			return n1;
		}
		else if(n2>=n1 && n2>=n3) {
			return n2;
		}
		else {
			return n3;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		int a=15,b=25,c=32;
		int max=findMax(a,b,c);
		
		/*System.out.println("Enter Number 1 : ");
		sc.nextInt();
		
		System.out.println("Enter Number 2 : ");
		sc.nextInt();
		
		System.out.println("Enter Number 3 : ");
		sc.nextInt();*/
		
		System.out.println("The Maximum Number Out Of 3 Number Is : "+max);
	}

}
