package Assignment;

class product{
	String name;
	int price;
	int quantity;
	product(){
		System.out.println("Default Constructor Called!!");
	}
	product(String name){
		this.name=name;
	}
	product(int price,int quantity){
		
		this.price=price;
		this.quantity=quantity;
	}
	void disp() {
		System.out.println("Name is : "+name);
		System.out.println("Price is : "+price);
		System.out.println("Quantity is : "+quantity);
	}
}

public class Lab19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product pr=new product();
		product pr1=new product("Laptop");
		product pr2=new product(25000, 1);
		//pr.disp();
		pr1.disp();
		pr2.disp();
	}
}
