package practice;

import java.util.Scanner;
class Function1
{
	synchronized void even(int num)
	{
		System.out.println("Even number: ");
		for(int i =1; i<=num ; i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		try {
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	synchronized void odd(int num)
	{
		System.out.println("Odd number:");
		for(int i =1; i<=num; i++)
		{
			if(i%2!=0)
			System.out.println(i);
		}
		try {
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class Printer1 extends Thread
{
	Function1 f;
	int num;
	Printer1(Function1 f)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		this.f=f;
	}
	public void run()
	{
		f.even(num);
	}
	
}
class Printer2 extends Thread
{
	Function1 f;
	int num;
	Printer2(Function1 f)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		this.f=f;
	}
	public void run()
	{
		System.out.println();
		f.odd(num);
	}
	
}

public class ThreadingTask3 {

	public static void main(String[] args) {
		Function1 f = new Function1();
		Printer1 p1 = new Printer1(f);
		Printer2 p2 = new Printer2(f);
		p1.start();
		p2.start();
	}

}
