import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int x,y, even =0, odd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range:");
		x = sc.nextInt();
		y = sc.nextInt();
		for(int i =x; i <= y; i ++)
		{
			if(i%2== 0)
			{
				even ++;
			}
			else {
				odd ++;
			}
		}
		System.out.println("Even count: "+even);
		System.out.println("Odd count: "+odd);

	}

}
