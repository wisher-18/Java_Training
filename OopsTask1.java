
class Student
{
	int sid,marks;
	String sname;
	void input(int x, String y, int z)
	{
		sid = x;
		sname = y;
		marks = z;
	}
	void output()
	{
		System.out.println("Student Id: "+sid+"\nName: "+sname+"\nMarks: "+marks);
	}
}


public class OopsTask1 {
	public static void main(String [] args)
	{
	Student s1 = new Student();
	s1.input(11,"Bhushan",99);
	s1.output();
	
	}

}
