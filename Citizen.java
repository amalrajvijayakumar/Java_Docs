package Oops_Learning;

public class Citizen extends Parents 

implements  Zoho, StateGovt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Govt officer = new Citizen(); //dyanaic binding
		officer.displalyAddressProof();
		
		Citizen citizen1 = new Citizen();
		Citizen citizen2 = new Citizen();
		citizen1.watchMovies();
		citizen2.displalyAddressProof();
		citizen2.change2000Rupees();
		
		System.out.println(Govt.fine);
		System.out.println(Govt.last_date);
		}
	
	public void watchMovies() {
		System.out.println("Watching movies");
	}

	@Override
	public void change2000Rupees() {
		// TODO Auto-generated method stub
		System.out.println("Change in  Bank");
	}

	@Override
	public void displayIDproof() {
		// TODO Auto-generated method stub
		System.out.println("Aadhaar card");
	}

	@Override
	public void displalyAddressProof() {
		// TODO Auto-generated method stub
		System.out.println("Ration Card");
	}

	@Override
	public void wearHelmet() {
		// TODO Auto-generated method stub
		System.out.println("Follow traffic rules");
	}

	@Override
	public void develop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void study() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void work() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void provide_electricity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lay_roads() {
		// TODO Auto-generated method stub
		
	}

}
