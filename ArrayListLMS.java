package anudip;
import java.util.*;
class StudentInfo
{
	int studID, age;
	String sname;
	StudentInfo(int studID, String sname, int age) // constructor
	{
		this.studID = studID;
		this.sname = sname;
		this.age = age;
		
	}
}
public class ArrayListLMS {

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo(1, "Adi", 20); // object creation
		StudentInfo s2 = new StudentInfo(2, "Bhushan", 21);
		StudentInfo s3 = new StudentInfo(3, "Rakesh", 18);
		StudentInfo s4 = new StudentInfo(4, "Dev", 15);
		StudentInfo s5 = new StudentInfo(5, "Amar", 20);
		StudentInfo s6 = new StudentInfo(6, "Yug", 23);
		StudentInfo s7 = new StudentInfo(7, "Raj", 15);
		StudentInfo s8 = new StudentInfo(8, "Siva", 16);
		StudentInfo s9 = new StudentInfo(9, "Kevin", 22);
		StudentInfo s10 = new StudentInfo(10, "Manu", 24);
		ArrayList <StudentInfo> al = new ArrayList <StudentInfo>(); // ArrayList initialization
		al.add(s1); // adding objects to the ArrayList
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		al.add(s7);
		al.add(s8);
		al.add(s9);
		al.add(s10);
		for(StudentInfo st: al) // for each loop for printing the array list
		{
			System.out.println("StudentID:"+ st.studID+" Name:"+st.sname+" Age:"+st.age);
		}

	}

}
