import java.util.Scanner;

public class LogIn {

	public static void main(String[] args) {
		String username, pass;
		int count = 3;
		Scanner din = new Scanner(System.in);
		for(int i=1; i<=3; i++)
		{
			System.out.println("Enter your username: ");
			username = din.next();
			System.out.println("Enter your password: ");
			pass = din.next();
			if(username.equals("Bhushan") && pass.equals("welcome@123"))
			{
				System.out.println("Welcome!!! Mr. " +username);
				break;
			}
			else
			{
				System.out.println("Invalid login credentials...");
				System.out.println("Your left with "+(count - 1)+ " attempts!!!");
				count --;
			}
			if(count == 0)
			{
				System.out.println("Sorry, your account is blocked for 24 hours");
				System.out.println("You can reach out to the administrator for further process !!!");
			}
		}

	}

}
