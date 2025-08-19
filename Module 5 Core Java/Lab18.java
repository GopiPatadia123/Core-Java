package Assignment;
class Person{
	String name;
	int age;
	//default constructor no parameter
	Person(){
		System.out.println("Constructor Calling!!");
	}
	//Constructor with parameter
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void Disp() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
public class Lab18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person("Abc", 15);
		p1.Disp();
	}
}
