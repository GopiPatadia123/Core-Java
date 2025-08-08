package Assignment;

class calculator{
	void add(int a,int b) {
		System.out.println("Addition");
		System.out.println(a+b);
	}
	void sub(int a,int b) {
		System.out.println("Subtraction");
		System.out.println(a-b);
	}
}

class Mycalc extends calculator{
	void div(int a,int b) {
		System.out.println("Division");
		System.out.println(a/b);
	}
	void mul(int a,int b) {
		System.out.println("Multiplication");
		System.out.println(a*b);
	}
}

public class Lab23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mycalc obj=new Mycalc();
		obj.add(20, 25);
		obj.sub(25, 10);
		obj.div(10, 5);
		obj.mul(10, 15);		
	}
}
