package Assignment;
//custom exception
class customException extends Exception{
	public void customcheckedException(String message) {
		System.out.println(message);
	}
}

public class Lab33 {
	
	public static void validvalue(int n) throws customException{
		if(n<0) {
			System.out.println("Not Allow Negetive Value = "+n);
		}
		System.out.println("Valid Value = "+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validvalue (-5);
			validvalue(25);
		}catch (Exception e) {
			System.out.println("Custom Exception = "+e.getMessage());
		}
	}
}
