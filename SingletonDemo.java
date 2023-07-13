package anotherpackage;

public class SingletonDemo {

	static SingletonDemo sd;
	private SingletonDemo() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sd = new SingletonDemo();
		
		sd.test ();
		sd.display();
		
		}
	public void display() {
		// TODO Auto-generated method stub
		
	}
	public void test() {
		
	}
}
