class EvenOddCheck
{
	synchronized void printEven(int n)
	{
		if(n%2== 0)
			System.out.println("Even number...");
		else System.out.println("Odd number");
		try {
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class MyThread1 extends Thread{
	EvenOddCheck e;
	MyThread1(EvenOddCheck e)
	{
		this.e = e;
	}
	public void run()
	{
		e.printEven(3);
	}
}
class MyThread2 extends Thread{
	EvenOddCheck e;
	MyThread2(EvenOddCheck e)
	{
		this.e = e;
	}
	public void run()
	{
		e.printEven(7);
	}
}

public class ThreadSync {

	public static void main(String[] args) {
		EvenOddCheck e1 = new EvenOddCheck();
		MyThread1 m1 = new MyThread1(e1);
		MyThread2 m2 = new MyThread2(e1);
		m1.start();
		m2.start();

	}

}
