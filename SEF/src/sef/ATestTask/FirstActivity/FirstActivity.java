package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class FirstActivity {


	public static void main(String[] args) {


		List<Employee> empList = new ArrayList();
		empList.add(new Employee("Ivan", "Volkov",25, 01, "programmer" ,"IBM", 1050.50));
		empList.add(new Employee("Denis",  "Brawn", 27, 02,"tester", "IBM", 1000.00));
		empList.add(new Employee( "Artur", "Smith", 30, 03, "manager", "IBM", 2000.00));
		empList.add(new Employee( "Jon",  "Red", 24, 04, "junior", "IBM", 500.00));
		empList.add(new Employee( "Tom",  "Blue", 28, 05, "tester_2", "IBM", 1100.00));
		empList.add(new Employee("Filipp",  "Green", 38, 06, "arhitector", "IBM", 2300.00));

		System.out.println("Employee List " +empList);


		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result
		class Sortbyroll implements Comparator<Employee>
		{
			// Used for sorting in ascending order of
			// roll number
			public int compare(Employee a, Employee b)
			{
				return (int) (b.getSalary() - a.getSalary());
			}
		}

		Collections.sort(empList, new Sortbyroll());

		for (int i=0; i<empList.size(); i++){
			Employee emp = empList.get(i);
		System.out.println(emp.getempId());
			System.out.println(emp.getSalary());}




	//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()

		//TODO 4 Create method for full change of employee information
		// for example some employee change his work


	}



}
