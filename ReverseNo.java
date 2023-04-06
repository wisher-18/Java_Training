import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,rev=0,r;
		System.out.println("Enter the number you want to reverse:");
		n = sc.nextInt();
		do
		{
			r = n%10; // will get reminder
			rev = (rev*10)+r; // we will add reminder into rev
			n = n/10; // then will divide n by 10 to minimize it by one decimal
			

		}while(n>0);
		System.out.println("Reverse no.: "+rev);

	}

}
