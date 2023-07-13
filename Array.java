package Oops_Learning;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array ai = new Array();
//ai.left_array();
ai.right_array();
	}

	private void right_array() {
		// TODO Auto-generated method stub
		char[] name = {'s','t','a','l','i','n'}; 
		int i = 0, j = name.length-1; 

		while(i<j)
		{
		char temp = name[i]; 
		name[i] = name[j]; 
		name[j] = temp; 
		i++; 
		j--; 
		}
		for(int k=0; k<name.length; k++)
		{
		System.out.print(name[k]+" "); 
		}
	}

	private void left_array() {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40}; 
	    //for(int j=1;j<=2; j++)
		{
	    int temp = a[0]; 
	    int i = 0; 
	    while(i<a.length-1)
	    {
	    a[i] = a[i+1]; 
	    System.out.print(a[i] + " "); 
	    i++; 
	    }
	    a[i] = temp; 
	    System.out.print(a[i] + " "); 
	    }	}

}
