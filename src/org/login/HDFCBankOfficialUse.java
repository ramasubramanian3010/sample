package org.login;

public class HDFCBankOfficialUse extends HDFCBank {//method overriding

	@Override
	public void interestPaidToRBI() {
		String interest = "9%";
    System.out.println("interest paid to rbi "+ interest);		
	}
	public static void main(String[] args) {
		HDFCBankOfficialUse h = new HDFCBankOfficialUse();
		h.personalLoanInterest();
		h.interestPaidToRBI();
	}

}
