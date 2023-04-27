package anudip;
class Calculation
{
	int sum, avg;
	synchronized void average(int [] arr) // average method to print avg of first 10 digits
	{
		for(int i = 0 ; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		avg = sum/10;
		System.out.println("Average of first 10 numbers: "+avg);
		try {
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	synchronized void square(int [] arr) // square of the number in an array
	{
		System.out.println("Square of the numbers in an array:");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]*arr[i]);
		}
		try {
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class Thread1 extends Thread // Thread 1 for average
{
	Calculation c;
	Thread1(Calculation c)
	{
		this.c= c;
	}
	public void run()
	{
		int []arr = {1,20,50,15,30};
		c.average(arr);;
	}
}
class Thread2 extends Thread // Thread 2 for the square of the number in an array
{
	Calculation c;
	Thread2(Calculation c)
	{
		this.c= c;
	}
	public void run()
	{
		int []arr = {1,20,50,15,30};
		c.square(arr);;
	}
}
public class ThreadingTaskLMS {

	public static void main(String[] args) {
		Calculation c1 = new Calculation(); // object
		Thread1 t1 = new Thread1(c1); // thread 1 for average
		Thread2 t2= new Thread2(c1); // thread 2 for square
		t1.start(); // starting of the thread 1
		t2.start(); // starting of the thread 2
		

	}

}
