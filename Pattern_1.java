package PatternPrograms;

public class Pattern_1 {
	public static void main(String[] args) {
		Pattern_1 p1= new Pattern_1();
		p1.Pattern1();
		p1.pattern2();
		p1.pattern3();
		p1.pattern4();
		p1.pattern5();
		p1.pattern6();
		p1.pattern7();
		p1.pattern8();
		
	}

private void pattern8() {
		// TODO Auto-generated method stub
		System.out.println("PATTERN 8");
		for(int j=5; j>=0; j--) {
		for(int i=1; i<=j; i++)
		{
		System.out.print(j + " ");
		}
		System.out.println();
		}
}
	
private void pattern7() {
		// TODO Auto-generated method stub
	int rows=5;
	System.out.println("PATTERN 7");
	for(int j=rows; j>=1; j--) {
	for(int i=j; i>=1; i--)
	{
		System.out.print(i + " ");
	}
	System.out.println();
	}
}

private void pattern6() {
		// TODO Auto-generated method stub
	int rows = 1;
	System.out.println("PATTERN 6");
	for (int i = rows; i <= 5; i++)
	{
		for (int j = i; j <=5 ; j++)
		{
			System.out.print(j + " ");
		}
		System.out.println();
	}
}

private void pattern5() {
		// TODO Auto-generated method stub
		System.out.println("PATTERN 5"); 
		int row = 15;
	        for (int i = 5; i > 0; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(row-- + "\t");
	            }
	            System.out.println();
	        }
	    }
private void pattern4() {
		// TODO Auto-generated method stub
		System.out.println("PATTERN 4"); 
		int row = 1;
	        for (int i = 5; i > 0; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(row++ + "\t");
	            }
	            System.out.println();
	        }
	}   
	
private void pattern3() {
		// TODO Auto-generated method stub
		System.out.println("PATTERN 3");
		int rows=5;
		for (int i = rows; i >= 1; i--)
	        {
	            for (int j = i; j >= 1; j--)
	            {
	                System.out.print(j + " ");
	            }
	            System.out.println();
	        }	
	}

private void pattern2() {
		// TODO Auto-generated method stub
		System.out.println("PATTERN 2");
		for(int j=5; j>0; j--) {

		for(int i=1; i<=j; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}

private void Pattern1() {
		// TODO Auto-generated method stub
		System.out.println("PATTERN 1");
		for(int j=5; j>0; j--) {
		
		for(int i=1; i<=j; i++)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	}
}
