package SpringbootAssig2.GetById;

public class Employee 
{
	private Integer EmpID;
	private String EmpName;
	

	public Employee() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empID,String empName) 
	{
		super();
		EmpID = empID;
		EmpName = empName;
		
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public Integer getEmpID() {
		return EmpID;
	}

	public void setEmpID(Integer empID) {
		EmpID = empID;
	}

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpID=" + EmpID + "]";
	}
	
	
	
	
	
}
