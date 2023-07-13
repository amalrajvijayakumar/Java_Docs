package Oops_Learning;

public class Gpay {
	
private int pwd = 1234;
	
private	void pay()
	{
		System.out.println ("Paying through Gpay");
	}
public static void main(String[] args) {
	Gpay gpayObject = new Gpay();
	gpayObject.pay();
	System.out.println(gpayObject.pwd);
}
}
