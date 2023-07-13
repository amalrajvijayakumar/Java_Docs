package forGit;

public class Practice_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice_Pattern pp = new Practice_Pattern();
//		pp.pattern1();
//		pp.pattern2();
//		pp.pattern3();
//		pp.pattern4();
//		pp.pattern5();
		pp.pattern6();
	}


	private void pattern6() {
		// TODO Auto-generated method stub
		for (int count=1; count<=15; count++){
		for(int no=1; no<=count-5; no++)
		{ System.out.print("*" + "\t"); }
		System.out.println();
	}
	}
	private void pattern5() {
		// TODO Auto-generated method stub
	   int no = 1;
	  for (int row = 1; row <= 5; row++) {
	  for (int col = 1; col <= row; col++) { 	 
		 System.out.print( no + "\t");
	 no++;
       }
	  System.out.println();
   }
  }
		

	private void pattern4() {
		// TODO Auto-generated method stub
		System.out.println("PATTERN 4");
		for(int count=1; count<=15;  count++)
		{
			for(int no =1; no<=count; no++)
		{
			System.out.print(count+ " ");
		}
		System.out.println();
		}
	}	 
	private void pattern3() {
		// TODO Auto-generated method stub
		System.out.println("PATTERN 3");
		for(int count=1; count<=5;  count++)
		{
			for(int no =1; no<=count; no++)
		{
			System.out.print(count+ " ");
			
		}
		System.out.println();
	}
	}
	private void pattern2() {
		// TODO Auto-generated method stub
		for(int count=1; count<=5; count++)
		{
		for(int no=1; no<=count; no++)
		{
	System.out.print("* ");
	}
		System.out.println();
		}
}
	   
	
	
	private void pattern1() {
		// TODO Auto-generated method stub
		for(int count=1; count<=5; count++)
		{
		for(int no=1; no<=15; no++)
		{
	System.out.print(no + " ");
	}
		System.out.println();
		}
}
}