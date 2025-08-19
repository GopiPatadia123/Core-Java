package Assignment;
//First Interface
interface interfaceA{
	void MethodA();
}
//second interface
interface interfaceB{
	void MethodB();
}
//third interface
interface interfaceC{
	void MethodC();
}

class Sample implements interfaceA,interfaceB,interfaceC{

	@Override
	public void MethodC() {
		// TODO Auto-generated method stub
		System.out.println("Method C Invoked!!");
	}

	@Override
	public void MethodB() {
		// TODO Auto-generated method stub
		System.out.println("Method B Invoked!!");
	}

	@Override
	public void MethodA() {
		// TODO Auto-generated method stub
		System.out.println("Method A Invoked!!");
	}
	
}
public class Lab27 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s=new Sample();
		s.MethodA();
		s.MethodB();
		s.MethodC();
	}

}
