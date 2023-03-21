import java.util.Scanner;

public class If_else2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double sal;
		System.out.println("Enter salary of the employee: ");
		sal = in.nextDouble();
		double hra = sal * 0.08;
		if(hra > 2500)
		{
			hra = 5000;
			System.out.println("HRA amount :"+ hra);
		}
		else
		{
			System.out.println("HRA amount: "+hra);
		}

	}

}
