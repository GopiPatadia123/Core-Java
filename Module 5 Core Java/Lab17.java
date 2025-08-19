package Assignment;

class StudInfo{
	int rno;
	String name;
	int age;
	//paramterized constructor
	public StudInfo(int rno, String name, int age) {
		// TODO Auto-generated constructor stub
		this.rno=rno;
		this.name=name;
		this.age=age;
	}
	
	public void Disp() {
		// TODO Auto-generated method stub
		System.out.println("Roll No : "+rno);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}

public class Lab17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudInfo s=new StudInfo(1,"Abc",15);
		s.Disp();
	}

}
