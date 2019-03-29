package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map

		List<Employee> employeeList = new ArrayList();
		employeeList.add( new Employee() );

		Employee first = new Employee(1, "Engeneer", "ABC", 300.0);
		first.setFirstName("John");
		first.setSecondName("Doe");
		first.setAge(25);

		Employee second = new Employee(2, "Assistant", "DEF", 350.0);
		second.setFirstName("Mike");
		second.setSecondName("Berming");
		second.setAge(28);

		Employee third = new Employee(3, "Engeneer", "DEF", 600.0);
		third.setFirstName("Lester");
		third.setSecondName("White");
		third.setAge(21);

		Employee fourth = new Employee(4, "Painter", "AlphaClub", 470.0);
		fourth.setFirstName("Oscar");
		fourth.setSecondName("Herring");
		fourth.setAge(43);

		Employee fifth = new Employee(5, "Casheer", "Rimi", 220.0);
		fifth.setFirstName("Hannah");
		fifth.setSecondName("Morelle");
		fifth.setAge(34);

		employeeList.add(first);
		employeeList.add(second);
		employeeList.add(third);
		employeeList.add(fourth);
		employeeList.add(fifth);
		//		System.out.println() result

		for (int i = 0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i).announce());
			System.out.println("***************************************");
		}

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		System.out.println("\nBefore\n");
		for (int i = 0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i).getSalary());
		}

		Employee temp = new Employee();
		for (int i = 0; i < employeeList.size(); i++) {
			for (int j = 0; j < employeeList.size()-1; j++) {
				if( employeeList.get(j+1).getSalary() < employeeList.get(j).getSalary() ) {
					temp = employeeList.get(j);
					employeeList.set(j, employeeList.get(j+1));
					employeeList.set(j+1, temp);
				}
			}
		}
		//		System.out.println() result

		System.out.println("\nAfter\n");
		for (int i = 0; i < employeeList.size(); i++) {
			System.out.println(employeeList.get(i).getSalary());
		}

		//TODO 3 create instance of a Student as a Person ->

		Person pers1 = new Student();
		// than ask him introduce()

		System.out.println(pers1.announce());
		// than make them Student

		Student pers2 = (Student) pers1;
		// than ask him introduce()

		System.out.println(pers2.announce());
		//TODO 4 Create method for full change of employee information
		// for example some employee change his work

		System.out.println("\nEmployee 'first' before changes!\n");
		System.out.println(first.announce());

		String firstName = "Peter";

		first.fullChange(firstName, first.getSecondName(), first.getAge(), first.getEmpId(), "Tester", "Accenture", first.getSalary());

		System.out.println("\nAfter Changes!\n");
		System.out.println(first.announce());


		// Person exception test
		Person test1 = new Person();
		test1.setFirstName("Ivan3");

	}

	
	
}
