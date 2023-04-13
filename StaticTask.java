
class Employe1
{
	int eid;
	String ename;
	static String company ="Anudip"; // static variable
	static  void changeComp(String x) // static method
	{
		company = x;
	}
	Employe1(int eid, String ename) // parameterized constructor
	{
		this.eid = eid;
		this.ename = ename;
	}
	void show() // method
	{
		System.out.println("Emp Id: "+eid+"\tEmp Name: "+ename+"\tCompany: "+company);
	}
}

public class StaticTask {

	public static void main(String[] args) {
		Employe1 e1 = new Employe1(101, "Bhushan");
		e1.show();
		e1.changeComp("WNS");
		e1.show();
		
		

	}

}
