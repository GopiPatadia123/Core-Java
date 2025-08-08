package Assignment;
//abstract class
abstract class Management{
	abstract void salary();
	void disp() {
		System.out.println("Hello");
	}
}

class Emp1 extends Management{
	void salary() {
		System.out.println("Salary counted!!");
	}
}

public class Lab26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Emp1 e=new Emp1();
		e.salary();
	}

}
