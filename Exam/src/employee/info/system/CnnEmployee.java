package employee.info.system;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

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
		
		//Data Structure to hold all employees
		LinkedList<EmployeeInfo> employee = new LinkedList<EmployeeInfo>();
		
		//Examine if Data Structure works.
		try{
			//Create random new employees
			employee.add(new EmployeeInfo("employee1", 1));
			employee.add(new EmployeeInfo("employee2", 2));
			employee.add(new EmployeeInfo("employee3", 4));
			employee.add(new EmployeeInfo("employee4", 3));
			
			/* Set employee salary depending on id number
			 * id = 1, $50,000
			 * id = 2, $75,000
			 * id = 3, $90,000
			 * id = 4, $115,000
			*/
			int[] salary = new int[4];
			salary[0] = 50000;
			salary[1] = 75000;
			salary[2] = 90000;
			salary[3] = 115000;
			
			for(EmployeeInfo i: employee){
				switch(i.employeeId()){
				case 1:
					i.setSalary(salary[0]);
					break;
				case 2:
					i.setSalary(salary[1]);
					break;
				case 3:
					i.setSalary(salary[2]);
					break;
				case 4:
					i.setSalary(salary[3]);
					break;
				}
			}
			
			//Print employee names
			for (EmployeeInfo i: employee){
				System.out.println("Name: " + i.employeeName() + ", Salary: " +  i.calculateSalary());
			}

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//remove everything and start fresh.
			employee.removeAll(employee);
		}
		
		
		Scanner input = new Scanner(System.in);
		boolean incomingInput = true;
		while(incomingInput){
			System.out.print("Please enter Employee Name: ");
			String name = input.next();
			
			try{
				
				System.out.print("Enter ID #: ");
				int id = input.nextInt();
				employee.add(new EmployeeInfo(name, id));
				
				System.out.print("What's the employee's salary: ");
				int salary = input.nextInt();
				//use getLast() instead of element as the new element is the last element.
				employee.getLast().setSalary(salary);
				
				System.out.print("Add additional Employee? ");
				String yesNo = input.next();
				
				if(yesNo.charAt(0)=='y' || yesNo.charAt(0)=='Y'){
					incomingInput = true;
				}
				else{
					incomingInput = false;
				}
			} catch(InputMismatchException e) {
				System.out.println("That's not a valid input!  Please try again!");
			}
		}
		
		//Print employee names
		for (EmployeeInfo i: employee){
			System.out.println("Name: " + i.employeeName() + ", Salary: " +  i.calculateSalary());
		}
		
	}

}
