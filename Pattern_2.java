package PatternPrograms;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_2 p2 = new Pattern_2();
		p2.pattern1();
//		p2.pattern2();
//		p2.pattern3();		
		}

	private void pattern3() {
		// TODO Auto-generated method stub
		int lines = 6;
		for (int i = 1; i <= lines; i++){
		  for (int j = lines - i + 1; j >= 1; j--){
		    System.out.print (" " + j );
		  }System.out.println();
	}
		
	}
	private void pattern2() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
            
            for (int j = i; j > 0; j--) {
                System.out.print("  ");
            }
            
            for (int k =i; k > 0; k--) {
                System.out.print(( i) + " ");
            }
            
            System.out.println();
        }
    }

	private void pattern1() {
		// TODO Auto-generated method stub
		System.out.println("PATTERN 1");
		for(int i=5; i>0; i--) {


			for(int j=1; j<=5; j++)
		{
			System.out.print( "* ");
		}
		System.out.println();
	}
	}
	}
	

