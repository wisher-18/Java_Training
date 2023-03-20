
import java.util.Scanner;
public class If_else_example {

	public static void main(String[] args) {
		int age;
		Scanner din = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age= din.nextInt();
		if(age >= 20 && age <= 45)
		{
			String degree;
			System.out.println("Enter your degree: ");
			degree = din.next();
			if(degree.equals("bca") || degree.equals("mca"))
			{
				int exp;
				System.out.println("Enter your experience in year: ");
				exp = din.nextInt();
				if(exp >= 1 && exp <=5)
				{
					System.out.println("Congratulations!!! Your shortlisted...");
				}
				else
				{
					System.out.println("Sorry!!! Your experience is not enough for this role... ");
				}
			}
			else
			{
				System.out.println("Sorry !!! Your "+ degree + " degree is not satified for this role...");
			}
		}
		else
		{
		System.out.println("Sorry !!! Your age= " +age+ " is not satified...");

		}
		din.close();
	}

}
