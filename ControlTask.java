import java.util.Scanner;

public class ControlTask {

	public static void main(String[] args) {
		
		int m1,m2,m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the St. Xavier School !!!\nAddmisions are opened for XI standard. \n"
				+ "For the addmision first you have to enter marks obtained in English, Maths and Science: ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		
		if(m1 >= 80 && m2 >= 80 && m3 >= 80)
		{
			System.out.println("Your eligible for Pure-Science Stream!");
		}
		else if(m1 >= 80 && m3 >= 80 && m2 >= 60)
		{
			System.out.println("Your eligible for Bio-Science!");
		}
		else if(m1 >= 60 && m2 >= 60 && m3 >= 60)
		{
			System.out.println("Your eligible for Commerce!");
		}
		else
		{
			System.out.println("Sorry! Your not eligible!");
		}
		
		

	}

}
