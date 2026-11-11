package practiceprgs;

import java.util.Scanner;

interface Bank{
	abstract public void AccDetails();
	abstract public void Bal();
	abstract public void Withdraw();
	abstract public void Deposite();
}

class SBI implements Bank{
	String name;
	int accno;
	String bname = "SBI";
	double bal=7000;
	double minbal=2000;
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void AccDetails() {
		System.out.println("Enter Holder name : ");
		name = sc.next();
		System.out.println("Enter Account number : ");
		accno = sc.nextInt();
		System.out.println();
		System.out.println("Account Holder name : "+name);
		System.out.println("Account Number : "+accno);
		System.out.println("Bank name : "+bname);
		
	}

	@Override
	public void Bal() {
		System.out.println("Balance : "+bal);
		
	}

	@Override
	public void Withdraw() {
		System.out.println("Enter Withdraw amount : ");
		int witham = sc.nextInt();
		bal=bal-witham;
		System.out.println("Amount withdraw : "+witham);
		System.out.println("Current balance : "+bal);
		
	}

	@Override
	public void Deposite() {
		System.out.println("Enter Deposit amount : ");
		int amount = sc.nextInt();
		System.out.println("Amount Deposit : "+amount);
		
	}
	
}

public class BankSBI_Prg {

	public static void main(String[] args) {
		SBI s = new SBI();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose an option");
		System.out.println("1.Account Details  2.Balance  3.Deposit  4.Withdraw");
		
		System.out.println("Enter Choice : ");
		int c = sc.nextInt();
		switch(c) {
		case 1: s.AccDetails();break;
		case 2: s.Bal();break;
		case 3:s.Deposite(); break;
		case 4:s.Withdraw();break;
		default:System.out.println("Invalid option");
		}
	}

}
