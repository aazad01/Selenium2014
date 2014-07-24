package employee.info.system;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from 
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * 
	 **/
	public static void main(String[] args) {
		
		
		EmployeeInfo employee1 = new EmployeeInfo(1);
		employee1.setSalary(1000);
		
		EmployeeInfo employee2 = new EmployeeInfo(2);
		employee2.setSalary(2000);
		
		//employee1.calculateEmployeBonus();
		System.out.println(employee2.calculateSalary());
		System.out.println(employee1.calculateSalary());
		EmployeeInfo.calculateEmployeBonus(1000,4);
		EmployeeInfo.calculateEmployeBonus(employee1.calculateSalary(),5);
	}

}
