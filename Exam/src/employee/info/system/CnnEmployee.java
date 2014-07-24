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
		
		Scanner input = new Scanner(System.in);
		boolean incomingInput = true;
		do{
			
			try{
				System.out.print("Please enter Employee Name: ");
				String name = input.nextLine();
				
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
			} finally {
				input.nextLine();
			}
		}while(incomingInput);
		input.close();
		//Print employee names
		for (EmployeeInfo i: employee){
			int salary = i.calculateSalary();
			System.out.println(
					"\n\t Name: " + i.employeeName() +
					"\n\t ID #: " + i.employeeId() +
					"\n\t Salary: $" +  salary +
					//Pension for three years of service
					"\n\t Pension for 3 years of Service: $" + EmployeeInfo.calculateEmployePension(salary, 3) + 
					//Bonus for Best Performing
					"\n\t Bonus: $" + EmployeeInfo.calculateEmployeBonus(salary, 10)
					 );
		}
		
	}

}
