import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		int ch;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		ch = in.nextInt();
		switch(ch)
		{
			case 1:System.out.println("Ticket booking");
				break;
			case 2: System.out.println("Ticket Cancel");
				break;
			case 3: System.out.println("Ticket History");
				break;
			case 4: System.out.println("Help");
				break;
			default: System.out.println("Sorry!!! only enter 1, 2, 3 & 4 ");
				
		}

	}

}
