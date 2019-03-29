package sef.ATestTask.FirstActivity;

import java.util.ArrayList;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result

		ArrayList<Employee> myEmpl = new ArrayList();

		Employee e1 = new Employee();
		e1.setFirstName("Jane");
		e1.setSecondName("Green");
		e1.setAge(24);
		e1.setJobTitle("Administrator");
		e1.setCompanyName("Accenture");
		e1.setEmpId(101);
		e1.setSalary(120.56);
		myEmpl.add(e1);

		Employee e2 = new Employee();
		e2.setFirstName("John");
		e2.setSecondName("Green");
		e2.setAge(26);
		e2.setJobTitle("Programmer");
		e2.setCompanyName("Accenture");
		e2.setEmpId(102);
		e2.setSalary(140.50);
		myEmpl.add(e2);

		Employee e3 = new Employee();
		e3.setFirstName("David");
		e3.setSecondName("Johnson");
		e3.setAge(29);
		e3.setJobTitle("Programmer");
		e3.setCompanyName("Accenture");
		e3.setEmpId(103);
		e3.setSalary(140.00);
		myEmpl.add(e3);

		Employee e4 = new Employee();
		e4.setFirstName("Tom");
		e4.setSecondName("Velvet");
		e4.setAge(27);
		e4.setJobTitle("Tester");
		e4.setCompanyName("Accenture");
		e4.setEmpId(104);
		e4.setSalary(150.30);
		myEmpl.add(e4);

		Employee e5 = new Employee();
		e5.setFirstName("Dave");
		e5.setSecondName("Smith");
		e5.setAge(34);
		e5.setJobTitle("Consultant");
		e5.setCompanyName("Accenture");
		e5.setEmpId(101);
		e5.setSalary(100.10);
		myEmpl.add(e5);

		Employee Pep = new Employee();

		for (int i=0; i<myEmpl.size(); i++){
			Pep = myEmpl.get(i);
			System.out.println("Name: "+ Pep.getFirstName()+ " " + Pep.getSecondName()+ "\nAge: " + Pep.getAge()+ "\nJob Title: "
					+Pep.getJobTitle() + "\nCompany: " + Pep.getCompanyName()+"\nSalary: " + Pep.getSalary()+"\nEmpl. ID: "
					+ Pep.getEmpId() +"\n");
		}

		Employee temp = new Employee();
		for (int i = myEmpl.size() - 1; i>0; i--){
			for (int j = 0; j <myEmpl.size() - 1; j++) {
				if (myEmpl.get(j).getSalary() > myEmpl.get(j + 1).getSalary()) {
					temp = myEmpl.get(j);
					myEmpl.set(j, myEmpl.get(j+1));
					myEmpl.set(j + 1, temp);
				}
			}
		}

		System.out.println("Employees' salary from min to max: \n");
		for  (int i = 0; i < myEmpl.size(); i++) {
			System.out.println(myEmpl.get(i).getSalary());
		}

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result



		//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()

		Person ps = new Student();
		ps.setFirstName("Alice");
		ps.setSecondName("Smith");
		ps.setAge(21);

		System.out.println(ps.announce());


		((Student) ps).setSchool("RTU");
		((Student) ps).setGrade(9);

		System.out.println(ps.announce());

		//TODO 4 Create method for full change of employee information
		// for example some employee change his work

		e2.setCompanyName("Tieto");
		System.out.println("\n" + e2.getFirstName() + " " + e2.getSecondName() + " has joined "
				+e2.getCompanyName());
		System.out.println(e2.announce());
	}

	}

