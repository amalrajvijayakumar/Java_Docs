package Thanjavur;

public class Son extends Father {

	public static void main(String[] args) {
		
		Son son = new Son();
		son.share_assets();
		son.yield();
		int father_amount = son.getAmount();
		System.out.println(father_amount);
		son.sleep();		
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		
	}
}
