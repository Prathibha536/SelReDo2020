package org.bank;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		
		System.out.println("Deposit: 1 Lakh");

	}

	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank();
		
		ab.saving();
		
		ab.fixed();
		
		ab.deposit();
		
	}

}
