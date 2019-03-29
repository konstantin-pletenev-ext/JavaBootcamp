package sef.ATestTask.FirstActivity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FirstActivity {

	public static void main(String[] args) {

		// 1 Create collection of employee (more than 5) list or map
        List<Employee> employees = new ArrayList<>();
        try {
            employees.add(new Employee("Employee", "SurnameOne", 20, 0, "Dancer", "Company1", 2));
            employees.add(new Employee("Employee", "N/A", 55, 0, "Slave", "SlaveCompany", -1));
            employees.add(new Employee("Employee", "SurnameThree", 1, 0, "Toddler", "BabyCompany", 0.05));
            employees.add(new Employee("EmployeeFour", "SurnameFour", 153, 0, "Being dead", "Graveyard", 0));
            employees.add(new Employee("EmployeeFive", "SurnameFive", 34, 0, "Janitor", "Company1", 400));
            employees.add(new Employee("EmployeeSix", "SurnameSix", 18, 0, "Car washer", "Company2", 250));
        } catch (InvalidPersonNameException e) {
            System.out.println(e.getMessage());
        }

		//		System.out.println() result
        for (Employee employee: employees) {
            System.out.println(employee.announce() + ", salary is " + employee.getSalary());
        }

		// 2 sort and this employees by salary (from min to max)
        Collections.sort(employees, new EmployeeSalaryComparator());

        //		System.out.println() result
        System.out.println("\nEmployees sorted by salary:");
        for (Employee employee: employees) {
            System.out.println(employee.announce() + ", salary is " + employee.getSalary());
        }

        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println("\nEmployees sorted by name:");
        for (Employee employee: employees) {
            System.out.println(employee.announce());
        }

        String toFile = "";
        for (Employee employee: employees) {
            toFile += employee.getFirstName() + " " + employee.getSecondName() + " " + employee.getAge() +
                    " " + employee.getEmpId() + " " + employee.getJobTitle() + " " + employee.getCompanyName() +
                    " " + employee.getSalary() + "\n";
        }

        File file = new File(".//io//employees.txt");
        if (!file.exists()){
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileWriter fw = new FileWriter(file);
            fw.write(toFile);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 3 create instance of a Student as a Person ->
        Person personStudent = null;
        try {
            personStudent = new Student("Name", "Surname", 20, "Cool Kids School");
        } catch (InvalidPersonNameException e) {
            System.out.println(e.getMessage());
        }

        // than ask him introduce()
        System.out.print("\n");
        System.out.println(personStudent.announce());

		// than make them Student
        Student actualStudent = (Student) personStudent;

		// than ask him introduce()
        System.out.println(actualStudent.announce());

		// 4 Create method for full change of employee information
		// for example some employee change his work
        System.out.print("\n");
        System.out.println(employees.get(0).announce());
        try {
            System.out.println(employeeChanger(employees.get(0), "NewName", "NewSecondName", 20, 99, "Car racer", "GoCars", 8000).announce());
        } catch (InvalidPersonNameException e) {
            System.out.println(e.getMessage());
        }

    }

	private static class EmployeeSalaryComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getSalary() < o2.getSalary()){
                return -1;
            } else if (o1.getSalary() > o2.getSalary()){
                return 1;
            } else {
                return 0;
            }
        }
    }

    private static class EmployeeNameComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getFirstName().compareTo(o2.getFirstName()) != 0){
                return o1.getFirstName().compareTo(o2.getFirstName());
            } else {
                return o1.getSecondName().compareTo(o2.getSecondName());
            }
        }
    }

    private static Employee employeeChanger(Employee employee, String firstName, String secondName, int age,
                                            int empId, String jobTitle, String companyName, double salary)
            throws InvalidPersonNameException
    {
	    Employee resultEmployee = new Employee(employee);
	    resultEmployee.setAll(firstName, secondName, age, empId, jobTitle, companyName, salary);
	    return resultEmployee;
    }
}