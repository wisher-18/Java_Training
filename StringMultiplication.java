package practice;

import java.util.Scanner;

public class StringMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 and num2:");
		String num1 = sc.next();
		String num2 = sc.next();
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		n1 *=n2;
		num1 = Integer.toString(n1);
		System.out.println(num1);
	}

}
