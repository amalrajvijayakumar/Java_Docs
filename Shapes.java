package Oops_Learning;

public abstract class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instatiation - Object creation
		//we cannot instantiate abstract classes
		Shapes square 	 = new Shapes();
		Shapes rectangle = new Shapes();
		Shapes circle    = new Shapes();
		Shapes cone 	 = new Shapes();
		square.calc_area(40);
		rectangle.calc_area(40,30);
	}

	abstract void calc_area();
	// class - data members, methods
//if at least one method in a class is abstract,
	//then the entire class should be abstract
	 void calc_area(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i*j);
	}

	 void calc_area(int i) {
		// TODO Auto-generated method stub
		System.out.println(i*i);
	}

}
