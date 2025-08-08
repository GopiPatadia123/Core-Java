package Assignment;

public class Lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int a=0,b=1,i=0;
		int fibo;
		System.out.println("Fibonanci Series");
		while(i<n) {
			System.out.println(a+"");
			fibo=a+b;
			a=b;
			b=fibo;
			i++;	
		}
	}

}
