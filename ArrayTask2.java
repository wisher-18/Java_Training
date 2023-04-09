import java.util.Scanner;

public class ArrayTask2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][][] arr2 = new int[3][4][5];
		int sum = 0;
		System.out.println("Enter numbers between 0 to 100");
		for(int i =0; i <= 2; i++)
		{
			for(int j = 0; j<=3; j++)
			{
				for(int k = 0; k <= 4; k ++)
				{
					arr2[i][j][k]=sc.nextInt();
					while(arr2[i][j][k]<1 || arr2[i][j][k]>100)
					{
						System.out.println("Enter valid number: ");
						arr2[i][j][k]=sc.nextInt();
						break;
					}
				}
			}
		}
		for(int i =0; i <= 2; i++)
		{
			for(int j = 0; j<=3; j++)
			{
				for(int k = 0; k <= 4; k ++)
				{
					if(arr2[i][j][k]%2 == 0 && arr2[i][j][k]%3 ==0)
					{
						sum =sum + arr2[i][j][k];
					}
				}
			}
		}
		System.out.println("Sum of numbers which are divisible by 2 and 3:"+sum);
		
		

	}

}
