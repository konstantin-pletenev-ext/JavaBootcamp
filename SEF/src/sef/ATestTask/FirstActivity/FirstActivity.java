package sef.ATestTask.FirstActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        Employee a = new Employee();
        Employee b = new Employee();
        Employee c = new Employee();
        Employee d = new Employee();
        Employee e = new Employee();
        Employee f = new Employee();

        a.setEmpId(1);
        a.setFirstName("Mike");
        a.setSecondName("Goodwill");
        a.setAge(25);
        a.setJobTitle("electrician");
        a.setCompanyName("Latvenergo");
        a.setSalary(1000.99);

        b.setEmpId(2);
        b.setFirstName("Jess");
        b.setSecondName("Valenwood");
        b.setAge(25);
        b.setJobTitle("tester");
        b.setCompanyName("TestDevLab");
        b.setSalary(999.99);

        c.setEmpId(3);
        c.setFirstName("Markus");
        c.setSecondName("Price");
        c.setAge(30);
        c.setJobTitle("HR Manager");
        c.setCompanyName("Rimi");
        c.setSalary(777.99);

        d.setEmpId(4);
        d.setFirstName("Mark");
        d.setSecondName("Spencer");
        d.setAge(23);
        d.setJobTitle("accountant");
        d.setCompanyName("Accenture");
        d.setSalary(1000.99);

        e.setEmpId(5);
        e.setFirstName("Myra");
        e.setSecondName("Daily");
        e.setAge(35);
        e.setJobTitle("architect");
        e.setCompanyName("Jordans and CO");
        e.setSalary(1500.00);

        f.setEmpId(6);
        f.setFirstName("Laura");
        f.setSecondName("Jakste");
        f.setAge(18);
        f.setJobTitle("tester");
        f.setCompanyName("Accenture");
        f.setSalary(1200.50);

        ArrayList<Employee> ar = new ArrayList<>();
        ar.add(a);
        ar.add(b);
        ar.add(c);
        ar.add(d);
        ar.add(e);
        ar.add(f);

        //TODO 2 sort and this employees by salary (from min to max)
        class Sort implements Comparator<Employee> {
            // Used for sorting in ascending order of
            // roll number
            public int compare(Employee a, Employee b) {
                return (int) (b.getSalary() - a.getSalary());
            }
        }

        Collections.sort(ar, new Sort());

        Boolean badScenario = false;
        for (int i = 0; i < ar.size(); i++) {
            Employee emp = ar.get(i);
            // Create a Pattern object
            Pattern p = Pattern.compile("^[a-zA-Z ]+$");

            // Now create matcher object.
            Matcher m = p.matcher(emp.getFirstName());
            Matcher m2 = p.matcher(emp.getSecondName());
            if (!m.find()) {
                System.out.println("Error: " + emp.getFirstName() + " is not a name!");
                badScenario = true;
                break;
            }
            if (!m2.find()) {
                System.out.println("Error: " + emp.getSecondName() + " is not a surname!");
                badScenario = true;
                break;
            }
        }

        if (badScenario == false) {
            System.out.println("******************************");
            for (int i = 0; i < ar.size(); i++) {
                Employee emp = ar.get(i);

                System.out.println("Employee ID: " + emp.getEmpId());
                System.out.println("Name: " + emp.getFirstName());
                System.out.println("Surname: " + emp.getSecondName());
                System.out.println("Age: " + emp.getAge());
                System.out.println("Job: " + emp.getJobTitle());
                System.out.println("Company: " + emp.getCompanyName());
                System.out.println("Salary: " + emp.getSalary());
                System.out.println(emp.announce());
                System.out.println("******************************");
            }
            System.out.println();

            //TODO 3 create instance of a Student as a Person ->

            Person g = new Person();
            g.setFirstName("Maksims");
            g.setSecondName("Snezkins");
            g.setAge(22);

            // than ask him introduce()
            System.out.println(g.announce());

            // than make them Student
            Student h = new Student();
            h.setFirstName("Maksims");
            h.setSecondName("Snezkins");
            h.setAge(22);
            h.setSchool("University of Latvia");
            h.setGrade(7);

            // than ask him introduce()
            System.out.println(h.announce());

            //TODO 4 Create method for full change of employee information
            // for example some employee change his work


        }
    }
}



