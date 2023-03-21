import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = in.nextInt();
		
		do
		{
			System.out.println(num);
			num ++;
		}while(num <= 100);
		in.close();
	}

}
