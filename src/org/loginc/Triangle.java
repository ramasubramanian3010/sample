package org.loginc;

class Triangle {
	static String rightTriangle() {

		String answer = null;
		for(int i=1; i<=5;i++) {
			for(int j=1 ;j<=i; j++) 
				System.out.print(j+" ");
			System.out.println();    	
		}
		return answer;
	}
	static String reverseOrder() {
		String reverse = null;
		for( int i=5; i>=1 ; i--) {
			for(int j=1; j<=i; j++) 
				System.out.print(j+" ");
			System.out.println();
		}

		return reverse;
	
	}
	public static void main(String[] args) {
		rightTriangle();
		reverseOrder();
		
	}
}
