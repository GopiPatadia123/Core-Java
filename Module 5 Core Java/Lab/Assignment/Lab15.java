package Assignment;

class Employee{
	void sal(int s) {
		System.out.println(s);
	}
}

class Manage extends Employee{
	void countSal(int cs) {
		System.out.println(cs);
	}
}

public class Lab15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manage obj=new Manage();
		obj.countSal(25000);
		obj.sal(20000);
	}

}
