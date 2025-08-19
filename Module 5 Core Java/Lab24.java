package Assignment;

class shape{
	void draw() {
		System.out.println("Drawing Shape!!!");
	}
}

class traingle extends shape{
	void draw() {
		System.out.println("Draw Triangle!!!");
	}
}

class circle extends shape{
	void draw() {
		System.out.println("Draw Circle!!!");
	}
}

public class Lab24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s=new shape();
		s.draw();
		traingle t= new traingle();
		t.draw();
		circle c=new circle();
		c.draw();
		
	}

}
