package Assignment;
//Interface
interface paymentGateWay{
	void payment();
	void refund();
	void generateReceipt();
}
class CreditCard implements paymentGateWay{

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Payament Is OK!!");
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("No Refund!!");
	}

	@Override
	public void generateReceipt() {
		// TODO Auto-generated method stub
		System.out.println("Receipt Generated!!");
	}
}

public class Lab28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard cc=new CreditCard();
		cc.payment();
		cc.refund();
		cc.generateReceipt();
	}

}
