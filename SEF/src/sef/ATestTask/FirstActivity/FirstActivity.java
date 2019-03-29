package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Collections;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        ArrayList<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee(1, "Engineer1", "Accenture1", 1000);
        e1.setFirstName("Tom1");
        e1.setAge(20);
        employees.add(e1);

        Employee e2 = new Employee(1, "Engineer2", "Accenture2", 2000);
        e2.setFirstName("Tom2");
        e2.setAge(21);
        employees.add(e2);

        Employee e3 = new Employee(1, "Engineer3", "Accenture3", 900);
        e3.setFirstName("Tom3");
        e3.setAge(22);
        employees.add(e3);

        Employee e4 = new Employee(1, "Engineer4", "Accenture4", 500);
        e4.setFirstName("Tom4");
        e4.setAge(23);
        employees.add(e4);

        Employee e5 = new Employee(1, "Engineer5", "Accenture5", 300);
        e5.setFirstName("Tom5");
        e5.setAge(24);
        employees.add(e5);

        Employee e6 = new Employee(1, "Engineer6", "Accenture6", 150);
        e6.setFirstName("Tom6");
        e6.setAge(25);
        employees.add(e6);

        Employee e7 = new Employee(1, "Engineer", "Accenture7", 1000);
        e7.setFirstName("Tom7");
        e7.setAge(26);
        employees.add(e7);


        //		System.out.println() result
        for (Employee e : employees) {
            System.out.println(e.announce());
        }

        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result
        Collections.sort(employees);

        for (Employee e : employees) {
            System.out.println(e.announce());
        }

        //TODO 3 create instance of a Student as a Person ->
        // than ask him introduce()
        // than make them Student
        // than ask him introduce()

        Person student1 = new Student();
        System.out.println(student1.announce());

        Student student2 = new Student();
        System.out.println(student2.announce());

        //TODO 4 Create method for full change of employee information
        // for example some employee change his work
        Employee employee1 = employees.get(0);
        System.out.print(employee1.announce());
        changeJob(employee1, "Accenture2", "QA", 1050);
        System.out.print(employee1.announce());

        Employee employee7 = employees.get(6);
        System.out.print(employee7.announce());
        changeJob(employee7, "Accenture", "Boss", 2550);
        System.out.print(employee7.announce());
    }

    private static void changeJob(Employee employee, String companyName, String jobTitle, double salary) {
        employee.setCompanyName(companyName);
        employee.setJobTitle(jobTitle);
        employee.setSalary(salary);
    }
}




