package com.learning;

public class ExceptionDemo3 {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    LowAttendanceException ll = new LowAttendanceException();
	    ll.allowForExams(78);
	    ll.allowForExams(68);
	  }

	}
