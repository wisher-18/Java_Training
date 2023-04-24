class LessBalanceException extends Exception
{
	public LessBalanceException(String s) {
		super(s);
	}
	
}
class CustomerBank
{
	int acNo;
	String cName;
	double balance;
	CustomerBank(int acNO, String cName, double balance)
	{
		this.acNo = acNO;
		this.cName = cName;
		this.balance = balance;
		try {
			checkBalance(balance);
		} catch (LessBalanceException e) {
			e.printStackTrace();
		}
	}
	void checkBalance(double balance) throws LessBalanceException
	{
			if(balance < 500)
				throw new LessBalanceException("Balance is less than 500");
			else
				System.out.println("Balance :"+balance);
	}
}
public class ExceptionTask {
	
	

	public static void main(String[] args) throws LessBalanceException{
		CustomerBank c1 = new CustomerBank(121212, "Bhushan", 1);

	}

}
