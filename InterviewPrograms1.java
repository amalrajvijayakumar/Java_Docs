package self;

//Interview Program  Practice

public class InterviewPrograms1 {
	public static void main(String[] args) {
		InterviewPrograms1 ip = new InterviewPrograms1();
		ip.program();
		}

	private void program() {
		// TODO Auto-generated method stub
		int A[] = {4,3, 7, 11, 1};
		int x= 4;
		int y = 10;
	
		if(x<y) {
			int i =0;
			while(i<A.length) {
		
		if(A[i]>x && A[i]<y) 
		{
			System.out.println(A[i]);
			}
			i++;
			}
		}
		else 
		{
			System.out.println("Condition Mismatch");
		}
	
	}
}

//Interview Program  Practice
//
//Test case 1 
//
//N=6; 
// X= 4;  Y= 10
//(X<Y)
//
//A  = 4, 3, 7, 11, 50, 1
//
//Output = 7;
//
//Test case 2 
//
//X= 10;   Y = 14
//
//output = 11;


