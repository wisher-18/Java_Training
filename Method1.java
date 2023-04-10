import java.util.Scanner;

public class Method1 {
	
	int getMax(int x, int y)
	{
		int a =x;
		int b =y;
		if(a> b)
			return a;
		else
			return b;
	}
	int getMax(int x, int y, int z)
	{
		int a=x, b= y, c =z;
		if(a> b && a> c)
			return a;
		else if(b >a && b >c)
			return b;
		else
			return c;
	}

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		Method1 a1 = new Method1();
		System.out.println("Max between "+x+" and "+y+" is "+a1.getMax(x, y));
		System.out.println("Max between "+y+" and "+z+" is "+a1.getMax(y, z));
		System.out.println("Max between "+x+" and "+z+" is "+a1.getMax(x, z));
		System.out.println("Max between "+x+","+y+" and "+z+" is "+a1.getMax(x, y, z));

	}

}
