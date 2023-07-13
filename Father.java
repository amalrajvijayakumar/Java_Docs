package Thanjavur;

public abstract class Father {
	private int amount = 1000000;


	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		if (amount>10000000)
		this.amount = amount;
	}
	void yield()
	{
		System.out.println("Yield Paddy");
	}
	protected void share_assets()
	{
		System.out.println("Sharing Assets");
	}
	abstract void sleep();
}
