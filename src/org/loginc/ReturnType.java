package org.loginc;

public class ReturnType {
 static int amountToRavi(int amount)
{
	System.out.println("amount to ravi is "+ amount);
	System.out.println("amount from ravi is "+ (amount+1000));
	return amount+1000;

}
static int amountToKavi(int amount) {
System.out.println("amount to kavi is "+ amount);
System.out.println("amount from kavi is "+ (amount+2000));
return amount +2000;
}
static String amountToMukesh(int amount) {
System.out.println("amount to mukesh is "+ amount);
return "twoweekslater";
}
public static void main(String[] args) {
	int amountToKavi = amountToKavi(10000);
	int amountToRavi = amountToRavi(10000);
	String amountToMukesh = amountToMukesh(amountToRavi+amountToKavi);
	System.out.println(amountToMukesh);
	 
}
}
