class Vehicle1
{
	String brand;
	void drive(String brand)// method drive with arguments
	{
		this.brand=brand;
		System.out.println("You can take ride with out "+brand+" brand...");
	}
}
class Bikes extends Vehicle1 // inheritance
{
	String model;
	void drive(String model)// method overriding
	{
		this.model=model;
		System.out.println("You can take ride with our "+model);
	}
}
class Cars extends Vehicle1// inheritance
{
	String colour;
	void drive(String colour)// method overriding
	{
		System.out.println("You can drive our "+colour+" coloured car...");
	}
	
}
public class HierachicalLMS {

	public static void main(String[] args) {
		Bikes b1 = new Bikes();
		Cars c1 = new Cars();
		b1.drive("R15");
		c1.drive("Black");
		
	}

}
