package org.loginc;

public class SampleTask {
	static int forLoop1() {
       int a=2;
       for(int i=1;i<=4;i++) {
    	   for(int j=1;j<=i;j++) {
    		   System.out.print(a);
    		   a=a+2;
    	   }
    	   System.out.println();
       }
       return a;
	}
	public static void main(String[] args) {
		forLoop1();
	}
}
