import java.util.Scanner;

public class ArrayTask3 {

	public static void main(String[] args) {
		int size;
		boolean check= false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array:");
		size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the array elements:");
		for(int i =0; i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter taget value:");
		int t=sc.nextInt();
		for(int i=0; i<arr.length -1; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==t)
				{
					check = true;
					System.out.println("Pair elements are "+arr[i]+" "+arr[j]);
				}
				
			}
		}
		
		if(check == false)
		{
			System.out.println("No pair elements in the array:");
		}
	
sc.close();
	}

}
