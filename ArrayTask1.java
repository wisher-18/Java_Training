import java.util.Scanner;

public class ArrayTask1 {

	public static void main(String[] args) {
		int [][] arr = new int[2][2];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 4 numbers of 2d array:");
		for(int i = 0; i<=1; i++) // loop for rows
		{
			for(int j = 0; j<=1; j++) // loop for columns
			{
				arr[i][j]= sc.nextInt(); // takes user input
			}
		}
		for(int i = 0; i<=1; i++)
		{
			for(int j = 0; j<=1; j++)
			{
				if(arr[i][j]%3 == 0)// condition for the numbers which are divisible by 3
				{
					sum += arr[i][j]; // expression for sum of numbers
				}
			}
		}
		System.out.println("Summation of numbers which are divisible by 3:"+sum);

	}

}
