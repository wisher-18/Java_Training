class Employee1
{
	private String eid, ename;
	private double salary;
	void setEid(String eid) // setter for employee id
	{
		this.eid=eid;
	}
	void setEname(String ename)// setter for emp name
	{
		this.ename = ename;
	}
	void setSalary(double salary)// setter for salary
	{
		this.salary=salary;
	}
	String getEid() //getter for emp id
	{
		return eid;
	}
	String getEname() //getter for ename
	{
		return ename;
	}
	double getSalary()// getter for salary
	{
		return salary;
	}
}
public class EncapsulationLMS {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		e1.setEid("u372901");
		e1.setEname("Bhushan");
		e1.setSalary(50000);
		System.out.println("Employee ID: "+e1.getEid()+"\nEmployee Name:"+e1.getEname()+"\nEmployee Salary:"+e1.getSalary());

	}

}
