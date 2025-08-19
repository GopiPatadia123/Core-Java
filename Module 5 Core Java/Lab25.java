package Assignment;

class College{
	//constructor
	College() {
		System.out.println("This is College Class!!");
	}
}

class student extends College{
	//constructor
	student() {
		super();
		System.out.println("This is Student class!!");
	}
}

public class Lab25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
	}

}
