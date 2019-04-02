package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result

		List employeeList = new ArrayList();

		employeeList.add(new Employee(1, "Writer", "IBM", 100000.0));
		employeeList.add(new Employee(2, "Artist", "Apple", 110000.0));
		employeeList.add(new Employee(3, "Corrector", "IBM", 90000.0));
		employeeList.add(new Employee(4, "Developer", "Google", 120000.0));
		employeeList.add(new Employee(5, "Tester", "Google", 95000.0));

		for (int i = 0; i < employeeList.size(); i++) {
			Employee e = (Employee) employeeList.get(i);
			System.out.println(e.getEmpId() + " " + e.getJobTitle() + " " + e.getCompanyName() + " " + e.getSalary());
		}
		System.out.println("----------------------------------");

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result


		for (int i = 0; i < employeeList.size(); i++) {
			for (int j = 0; j < employeeList.size() - i - 1; j++) {
				Employee a = (Employee) employeeList.get(j);
				Employee b = (Employee) employeeList.get(j + 1);
				if (a.getSalary() > b.getSalary()) {
					employeeList.set(j, b);
					employeeList.set(j + 1, a);
				}
			}
		}

		for (int x = 0; x < employeeList.size(); x++) {
			Employee e = (Employee) employeeList.get(x);
			System.out.println(e.getEmpId() + " " + e.getJobTitle() + " " + e.getCompanyName() + " " + e.getSalary());
		}

		System.out.println("----------------------------------");

		//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()

		Student anyStudent = new Student();
		anyStudent.setFirstName("John");
		anyStudent.setSecondName("Johnson");
		anyStudent.setAge(20);
		anyStudent.setSchoolName("Harvard");

		Person newPerson = anyStudent;
		System.out.println(newPerson.announce());
		Student newStudent = (Student) newPerson;
		System.out.println(newStudent.announce());

		System.out.println("----------------------------------");

		//TODO 4 Create method for full change of employee information
		// for example some employee change his work


		System.out.println("----------------------------------");

		Employee newEmployee = new Employee();
		newEmployee.setFirstName("Jim");
		newEmployee.setSecondName("First");
		newEmployee.setAge(30);
		newEmployee.setEmpId(11);
		newEmployee.setJobTitle("DevOps");
		newEmployee.setCompanyName("Oracle");
		newEmployee.setSalary(10000);
		newEmployee.announce();

		System.out.println("Employee information before change - ");
		System.out.println(newEmployee.announce());
		System.out.println();
		System.out.println("Employee information after change - ");
		changeInfo(newEmployee);

	}

	private static void changeInfo(Employee newEmployee) {
		newEmployee.setJobTitle("Project Manager");
		newEmployee.setSalary(1500);
		newEmployee.setCompanyName("Apple");
		System.out.println(newEmployee.announce());
	}
}
