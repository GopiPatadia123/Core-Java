package Assignment;

public class Lab32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Throw Arithmetic Exception
			int result=10/0;
				
			//ArrayIndexOutOfBound Exception
			int[] a=new int[5];
			System.out.println(a[10]);
			
			//NullPointer Exception
			String mystring=null;
			mystring.length();
			
		}catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Caught = "+e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bound Exception Caught = "+e.getMessage());
		}catch(Exception e) {//Generally Caught All Exception 
			System.out.println("General Exception Caught = "+e.getMessage());
		}
	}
}
