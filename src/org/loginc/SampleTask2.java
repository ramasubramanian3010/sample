package org.loginc;

public class SampleTask2 {
	static void   forLoop1() {
       int k= 2;
       for(int i=1;i<=4;i++)
       {
    	   for(int j=1;j<=4;j++) {
    		   System.out.print(k+ "  " );
    	   k=k+2;
    	   
    	   }
    	   System.out.println();
       }
	}
	public static void main(String[] args) {
		forLoop1();
	}

}
