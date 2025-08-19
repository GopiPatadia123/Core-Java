package Assignment;

class Emp{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
}
public class Lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp obj=new Emp();
		obj.setId(25);
		System.out.println(obj.getId());
	}
}
