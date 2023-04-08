import java.util.Scanner;

public class AgeVote {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age first:");
		age = sc.nextInt();
		if(age >= 18)
		{
			System.out.println("You are eligible to vote.");
		}
		else
		{
			age = 18-age;
			System.out.println("You are not eligible to vote yet. Please come back in "+age+" years.");
		}

	}

}
