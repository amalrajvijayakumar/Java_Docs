package forGit;

public class Multiple {
public static void main (String[]args){
	Multiple mp = new Multiple();
	mp.find_multiple(7);
}
void find_multiple(int no)
{
int no1 = 1; 
while(no1<=10)
{
System.out.println(no1 + " * 7 = "+ (no1 * no));
no1 = no1 +1; 
}
}
}