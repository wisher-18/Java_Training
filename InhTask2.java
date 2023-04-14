class Person
{
	String name="Mayur";
	int age=20;
	void speak()
	{
		System.out.println("Your ready to speak");
	}
}
class Student1 extends Person
{
	char grade='c';
	void study()
	{
		System.out.println("Name: "+name+"\tAge: "+age);
		System.out.println("You need to study because your grade is "+grade);
	}
}
public class InhTask2 {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.speak();
		s1.study();

	}

}
