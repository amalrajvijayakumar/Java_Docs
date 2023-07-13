package forGit;

public class Spy_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int given =123; //Input number
		Spy_Num fs = new Spy_Num();
		int Sum = fs.find_sum_of_digits(given);
		int Multiple= fs.find_multiple(given);
	
	if (Multiple == Sum)
	{
	System.out.println("Given No is Spy Number");
	}
	else
	{
		System.out.println("Given No. is Not A Spy Number");
	}
	}
int find_multiple(int no)
{
	int mul=1;
	while(no>0)     
	{
		int no2=no%10;
		mul=mul*no2;
		no=no/10;	
	}
	return mul;
}
	
	
	
	int find_sum_of_digits(int no)
	{
		int sum =0, ans;
		while(no>0)
		{
			ans=no%10;
			sum=sum + ans;
			no = no/10;
		}
		return sum;
	}
}
