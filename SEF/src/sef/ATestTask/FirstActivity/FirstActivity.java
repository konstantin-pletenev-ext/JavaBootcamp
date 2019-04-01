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

        changeEmployeeData(f);

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

        class Sort2 implements Comparator<Employee> {
            @Override
            public int compare(Employee o1, Employee o2) {
                Employee p1 = (Employee) o1;
                Employee p2 = (Employee) o2;
                int res =  p1.getSecondName().compareToIgnoreCase(p2.getSecondName());
                if (res != 0)
                    return res;
                return p1.getSecondName().compareToIgnoreCase(p2.getSecondName());
            }
        }


        Collections.sort(ar, new Sort());

        boolean badScenario = false;
        for (int i = 0; i < ar.size(); i++) {
            Employee emp = ar.get(i);

            if (checkForNumbers(emp.getFirstName())) {
                System.out.println("Error: " + emp.getFirstName() + " is not a name! " +
                        "Please, correct the data for the worker with ID: " + emp.getEmpId() + "!");
                badScenario = true;
            }
            if (checkForNumbers(emp.getSecondName())) {
                System.out.println("Error: " + emp.getSecondName() + " is not a surname! " +
                        "Please, correct the data for the worker with ID: " + emp.getEmpId() + "!");
                badScenario = true;
            }
        }

        if (badScenario == false) {
            System.out.println("SORTED BY SALARY");
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

            Collections.sort(ar, new Sort2());

            System.out.println("SORTED BY SURNAME AND NAME");
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
            Person person = new Student();
            person.setFirstName("Maksims");
            person.setSecondName("Snezkins");
            person.setAge(22);

            // than ask him introduce()
            System.out.println(person.announce());

            // than make them Student
            Student student = (Student) person;
            student.setSchool("University of Latvia");
            student.setGrade(7);

            // than ask him introduce()
            System.out.println(student.announce());

//


        }
    }

    //TODO 4 Create method for full change of employee information
    // for example some employee change his work
    public static void changeEmployeeData(Employee employee) {
        employee.setJobTitle("lead tester");
        employee.setSalary(1500);
    }

    public static boolean checkForNumbers(String s) {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(s);

        return m.find();
    }


}



