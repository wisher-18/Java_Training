
class RedVelvetCake{
	void Display()
	{
		System.out.println("Features of Red Velvet Cake Android Version: ");
		System.out.println("1. Chat bubbles. \n2. Screen recorder.\n3. Notification History");
	}
	
}

class SnowCone extends RedVelvetCake{
	void Display()
	{
		System.out.println("Features of Snow Cone Android Version: ");
		System.out.println("1. Easier Wi-Fi sharing. \n2. AVIF image support. "
				+ "\n3. Scrolling Screenshot");
	}
	
}
class Tiramisu extends SnowCone{
	void Display()
	{
		System.out.println("Features of Tiramisu Android Version: ");
		System.out.println("1. Support for Bluetooth LE Audio. \n2. Support for LC3 audio codec."
				+ "\n3. ART update with a new garbage collector.");
	}
	
}


public class Overriding1 {

	public static void main(String[] args) {
		Tiramisu a1 = new Tiramisu();
		SnowCone a2 = new SnowCone();
		RedVelvetCake a3 = new RedVelvetCake();
		a1.Display();
		a2.Display();
		a3.Display();
	}

}
