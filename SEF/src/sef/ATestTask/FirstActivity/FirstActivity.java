package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity {


	public static void main(String[] args) {

		//ArrayList<Employee> myList = new ArrayList();
		List<Employee> myList = new ArrayList();

		Employee a = new Employee();
		a.setFirstName("Ralfs");
		a.setSecondName("Eilands");
		a.setAge(23);
		a.setEmpId(33);
		a.setJobTitle("Developer");
		a.setCompanyName("Accenture");
		a.setSalary(1500);
		myList.add(a);

		Employee b = new Employee();
		b.setFirstName("Renars");
		b.setSecondName("Zeltins");
		b.setAge(25);
		b.setEmpId(15);
		b.setJobTitle("Tester");
		b.setCompanyName("Bootcamp");
		b.setSalary(1800);
		myList.add(b);

		Employee c = new Employee();
		c.setFirstName("Einars");
		c.setSecondName("Eilands");
		c.setAge(40);
		c.setEmpId(45);
		c.setJobTitle("Analyst");
		c.setCompanyName("Accenture Finland");
		c.setSalary(2000);
		myList.add(c);

		Employee d = new Employee();
		d.setFirstName("Kristaps");
		d.setSecondName("Magone");
		d.setAge(26);
		d.setEmpId(9);
		d.setJobTitle("Project assistant");
		d.setCompanyName("Aico");
		d.setSalary(3000);
		myList.add(d);

		Employee e = new Employee();
		e.setFirstName("Dairis");
		e.setSecondName("Vilsons");
		e.setAge(30);
		e.setEmpId(1);
		e.setJobTitle("Seller");
		e.setCompanyName("Narvesen");
		e.setSalary(500);
		myList.add(e);

		Employee s = new Employee();
		s.setFirstName("Meijers");
		s.setSecondName("Licis");
		s.setAge(48);
		s.setEmpId(5);
		s.setJobTitle("Assistant");
		s.setCompanyName("Attido");
		s.setSalary(5000);
		myList.add(s);

		//TODO 1 Create collection of employee (more than 5) list or map
		// Type code to print this list
		for (Employee element : myList) {
			System.out.println(element.announce());

			//TODO 2 sort and this employees by salary (from min to max)
			// TIP - google bubble sort
			//		System.out.println() result

			}
			Employee temp = new Employee();
			for (int i = myList.size() - 1; i > 0; i--) {
				for(int j = 0; j < myList.size() - 1; j++) {
				if (myList.get(j).getSalary() > myList.get(j + 1).getSalary()) {
					temp = myList.get(j);
					myList.set(j, myList.get(j + 1));
					myList.set(j + 1, temp);
				}
			}
		}

System.out.println("Salary for employees from min to max");
for(int i = 0; i < myList.size(); i++) {
	System.out.println(myList.get(i).getSalary());
}
//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()

		Person in = new Student();
	((Student) in).setSchoolName("of Latvia");
	System.out.println(in.announce());

		//TODO 4 Create method for full change of employee information
		// for example some employee change his work


		System.out.print("THIS IS EMPLOYEE INFORMATION BEFORE CHANGES");
		System.out.println("\n" + a.getFirstName() + " " + a.getSecondName() + " "+ "works" + " " + "in" + " " + a.getCompanyName());
		System.out.println(a.announce());

		System.out.print("THIS IS EMPLOYEE INFORMATION AFTER CHANGES");
		a.setCompanyName("MAXIMA");
		System.out.println("\n" + a.getFirstName() + " " + a.getSecondName() + " "+ "works" + " " + "in" + " " + a.getCompanyName());
		System.out.println(a.announce());



	}





			}
















	
	


