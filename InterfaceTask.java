import java.util.Scanner;
interface BankAccount
{
	void deposit();
	void withdraw();
}
class CheckingAccount implements BankAccount
{
	double balance = 10000;
	double depo,withdraw;
	Scanner sc = new Scanner(System.in);
	public void deposit()
	{
		System.out.println("Enter amount to deposit:");
		depo=sc.nextDouble();
		balance = balance + depo;
		System.out.println("Your balance after deposite: "+balance);
	}
	public void withdraw()
	{
		System.out.println("Enter withdraw amount:");
		withdraw = sc.nextDouble();
		if(balance > withdraw)
		{
		balance = balance - withdraw;
		System.out.println("Withdraw is successful!\nYour balance is now:"+balance);
		}
		else
		{
			System.out.println("Your balance is insufficient");
		}
	}
}
public class InterfaceTask {

	public static void main(String[] args) {
		CheckingAccount a1 = new CheckingAccount();
		a1.deposit();
		a1.withdraw();
		a1.withdraw();

	}

}
