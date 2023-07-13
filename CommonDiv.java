//package com.learning;
//
//public class CommonDiv {
// 
//	    public static void main(String[] args) {
//	      CommonDiv llObj = new CommonDiv();
//	        llObj.find_common_divisors(100,120);
//	        llObj.find_greatest_cdivisors(100,120);
//	        llObj.find_least_cmultiples(4,6);
//	        llObj.print_11111();
//	        llObj.addition_firstnnum1(5);
//	        int givennum = 145;
//	       
//	        int res = llObj.find_strongnum(givennum);
//	       
//	        if(res == givennum)
//	        {
//	          System.out.println("17.) The Given number is strong number!!!" + givennum );
//	        }
//	        else
//	        {
//	          System.out.println("17.)The Given number is not a strong number!!!");
//	        }
//	    }
//	    private void find_least_cmultiples(int no1, int no2) {
//	      int big = no1 > no2 ?no1:no2;
//
//	      while(true) 
//	      {
//	        if((big%no1==0) && (big%no2==0))
//	        {
//	          System.out.println("LCM is " + big); 
//	          break;
//	        }
//	        big=big+1;
//	      }  
//	      //System.out.println("The LCM is" + greatest);
//	    }
//	    private void find_greatest_cdivisors(int no1, int no2) {
//	      int div = 2,small,greatest=0;
//	      small=no1<no2 ?no1:no2;
//	      while(div<=small)
//	      {
//	        if((no1%div==0) && (no2%div==0))
//	        {
//	          greatest=div;
//	        }
//	        div=div+1;
//	      }
//	      System.out.println("The GCD is" + greatest);
//	      
//	    }
//	    private void find_common_divisors(int no1, int no2) {
//	      int div = 2;
//	      int small= no1 < no2 ?no1:no2;
//	      while(div<=small)
//	      {
//	        if((no1%div==0) && (no2%div==0))
//	        {
//	          System.out.println(div);
//	        }
//	        div=div+1;
//	      }
//	    }  
//	    private int find_factorialofanum(int i) {
//	      int box=1 ;
//	      while(i>0)
//	      {
//	        box= box * i;
//	        i=i-1;
//	      }
//	      return box;
//	    }
//	    private int find_strongnum(int givennum) {
//	      int rem,result=0,fact;
//	      while(givennum>0)
//	      {
//	        rem = givennum%10;
//	        fact = find_factorialofanum(rem);
//	        result = result + fact;
//	        givennum = givennum / 10;
//	      }
//	        return result;
//	    }
//	    private void addition_firstnnum1(int i) {
//	      System.out.println("\n Addition of first "  + i + " numbers");
//	      int sum=0,num=1;
//	      while(num<=i)
//	      {
//	        sum=sum+num;
//	        num=num+1;
//	      }
//	        System.out.println(sum);
//	    }
//	    private void print_11111() {
//	      int num=1;
//	      while(num<=5)
//	      {
//	        System.out.print(1 + " ");
//	        num=num+1;
//	      }
//
//	    }
//
//	  } llObj = new Looping();
//      llObj.find_common_divisors(100,120);
//      llObj.find_greatest_cdivisors(100,120);
//      llObj.find_least_cmultiples(4,6);
//      llObj.print_1111();
//      llObj.addition_firstnnum(5);
//      int givennum = 145;
//	private CommonDiv llObj;
//      int res = llObj.find_strongnum(givennum);
//      if(res == givennum)
//      {
//        System.out.println("17.) The Given number is strong number!!!" + givennum );
//      }
//      else
//      {
//        System.out.println("17.)The Given number is not a strong number!!!");
//      }
//  }
//  private void find_least_cmultiples1(int no1, int no2) {
//    int big = no1 > no2 ?no1:no2;
//
//    while(true) 
//    {
//      if((big%no1==0) && (big%no2==0))
//      {
//        System.out.println("LCM is " + big); 
//        break;
//      }
//      big=big+1;
//    }  
//    //System.out.println("The LCM is" + greatest);
//  }
//  private void find_greatest_cdivisors1(int no1, int no2) {
//    int div = 2,small,greatest=0;
//    small=no1<no2 ?no1:no2;
//    while(div<=small)
//    {
//      if((no1%div==0) && (no2%div==0))
//      {
//        greatest=div;
//      }
//      div=div+1;
//    }
//    System.out.println("The GCD is" + greatest);
//    
//  }
//  private void find_common_divisors1(int no1, int no2) {
//    int div = 2;
//    int small= no1 < no2 ?no1:no2;
//    while(div<=small)
//    {
//      if((no1%div==0) && (no2%div==0))
//      {
//        System.out.println(div);
//      }
//      div=div+1;
//    }
//  }  
//  private int find_factorialofanum1(int i) {
//    int box=1 ;
//    while(i>0)
//    {
//      box= box * i;
//      i=i-1;
//    }
//    return box;
//  }
//  private int find_strongnum1(int givennum) {
//    int rem,result=0,fact;
//    while(givennum>0)
//    {
//      rem = givennum%10;
//      fact = find_factorialofanum(rem);
//      result = result + fact;
//      givennum = givennum / 10;
//    }
//      return result;
//  }
//  private void addition_firstnnum(int i) {
//    System.out.println("\n Addition of first "  + i + " numbers");
//    int sum=0,num=1;
//    while(num<=i)
//    {
//      sum=sum+num;
//      num=num+1;
//    }
//      System.out.println(sum);
//  }
//  private void print_1111() {
//    int num=1;
//    while(num<=5)
//    {
//      System.out.print(1 + " ");
//      num=num+1;
//    }
//    }
//  }
//  }