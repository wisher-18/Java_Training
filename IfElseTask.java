import java.util.Scanner;

public class IfElseTask {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values A, B and C respectively:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a > b && a > b)
		{
			System.out.println(a+" is greater than "+b+" and "+c);
		}
		else if(b > a && b > c)
		{
			System.out.println(b+" is greater than "+a+" and "+c);
		}
		else
		{
			System.out.println(c+" is greater than "+b+" and "+a);
		}
		
		

	}

}
