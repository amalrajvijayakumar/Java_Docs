package forGit;

public class NestedLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedLoop2 nl = new NestedLoop2();
		nl.pattern1(); //* * * * * 1 - * 1 1 1 1 1
		nl.pattern2(); //5-54-543-5432.,,
		nl.pattern3();
		}
	
	private void pattern3() {
		// TODO Auto-generated method stub
	}
	private void pattern2() {
		// TODO Auto-generated method stub
	    for(int no = 1; no<=5; no++)  //no-row
	    {
	     for(int star = 1; star<=no; star++) //printing star 
	       {   
	        System.out.print("");
	        	}
	         for (int num=1; num<=6-no; num++) //numb-column
	        {
	        System.out.print(num+ " ");  //printing number
	        }
	        System.out.println();
	    }
	}
	private void pattern1() {
		// TODO Auto-generated method stub
		for (int no =5; no>=1; no--)
		{
		for(int star =0; star<no; star++)
		{
			System.out.print("* ");
		}
		for (int num=1; num<=6-no; num++)
		{
		System.out.print(1+ " ");
		}
		System.out.println();
		}
	}
}