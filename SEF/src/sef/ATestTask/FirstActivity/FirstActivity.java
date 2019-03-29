package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map

		List<Employee> list = new ArrayList();

		Employee A = new Employee();
		A.setFirstName("Muthu");
		A.setSecondName(" Anandan ");
		A.setAge(22);
		A.setEmpId(01);
		A.setJobTitle("Devloper");
		A.setCompanyName("Accenture");
		A.setSalary(3200);


		Employee B = new Employee();
		B.setFirstName("Prince");
		B.setSecondName(" Krishna ");
		B.setAge(23);
		B.setEmpId(02);
		B.setJobTitle("Manager");
		B.setCompanyName("Cognizant");
		B.setSalary(3000);


		Employee C = new Employee();
		C.setFirstName("Ben");
		C.setSecondName(" Stoaks ");
		C.setAge(32);
		C.setEmpId(03);
		C.setJobTitle("Devloper");
		C.setCompanyName("IBM");
		C.setSalary(4000);


		Employee D = new Employee();
		D.setFirstName("Chrish");
		D.setSecondName(" Gaule ");
		D.setAge(28);
		D.setEmpId(04);
		D.setJobTitle("Test Automation");
		D.setCompanyName("Microsoft");
		D.setSalary(3500);


		Employee E = new Employee();
		E.setFirstName("Steve");
		E.setSecondName(" Smith ");
		E.setAge(27);
		E.setEmpId(05);
		E.setJobTitle("Devloper");
		E.setCompanyName("HP");
		E.setSalary(2300);

		Employee F = new Employee();
		F.setFirstName("David");
		F.setSecondName(" Warner ");
		F.setAge(37);
		F.setEmpId(06);
		F.setJobTitle("System Analyst");
		F.setCompanyName("TATA");
		F.setSalary(2800);

		list.add(A);
		list.add(B);
		list.add(C);
		list.add(D);
		list.add(E);
		list.add(F);

		System.out.println("List of Employee");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).announce());

		}

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort

		Employee Salarytemp = new Employee();

		for (int i = list.size() - 1; i > 0; i--) {
			for (int j = 0; j < list.size() - 1; j++) {
				if (list.get(j).getSalary() > list.get(j + 1).getSalary()) {
					Salarytemp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, Salarytemp);
				}
			}
		}
		System.out.println("");
		System.out.println("Employess salary by min to max");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getSalary());
		}
		//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()

		Person s = new Student();
		((Student) s).setSchoolname(" Accenture Bootcamp ");
		System.out.println(s.announce());


		//TODO 4 Create method for full change of employee information

		// for example some employee change his work
		A.setJobTitle("Test Automation Engineer");
		System.out.println(A.getFirstName() + " " +  A.getEmpId() + " " + A.getAge() + " " + A.getCompanyName()
				+ " "  +A.getJobTitle() + " " + A.getSalary());
		System.out.println(A.announce());
	}


}