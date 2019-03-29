package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class FirstActivity  extends Employee //DONT WE NEED ADD ONE "EXTEND STUDENT"
{

	public static <print> void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result


		ArrayList <Employee> employeesList = new ArrayList<Employee>();

		Employee a = new Employee();
		a.setFirstName("Jānis");
		a.setSecondName ("Daukšts");
		a.setAge(24);
		a.setEmpId(12);
		a.setJobTitle("Director");
		a.setCompanyName("Free food LTD");
		a.setSalary(1500);
		employeesList.add(a);

		Employee b = new Employee();
		b.setFirstName("Pēteris");
		b.setSecondName("Akmens");
		b.setAge(36);
		b.setEmpId(13);
		b.setJobTitle("Assistant");
		b.setCompanyName("Free food LTD");
		b.setSalary(1300);
		employeesList.add(b);

		Employee c = new Employee();
		c.setFirstName("Ainārs");
		c.setSecondName("Ķārumnieks");
		c.setAge(26);
		c.setEmpId(64);
		c.setJobTitle("Team lead");
		c.setCompanyName("Free food LTD");
		c.setSalary(1000);
		employeesList.add(c);

		Employee d = new Employee();
		d.setFirstName("Aija");
		d.setSecondName("Augustele");
		d.setAge(27);
		d.setEmpId(43);
		d.setJobTitle("Free hug giver");
		d.setCompanyName("Free food LTD");
		d.setSalary(1350);
		employeesList.add(d);

		Employee e = new Employee();
		e.setFirstName("Annija");
		e.setSecondName("Maizīte");
		e.setAge(47);
		e.setEmpId(32);
		e.setJobTitle("Cleaner");
		e.setCompanyName("Free food LTD");
		e.setSalary(870);
		employeesList.add(e);

		Employee f = new Employee();
		f.setFirstName("Laura");
		f.setSecondName("Sarkane");
		f.setAge(57);
		f.setEmpId(52);
		f.setJobTitle("Accountant");
		f.setCompanyName("Free food LTD");
		f.setSalary(1124);
		employeesList.add(f);

		System.out.println(employeesList);




		print(employeesList);
		getSalary(employeesList);

		employeesList.sort();




		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		class Sort implements Comparator<Employee>
		{
			public int compare (Employee a, Employee b){
				return (int) (a.getSalary() - b.getSalary());
			}
		}

		Collection.sort(ar, new Sort());
		System.out.println();




		//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()
		Person student1 = new Student("Jānis", "Daukšts", 24, "University of Latvia", 100);
		System.out.println(student1.announce());
		Student student1_2 = new Student(student1);



		//TODO 4 Create method for full change of employee information
		// for example some employee change his work






	}

	
	
}
