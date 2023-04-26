package practice;

import java.util.*;

public class SumOfEvenNum {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7","8","9","10","13","15");
		int sumOfEven = list.stream().mapToInt(num -> Integer.parseInt(num))// stream the numbers and mapping Strings to interger
				.filter(num -> num % 2 == 0)// filter method with lambda expression
				.sum();// sum method for adding number
		System.out.println("Sum of even numbers: "+sumOfEven);
}
}