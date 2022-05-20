package org.loginc;

public class Employee {
static String forLoop() {
	String wholeno = null;  
  for(int i= 100; i>=1;i--) {
	  System.out.println(i);
  }
  return wholeno;
  
}
static String forLoop1() {
 String evenno= null;
 for(int i=50; i>=1;i--) {
	 System.out.println(i*2);
 }
 return evenno;
}
static String forLoop2() {
String oddno = null;
for(int i=50;i>=1;i--) {
	System.out.println(i*2-1);
}
return oddno;
}
public static void main(String[] args) {
	forLoop();
	System.out.println("-------------------------------------");
	System.out.println("even number");
	forLoop1();
	System.out.println("-------------------------------------");
	System.out.println("odd number");
	forLoop2();
}
}
