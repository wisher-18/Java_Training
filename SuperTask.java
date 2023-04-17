
class Parent
{
	String name = "Pagare"; // parent varialble
	Parent()//constructor of parent
	{
		System.out.println("Parent Calling...");
	}
	void show()// normal method with no return
	{
		System.out.println("Parent name in class parent:"+name);
	}
}
class Child extends Parent
{
	
	String name = "Bhushan";
	Child()// child constructor
	{
		super();// explicitly calling parent constructor
		System.out.println("Child calling...");
	}
	void show()// method overriding
	{
		System.out.println("Child name: "+name);// accessing local variable
		System.out.println("Parent name:"+super.name); // accessing super variable
	}
	void show2()
	{
		show(); // calling child method
		super.show(); // calling parent method
	}
}

public class SuperTask {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.show2();
		
		

	}

}
