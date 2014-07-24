package employee.info.system;

public abstract class EmployeeData implements Employee{
	
	private int id;
	private String name;
	private int department;
	private int benefit;
	private int salary = 0;
	
	//employeeId() will return employee id.
	public int employeeId() {
		return id;
	}
	
	//assignID() will assign employee a number
	public void assignID(int id) {
		this.id = id;
	}
	
	//employeeName() will return employee name
	public String employeeName() {
		return name;
	}
	
	//setEmployeeName() will enter employee name
	public void setEmployeeName(String name) {
		this.name = name;
	}
	
	//assignDepartment() will assign employee to departments
    public void assignDepartment(int department){
    	this.department = department;
    }
    
	//employee benefit
	public void benefitLayout(int benefit) {
		this.benefit = benefit;
	}
	
	//calculate employee salary
	public int calculateSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
}
