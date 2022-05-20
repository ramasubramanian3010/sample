package org.login;

public class Sample {
	
		  int c;
		  int d;
		  private void add(int a, int b) {
		    a=10;
		    b=20;
		    System.out.println(a);
		    System.out.println(b);
		    this.c=a;
		    this.d=b;
		}
		  public static void main(String[] args) {
			Sample s = new Sample();
			System.out.println(s.c);
			System.out.println(s.d);
			s.add(1,1);
			System.out.println(s.c);
			System.out.println(s.d);
		}
}

