import java.util.*;
class StudentInfo{
	int studId;
	String name;
	StudentInfo(int studId, String name)
	{
		this.studId = studId;
		this.name = name;
	}
}
public class ListIteratorTask {
	public static void main(String[] args) {
		StudentInfo s1= new StudentInfo(21, "Bhushan");
		StudentInfo s2 = new StudentInfo(23, "Mayur");
		StudentInfo s3 = new StudentInfo(11, "Surya");
		ArrayList<StudentInfo> a1= new ArrayList<StudentInfo>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		ListIterator <StudentInfo> itr= a1.listIterator();
		System.out.println("Forward direction iteration...");
		while(itr.hasNext())
		{
			StudentInfo st = (StudentInfo)itr.next();
			System.out.println("Student Id:"+st.studId+" Student Name:"+st.name);
		}
		System.out.println("Backward direction iteration");
		while(itr.hasPrevious())
		{
			StudentInfo st = (StudentInfo)itr.previous();
			System.out.println("Student Id:"+st.studId+" Student Name:"+st.name);
		}

	}

}
