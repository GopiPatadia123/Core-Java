package Assignment;
class Student{
	String name;
	int age;
	
	//Constructor
	Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void dispStud() {
		System.out.println("Student Name : "+name);
		System.out.println("Student Age : "+age);
	}
}
public class Lab9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud=new Student("ABC", 20);
		stud.dispStud();
	}
}
