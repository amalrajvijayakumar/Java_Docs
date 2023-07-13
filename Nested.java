package forGit;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested pn = new Nested();
		pn.pattern1(); //print 1 2 3 4 5
		pn.pattern2(); //print 5 4 3 2 1
		pn.pattern3(); //print 1 2 3 4 5 - 5 times
		pn.pattern4(); //print 1 3 5 7 9
		pn.pattern5(); //print 12345-78910-11..,,
		pn.pattern6(); //print 12345-1234=123..,,
		pn.pattern7(); //print 54321-4321-321..,,
		pn.pattern8(); // *****-****-***-**..,,
		pn.pattern9();
		
	}

private void pattern9() {
	// TODO Auto-generated method stub
	int rows=5;
	   for(int count=1;count<=rows;count++) {
	        
	   for(int no=count;no<=rows;no++) {
	      System.out.print(no+" ");
	        }
	      System.out.println();
	      }
	}
	
	private void pattern8() {
		// TODO Auto-generated method stub
		for(int count=5; count>0; count--)
		//while(count>0) 
			{
		for (int no =1; no<=count; no++)
		{
			System.out.print("*" + "\t");
		}
		//count--;
		System.out.println();
	}
	}
	private void pattern7() {
		// TODO Auto-generated method stub
		int count =0 ; 
		while(count<5) {
		for (int no =5; no>count; no--)
		{
			System.out.print(no + " ");
		}
		count++;
		System.out.println();
		}
	}

	private void pattern6() {
		// TODO Auto-generated method stub
		int count =5;
		while(count>0) 
		{
			for( int no=1; no<=count; no++) {
			System.out.print(no + " ");
		}
		System.out.println();
		count--;
		}
}

	private void pattern5() {
		// TODO Auto-generated method stub
	for (int no =1; no<=15; no++)
	{
		System.out.print(no + " ");
		if(no%5 == 0)
		{
			System.out.println();
		}
	}
}
	private void pattern4() {
		// TODO Auto-generated method stub
		int count =1;
		while(count<=5){
			for (int no=1; no<=9; no+=2)
		{
			System.out.print(no + " ");
		}
			System.out.println();
			count++;
	}
}
	private void pattern3() { //12345
		// TODO Auto-generated method stub
		System.out.println("Pattern 3");
		int count =1;
		while (count<=5) {
		
			for (int no =1; no<=5; no++)
		{
			System.out.print(no + " ");
		}
	count++;
	System.out.println();
	}
	}

	private void pattern2() {  //54321
		// TODO Auto-generated method stub
		System.out.println("Pattern 2");
		int count = 1;
		while(count<=3){
			
		for(int no = 5; no>0; no--)
		
		{System.out.print(no+" "); 
			}
		count++;
		System.out.println();
	}	
	}

	private void pattern1() {			//print 1 2 3 4 5
		System.out.println("Pattern 1");
		for(int no = 1; no<=5; no++)
		{
			System.out.print(no+" "); 
			}
		System.out.println();
	}
}