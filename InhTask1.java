
class Vehicle
{
	String brand, model;
	int year;
	Vehicle()
	{
		brand = "BMW";
		model = "X3";
		year = 2023;
	}
	void drive()
	{
		System.out.println("You can Drive");
	}
}
class Car extends Vehicle
{
	String color;
	Car()
	{
		color = "Blue";
	}
	
	void honk()
	{
		System.out.println("You can Honk");
		System.out.println("Brand:"+brand+"\tModel:"+model+"\tYear:"+year+"\tColor:"+color);
	}
}



public class InhTask1 {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.drive();
		c1.honk();
		
		

	}

}
