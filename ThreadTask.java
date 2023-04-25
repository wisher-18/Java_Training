
class ThreadSchedular extends Thread
{
	int n;
	public ThreadSchedular(int n) {
		this.n = n;
	}
	public void run() {
		System.out.println("Table of "+n);
		for(int i=1; i <=10; i++)
		{
			try {
				Thread.sleep(500);
			System.out.println(n+" * "+i+" = "+i*n);
			}catch(InterruptedException e)
			{
				e.getMessage();
			}
		}
	}
}
public class ThreadTask {

	public static void main(String[] args) {
		ThreadSchedular t1 = new ThreadSchedular(5);
		ThreadSchedular t2 = new ThreadSchedular(6);
		ThreadSchedular t3 = new ThreadSchedular(1);
		t1.start();
		try {
			t1.join();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();

	}

}
