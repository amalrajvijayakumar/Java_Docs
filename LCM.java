package Pushed;

import java.util.*;

class LCM{

public static void main(String [] args){
	
	System.out.println("Enter the Numbers");
	Scanner sc = new Scanner(System.in);
	LCM fl = new LCM();

	int num1= sc.nextInt();
	int num2 = sc.nextInt();
	fl.find_lcm(num1,num2);					//first method
	fl.find_least_cmultiples(num1,  num2);	//second method
}
private void find_lcm(int no1, int no2)
{
	int big = no1 > no2 ? no1: no2;		//ternery operator for find big number
	int mul =2;
	int lcm=0;
	
	while(true) {
		if(big%no1 == 0 && big%no2 ==0)
		{
			lcm = big;
			break;}
	else {
		big = big * mul;
		mul=mul+1;}
	}
	System.out.println("LCM is " + lcm);
}


private void find_least_cmultiples(int no1, int no2) {
    int big = no1 > no2 ?no1:no2;   //Terenery operator
    while(true) 
    {
      if((big%no1==0) && (big%no2==0))
      {
        System.out.println("LCM is " + big); 
        break;
      }
      big=big+1;
    } 
  }
}