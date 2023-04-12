import java.util.Scanner;

class Emp
{
	int _empID;
	String _empName;
	double _noOfHoursWorked, _hourlyPrice, gross;
	void setEmpID(int value)
	{
		_empID = value;
	}
	int getEmpID()
	{
		return _empID;
	}
	void setEmpName(String value)
	{
		_empName = value;
	}
	String getEmpName()
	{
		return _empName;
	}
	void setNoOfHoursWorked(double value)
	{
		_noOfHoursWorked = value;
	}
	double getNoOfHoursWorked()
	{
		return _noOfHoursWorked;
	}
	void setHourlyPrice(double value)
	{
		_hourlyPrice = value;
	}
	double getHourlyPrice()
	{
		return _hourlyPrice;
	}
	double getGrossSalary()
	{
		gross = _noOfHoursWorked * _hourlyPrice;
		return gross;
	}
	double getNetSalary()
	{
		if(gross > 30000)
		{
			gross = gross - (gross * 0.05);
			return gross;
		}
		else
			return gross;
	}
	
	
	
}

public class OopsTask2 {

	public static void main(String[] args) {
		Emp a1 = new Emp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		a1.setEmpID(sc.nextInt());
		System.out.println("Enter Employee Name:");
		a1.setEmpName(sc.next());
		System.out.println("How many hours employee worked:");
		a1.setNoOfHoursWorked(sc.nextDouble());
		System.out.println("Enter Hourly Price:");
		a1.setHourlyPrice(sc.nextDouble());
		System.out.println("Employee ID: "+a1.getEmpID()+"\nEmployee Name:"+a1.getEmpName()+"\nHourly Price: "+a1.getHourlyPrice()+"\nGross Salary: "
		+a1.getGrossSalary()+"\nNet Salary: "+a1.getNetSalary());
		sc.close();
		
		

	}

}
