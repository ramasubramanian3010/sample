package org.login;

public class ICICIUtility implements ICICIBank {//interface

	@Override
	public void atmMachinePassword() {
    int atmpin = 1234;	
    System.out.println("atm password is "+ atmpin);
	}
	public static void main(String[] args) {
		ICICIUtility i = new ICICIUtility();
		i.atmMachinePassword();
	}

}
