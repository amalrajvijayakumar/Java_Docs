package self;

public class Star {

public static void main(String[] args) {
	Star patterns = new Star();
//	patterns.first();
	patterns.second();
	patterns.three();
}

private void three() {
	// TODO Auto-generated method stub
	int rows=5;  
	for (int i = 1; i <= rows; i++)
       {
           for (int j = 1; j <= i; j++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
}

private void second() {
	// TODO Auto-generated  method stub
	for(int j=5; j>=1; j--) 
	{
	for(int i=j; i<=5; i++)
	{
	System.out.print("* ");
	}
	System.out.println();
}
}

private void first() {
	// TODO Auto-generated method stub
	for(int j=5; j>=1; j--) {
	for(int i=1; i<=j; i++)
	System.out.print(  "* ");
	System.out.println();}
}
}