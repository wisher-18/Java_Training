interface Person1 //interface Person taken Person1 instead
{
	public void speak(); //method
}
class Student2 implements Person1 // Student2 taken instead of Student and person1 is implemented
{
	String st;
	Student2(String st)
	{
		this.st = st;
	}
	public void speak()//override the person1 method here
	{
		System.out.println("Student named "+st+" is speaking");
	}
}
class Teacher implements Person1 // Teacher class implements Person1
{
	String tc;
	Teacher(String tc)
	{
		this.tc = tc;
	}
	public void speak()//override the person1 method
	{
		System.out.println(tc+" is speaking...");
	}
}
public class InterfaceTaskLMS {

	public static void main(String[] args) {
		Student2 s1 = new Student2("Bhushan");
		Teacher t1 = new Teacher("Prof. Suryanarayana");
		s1.speak();
		t1.speak();

	}

}
