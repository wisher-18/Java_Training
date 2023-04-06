import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	int n, m, r, rev = 0;
	boolean flag;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	n = sc.nextInt();
	m = n;
	do {
		r = n%10;
		rev= (rev*10)+r;
		n=n/10;
		
	}while(n > 0);
	
	if(rev == m)
	{
		flag = true;
	}
	else
		flag = false;
	
	if(flag == true)
		System.out.println("Number is palindrome");
	else
		System.out.println("Number is not palindrome");
		

	}

}
