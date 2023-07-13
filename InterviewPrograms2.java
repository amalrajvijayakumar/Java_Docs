package self;

public class InterviewPrograms2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterviewPrograms2 ip = new InterviewPrograms2();
		ip.program();
	
				}

	private void program() //Output = 11
	{
		int[] A= {0,5,6,0,9,0,0,1};
		int sum =0;
		int big =0;
		
		for(int i=0; i<A.length-1; i++) {
			sum = A[i]+A[i+1];
			if(big<sum) {
			big = sum;
			}
		}
		System.out.println("Big Sum number is " + big);
	}
}


//Unsorted Array to continous pair 
//Largest sum value from the given array
