
public class FibAmazon {

	public static void main(String[] args) {
		
		int a= 0;
		int b = 1;
		System.out.println(a+"\n"+b);
		int fib;
		for(int i = 0; i < 18; i++)
		{
			fib = a + b;
			a =b;
			b=fib;
			System.out.println(fib);
		}

	}

}
