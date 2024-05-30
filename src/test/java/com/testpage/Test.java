package com.testpage;

public class Test {

	public static void main(String[] args) {
		
	String s  = "Komal";
	String revString = "";
	
	for(int i=s.length()-1; i>=0; i--)
	{
		revString = revString + s.charAt(i);
		
	}
	System.out.println("Reverse String :"+revString);
	}
}
