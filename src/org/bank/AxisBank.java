package org.bank;

public class AxisBank extends BankInfo {
public void deposit(String percentage) {
System.out.println("new deposit percentage is "+ percentage);
super.deposit("4%");
}
public static void main(String[] args) {
	AxisBank a = new AxisBank();
	a.deposit("7%");
}
}
