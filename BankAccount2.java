import java.util.Scanner;

class VirusBank
{
	private double balance;
	private String accHolder;
	private int accountNo;
	VirusBank(int accountNo, String accHolder, double balance)
	{
		this.accountNo = accountNo;
		this.accHolder = accHolder;
		this.balance = balance;
	}
	void deposit(double amount)
	{
		this.balance += amount;
		System.out.println("Your account is deposited with "+amount+"\nYour current balance is "+balance);
	}
	void withdraw(double amount)
	{
		if(balance > amount)
		{
			System.out.println("You withdraw "+amount+" from "+balance);
			balance -= amount;
			System.out.println("Your balance is now:"+balance);
		}
		else
			System.out.println("Insufficent balance!");
	}
	double getBalance()
	{
		return balance;
	}
}
public class BankAccount2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		
		System.out.println("Enter account number:");
		int acc = sc.nextInt();
		System.out.println("Enter account holder name:");
		String s = sc.next();
		System.out.println("Enter initial amount to deposit:");
		double d = sc.nextDouble();
		VirusBank b1 = new VirusBank(acc,s,d);
		
		while(true)
		{
			System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit\n\nEnter your choice:");
			ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter amount to be deposit");
			double deposit = sc.nextDouble();
			b1.deposit(deposit);
			break;
		case 2:
			System.out.println("Enter amount you want to withdraw");
			double w = sc.nextDouble();
			b1.withdraw(w);
			break;
		case 3:
			System.out.println("Your balance is: "+b1.getBalance());
			break;
		case 4:
			System.out.println("Thank you "+s+" for using our services!! regards Virus Dadda");
			System.exit(0);
			default:
				System.out.println("Invalid input");
			
		}
		}
	}

}
