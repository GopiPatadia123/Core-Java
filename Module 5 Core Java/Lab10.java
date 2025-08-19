package Assignment;

class Stud{
	String name,major;
	int age;
	
	//Constructor
	 Stud() {
	        this.name = "Unknown";
	        this.age = 0;
	        System.out.println("Default constructor called.");
	    }
	 Stud(String name,int age) {
		this.name=name;
		this.age=age;
	}
	Stud(String name, int age,String major) {
	        this.name = name;
	        this.age = age;
	        this.major=major;
	        System.out.println("Constructor with name, age, and major called.");
	    }
	void displayStud() {
        System.out.println("Name: " + name + ", Age: " + age + ", Major: " + major);
    }

}
public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud student1 = new Stud(); // Calls default constructor
        Stud student2 = new Stud("Gopi", 25); // Calls constructor with name and age
        Stud student3 = new Stud("Vihar", 27, "Engineer"); // Calls constructor with name, age, and major

        System.out.println("\nStudent Information:");
        student1.displayStud();
        student2.displayStud();
        student3.displayStud();
	}

}
