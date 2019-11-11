package jo.secondstep.session6;

public class Employee extends Person {
	
	private int employeeID;
	private String role;
	
	public Employee(String Name,String dateOfPirth,int employeeID, String role) {
		super(Name,dateOfPirth);
		this.employeeID = employeeID;
		this.role = role;
	}
	public int getEmpID() {
		return employeeID;
	}
	public void setEmpID(int empID) {
		this.employeeID = empID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
