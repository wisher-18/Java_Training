import java.util.Scanner;

public class LadderIf {

	public static void main(String[] args) {
		int stuId;
		String stuName, result, grade;
		int mark1, mark2, mark3, total;
		float avg;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student Id: ");
		stuId = in.nextInt();
		System.out.println("Enter Student Name: ");
		stuName = in.next();
		System.out.println("Enter marks obtained in 3 subjects: ");
		mark1 = in.nextInt();
		mark2 = in.nextInt();
		mark3 = in.nextInt();
		total = mark1 + mark2 + mark3;
		if(mark1 < 35 && mark2 < 35 && mark3 < 35)
		{
			result = "Fail";
		}
		else
		{
			result = "Pass";
		}
		avg = total / 3;
		if(avg >=90)
		{
			grade = "A";
		}
		else if(avg <= 89 && avg >= 75)
		{
			grade = "B";
		}
		else if(avg <= 74 && avg >= 52)
		{
			grade = "C";
		}
		else if(avg <= 51 && avg >= 35)
		{
			grade = "D";
		}
		else
		{
			grade = "Nil";
		}
		System.out.println("**************************************");
		System.out.println("Student Id ----------------> "+stuId);
		System.out.println("Student Name --------------> "+stuName);
		System.out.println("Total Marks Obtained-------> "+total);
		System.out.println("Average marks -------------> " +avg);
		System.out.println("Result --------------------> "+result);
		System.out.println("Grade obtained ------------> "+grade);
		System.out.println("**************************************");

	}

}
