package Assignment;

class vehical{	//parent class 
	void start() {
		System.out.println("Started..");
	}
	void stop() {
		System.out.println("Stop..");
	}
}
class car extends vehical{	//child class
	void drive() {
		System.out.println("Car is Drived..");
	}
	void horn() {
		System.out.println("Horn: Beep Beep..");
	}
}
class sportscar extends car{
	//override method
	void horn() {
		System.out.println("Horn: Vroom!!");
	}
}
public class Lab16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sportscar obj=new sportscar();
		//car obj1=new car();
		//obj1.horn();
		obj.start();
		obj.stop();
		obj.drive();
		obj.horn();
	}

}
