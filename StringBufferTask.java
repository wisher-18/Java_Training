package practice;

import java.util.Scanner;

public class StringBufferTask {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s2 = sc.nextLine();
		StringBuffer s1 = new StringBuffer();
		s1.append(s2);
		System.out.println("Enter starting index and ending index for trimming");
		int sI = sc.nextInt();
		int eI = sc.nextInt();
		s1.delete(sI, eI);
		System.out.println("Trimmed String: "+s1);
		
		
	}

}
