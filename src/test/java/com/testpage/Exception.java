package com.testpage;

public class Exception {

	public static void main(String[] args) {
		
		int i = 10 , j=0;
		String a = null;
		try {
			System.out.println("inside try block");
		System.out.println("size of string" +a.length());
		}
		catch(java.lang.Exception e) {
			System.out.println("inside null catch block");
			e.printStackTrace();
		}	finally {
			System.out.println("Finally block");
		}
		
		int add = i+j;
		System.out.println(add);
		
		try {
			System.out.println("inside try block");
		    int div = i/j;
		    System.out.println(div);
		}
		catch(java.lang.Exception e) {
			System.out.println("inside catch block");
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block");
		}
		
		int sub = i-j;
		System.out.println(sub);
	}
}
