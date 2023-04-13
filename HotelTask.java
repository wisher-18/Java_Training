import java.util.Scanner;

public class HotelTask {

	public static void main(String[] args) {
		System.out.println("Welcome to the Taj Hotel!");
		int total;
		String [] roomType= {"luxury", "a/c", "non a/c", "deluxe", "general"};
		int [] costperday = {2500, 2000, 1500, 1200, 500};
		System.out.println("If you stays for 30 days you need to pay as per below\n");
		int days = 30;
		for(int i =0; i< roomType.length; i++)
		{
			if(i == 0)
			{
				total = costperday[i]*days;
				System.out.println("Luxury Room Cost:"+ total);
			}
			else if(i == 1)
			{
				total = costperday[i]*days;
				System.out.println("A/c Room Cost:"+ total);
			}
			else if(i == 2)
			{
				total = costperday[i]*days;
				System.out.println("Non a/c Room Cost:"+ total);
			}
			else if(i == 3)
			{
				total = costperday[i]*days;
				System.out.println("Deluxe Room Cost:"+ total);
			}
			else
			{
				total = costperday[i]*days;
				System.out.println("General Room Cost:"+ total);
			}
		}
		

	}

}
