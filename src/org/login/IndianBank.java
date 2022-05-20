package org.login;

public class IndianBank extends RBIBank{
public void indianBankId() {
   int id = 4567;
   System.out.println("bank id is "+ id);
   super.rbiBankCapital();
   this.indianBankReporate();
}
public void indianBankReporate() {
 int rate =2;
 System.out.println("interest rate is "+ rate);
}
private void bankDeposit() {
indianBankId();
empId();
}
public static void main(String[] args) {
	IndianBank i = new IndianBank();
	i.indianBankId();
}
}
