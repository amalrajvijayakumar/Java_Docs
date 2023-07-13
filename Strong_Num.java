package forGit;

public class Strong_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =145;
		Strong_Num fs = new Strong_Num(); //object 
		int result =fs.find_strong(num); //Method call 

System.out.println(result);//for refer print the result
	if(num==result)
System.out.println("Given No. is Strong Number");
	else
System.out.println("Given No not a Strong Number");
	}
	
int find_strong(int num)//Method 
	{
	int sum=0;
	while(num>0)
		{
		int rem=num%10; //5 is remaining
		sum=sum+factorial(rem);//0+factorialof(1*2*3*4*5)
		num=num/10;	
		}	
	return sum;
	}

int factorial(int num) //5 is input
	{
	int fact=1; //initializing variable
	while(num>0) //1<=5
	{
		fact=fact*num;
		num = num-1;
}
return fact;
}
	}

