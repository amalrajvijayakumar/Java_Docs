package Oops_Learning;

public class EShowRoom {

	int price;
	int discount;
	
	EShowRoom()
	{
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EShowRoom tv = new EShowRoom(30000, 10); 
	    EShowRoom fridge = new EShowRoom(); 
	    EShowRoom wm = new EShowRoom(); 
	    EShowRoom ac = new EShowRoom(25000,5); 
	    tv.buy(); 
	    ac.buy();
	}
	
public EShowRoom(int price, int discount) {
	    // TODO Auto-generated constructor stub
		this.price = price; 
	    this.discount = discount;
		System.out.println("Price is " + price);
	    System.out.println("Discount is "+ discount);
}
	private void buy() {
	    // TODO Auto-generated method st
	    System.out.println(price);
	    System.out.println(discount);
}
}
