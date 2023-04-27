package anudip;
import java.util.*;
class TreeSet1 implements Comparable<TreeSet1>
{
	int id; 
	String name;
	TreeSet1(int id, String name) // constructor
	{
		this.id = id;
		this.name = name;
	}
	public int compareTo(TreeSet1 t) // method overriding from comparable interface
	{
		if(id > t.id)
			return 1;
		else if(id == t.id)
			return 0;
		else
			return -1;
	}
}
public class TreeSetLMS {

	public static void main(String[] args) {
		TreeSet1 t1 = new TreeSet1(10, "Bhushan"); // object creation
		TreeSet1 t2 = new TreeSet1(12, "Rohit");
		TreeSet1 t3= new TreeSet1(19, "Surya");
		TreeSet1 t4= new TreeSet1(02, "Shubhya");
		TreeSet<TreeSet1> ts = new TreeSet <TreeSet1>(); // TreeSet initialization
		ts.add(t1); // adding elements into TreeSet
		ts.add(t2);
		ts.add(t3);
		ts.add(t4);
		System.out.println("Initial Set:");
		// for each to print initial set
		for(TreeSet1 st: ts) {
			System.out.println(st.id+" "+st.name);
		}
		// for each for head set elements
		System.out.println("Head Set elements: ");
		for(TreeSet1 st: ts.headSet(t1, true))
		{
			System.out.println(st.id+" "+st.name);
		}
		//loop for SubSet
		System.out.println("Sub Set Elements:");
		for(TreeSet1 st: ts.subSet(t2, true, t3, true))
		{
			System.out.println(st.id+ " "+ st.name);
		}
		//loop for TailSet
		System.out.println("Tail Set Elements");
		for(TreeSet1 st: ts.tailSet(t3,true))
		{
			System.out.println(st.id+ " "+st.name);
		}
		
	}

}
