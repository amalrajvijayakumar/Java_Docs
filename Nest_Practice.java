package forGit;

public class Nest_Practice {
	
	public static void main(String[] args) {
	Nest_Practice np = new Nest_Practice();
//	np.pattern1();
//	np.pattern2();
//	np.pattern3();
//	np.pattern4();
//	np.pattern5();
//	np.pattern6();	
	np.pattern7();
	np.pattern8();

}

	private void pattern8() {
		// TODO Auto-generated method stub
//		for(int a=1)
	}

	private void pattern7() {
		// TODO Auto-generated method stub
		for(int no = 5; no>=1; no--)
		{
		for(int star = 1; star<no; star++)
		{   
		  System.out.print("  ");  }
		  for(int num=1; num<=6-no; num++)
		    	{ 
		    	System.out.print(num+ " ");
		    	}
		     System.out.println(); 
		}
	}
	
	private void pattern6() {
		// TODO Auto-generated method stub
		 for(int row=1; row<=5; row++) 
		    {
				for(int no=5; no>=row;no--) 
				{
					System.out.print("* ");
				}
				System.out.println();
				}}

	private void pattern5() {
		// TODO Auto-generated method stub
    for(int row=1; row<=5; row++) 
    {
		for(int no=5; no>=row;no--) 
		{
			System.out.print(no + " ");
		}
		System.out.println();
		}
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		for(int count =5;count>0; count--)
		{
		for (int no =1; no<=count; no++)
		{
			System.out.print(no + " ");
		}
		System.out.println();
		
	}
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		for (int no=1; no<=25; no++)
		{
			System.out.print(no + " ");
			if(no%5 ==0) {
		
		System.out.println();
			}
	}
}
	private void pattern2() {
		// TODO Auto-generated method stub
//		int count = 1;
		for(int count=1 ; count<3; count++)
//		while(count<=2) 
			{
		for (int no=5; no>0; no--)
		{
			System.out.print(no + " ");
		}
		System.out.println();
//		count++;
	}
	}
	private void pattern1() {
		// TODO Auto-generated method stub
		int count =1;
		while(count<=5) {
		for (int no =1; no<=4; no++)
		{
			System.out.print(" " +no );
		}
		System.out.println();
		count++;}
	}
}
