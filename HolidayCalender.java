package anudip;

import java.util.Scanner;

class Holiday{
	String name, month;
	int day;
	Holiday(String name,int day, String month)
	{
		this.name=name;
		this.day = day;
		this.month=month;
	}
	boolean inSameMonth(Object obj)
	{
		if(this.month==obj)
		{
			return true;
		}
		else
		return false;
	}
	double avgDatewhich(int[]day)
	{
		double avg=0;
		for(int i=0; i<day.length;i++ )
		{
			avg += day[i];
		}
		return avg/day.length;
	}
}
public class HolidayCalender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int holidayNum;
		System.out.println("Enter number of holidays:");
		holidayNum = sc.nextInt();
		int []days= new int[holidayNum];
		String [] holidayName= new String[holidayNum];
		String [] month = new String[holidayNum];
		Holiday [] holiday = new Holiday[holidayNum];
		for(int i=0; i<holidayNum;i++)
		{
			System.out.println("Enter name of the Holiday:");
			holidayName[i]=sc.next();
			System.out.println("Enter the day of Holiday:");
			days[i]=sc.nextInt();
			System.out.println("Enter the month of Holiday");
			month[i]=sc.next();
			holiday[i] = new Holiday(holidayName[i],days[i],month[i] );
		}
		System.out.println(holiday[1].inSameMonth(holiday[2]));
		System.out.println(holiday[2].avgDatewhich(days));
		

	}

}
