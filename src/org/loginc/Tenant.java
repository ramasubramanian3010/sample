package org.loginc;

public class Tenant {
	static int collectionOfRent() {
		int rent = 2000;
		for(int i=1;i<=4;i++) {

			for(int j=1;j<=4;j++) {
				System.out.println("floor no" + i + "shop no" + j + rent);
			}
		}
		return rent;
	}
	static int numbers() {
		int digits =3;
		for(int i=1;i<=3;i++) {

			System.out.println(i);
			System.out.println(i);

		}
		return digits;
	}
	static String triangle() {
        String shape = null;
        for(int i=1; i>=5;i++) {
        	for(int j=1 ;j<=i; j++) {
        		System.out.println(j);
        	}
        }
        return shape;
	}
	public static void main(String[] args) {
		collectionOfRent();
		numbers();
		triangle();
	}

}
