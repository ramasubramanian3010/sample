package org.loginc;

public class Task2 {
	static void sumOfDigits() {
    int k = 4,m = 4,l = 2,p;
    System.out.println(p=k+m+l);
    
	}
	static void replace(String s, String old, String newstring) {
		String replace= s.replaceAll("Java", "avaj");
		System.out.println(replace);
	}
	public static void main(String[] args) {
		String s = "java";
		int length = s.length();
		System.out.println(length);
sumOfDigits();	


String uppercase = s.toUpperCase();
System.out.println(uppercase);
replace("Java", "Java", "avaj");
}
	
	
	
}
