
class Employee{
	int empId;
	String empName, designation;
	Employee(int id, String name, String des){
		empId = id;
		empName = name;
		designation = des;
	}
	
}
class Report extends Employee{
	double salary;
	Report(int id, String name, String des, double sal){
		super(id, name, des);		
		salary = sal;
	}
	void display()
	{
		System.out.println("Employee Id: "+ empId +"\nEmployee name: "
	+empName+"\nDesignation: "+designation+"\nSalary: "+salary);
	}
}


public class InheritanceSuper {

	public static void main(String[] args) {
		Report a1 = new Report(101, "Bhushan","Developer", 15000);
		a1.display();

	}

}
