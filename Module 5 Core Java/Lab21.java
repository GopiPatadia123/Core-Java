package Assignment;

public class Lab21 {
	public static boolean isPalindrom(String str) {
		String reverseStr="";
		int i;
		for(i=str.length()-1;i>=0;i--) {
			reverseStr+=str.charAt(i);
		}
		return str.equalsIgnoreCase(reverseStr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		String revstr="";
		char ch;
		int i;
		
		for(i=0;i<str.length();i++) {
			ch=str.charAt(i);
			revstr=ch+revstr;
		}
		System.out.println(revstr);
		if(isPalindrom(str)) {
			System.out.println(str+" is Palindrom");
		}
		else {
			System.out.println(str+" is Not Palindrom");
		}
	}

}
