import java.util.Scanner;

abstract class Shape
{
	abstract void calculateArea();
}
class Circle extends Shape
{
	double r;
	Scanner sc = new Scanner(System.in);
	void calculateArea()
	{
		System.out.println("Enter radius of the circle:");
		r = sc.nextDouble();
		r = 3.14*r*r;
		System.out.println("Area of the circle:"+r);
	}
}
class Rectangle extends Shape
{
	double l,b,area =0;
	void calculateArea()
	{
		System.out.println("Enter length and breadth of the rectangle:");
		Scanner sc = new Scanner(System.in);
		l = sc.nextDouble();
		b = sc.nextDouble();
		area = l*b;
		System.out.println("Area of the rectangle: "+area);
	}
}
public class AbstractTask {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		c1.calculateArea();
		r1.calculateArea();
	}

}
