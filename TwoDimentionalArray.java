package self;



public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDimentionalArray ad = new TwoDimentionalArray();
//		ad.learning1();
		ad.learning2();
	}

	private void learning2() {
		// TODO Auto-generated method stub
		 int[][] marks = new int[6][];
		    marks[0] = new int[5]; 
		    marks[1] = new int[6];
		    marks[2] = new int[4]; 
		    System.out.println(marks.length);
		    System.out.println(marks[0].length);
		    System.out.println(marks[1].length);
		    System.out.println(marks[2].length);
		  }
	

	private void learning1() 
	{
		// TODO Auto-generated method stub
		int[][] marks = new int[3][5];
	    //quarterly: 
		int exam = 0; 
		int subject = 0; 
	    marks[exam][subject] = 90; subject++;
	    marks[exam][subject] = 98; subject++;
	    marks[exam][subject] = 100; subject++;
	    marks[exam][subject] = 65; subject++;
	    marks[exam][subject] = 78; subject++;

	

	    exam++; 
	    subject = 0; 
	    marks[exam][subject] = 90; subject++;
	    marks[exam][subject] = 92; subject++;
	    marks[exam][subject] = 99; subject++;
	    marks[exam][subject] = 100; subject++;
	    marks[exam][subject] = 95; subject++;
	    

	    //annual
	    exam++; 
	    subject = 0; 
	    marks[exam][subject] = 87; subject++;
	    marks[exam][subject] = 90; subject++;
	    marks[exam][subject] = 95; subject++;
	    marks[exam][subject] = 98; subject++;
	    marks[exam][subject] = 93; subject++;
	    
	    int high =0; int examno=-1;;
	    
	    for(exam = 0; exam<3; exam++) 
	    {
	    	int total = 0;
		    for (subject=0; subject<5; subject++) 
		    {
		    	total = total + marks[exam][subject];
		    }
		    System.out.println("Total Mark "+ total);
		   if(total>high)
		   {
			   examno = exam;//1
			   high = total;
		   }
		  	
	    } 
	    System.out.println("Highest Total " + high + " exam no is " + examno);
	}

}
