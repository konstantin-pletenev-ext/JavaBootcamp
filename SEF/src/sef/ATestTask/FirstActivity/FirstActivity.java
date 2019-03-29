package sef.ATestTask.FirstActivity;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result

        List<Employee> list = new ArrayList<Employee>();

        list.add(new Employee("Ivan", "Ivanov", 35, 1, "Manager", "Freelance", 2000));
        list.add(new Employee("Petr", "Petrov", 40, 2, "Developer", "Somewhere", 4000));
        list.add(new Employee("Mike", "Johnson", 25, 3, "Tester", "Somewhere else", 3000));
        list.add(new Employee("Jessica", "Smith", 33, 5, "Senior Developer", "Somewhere", 5000));
        list.add(new Employee("Alexander", "Makedonsky", 50, 8, "Big Boss", "BigCoolCopmany", 10000));
        System.out.println("-----------------");
        for (int i = 0; i < list.size(); i++) {
            Employee employee = list.get(i);
            System.out.println("Employee: " + employee.getFirstName() + " " + employee.getSecondName());
            System.out.println("Working as " + employee.getJobTitle() + ", ID - " + employee.getEmpId() + ", at company '" + employee.getCompanyName() + "'");
            System.out.println("With salary: " + employee.getSalary());
            System.out.println("------------------");
        }
        System.out.println();


        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result

        class Sort implements Comparator<Employee> {
            public int compare(Employee a, Employee b) {
                return (int) (b.getSalary() - a.getSalary());
            }
        }

        Collections.sort(list, new Sort());

        System.out.println("------------------");
        for (int i = 0; i < list.size(); i++) {
            Employee employee = list.get(i);
            System.out.println("Employee: " + employee.getFirstName() + " " + employee.getSecondName());
            System.out.println("Working as " + employee.getJobTitle() + ", ID - " + employee.getEmpId() + ", at company '" + employee.getCompanyName() + "'");
            System.out.println("With salary: " + employee.getSalary());
            System.out.println("-----------------");
        }

        //TODO 3 create instance of a Student as a Person ->
        // than ask him introduce()
        // than make them Student
        // than ask him introduce()

        Person someStudent = new Student();
        System.out.println(someStudent.announce());

        Student newStudent = (Student) someStudent;
        newStudent.setSchoolName("Bootcamp");
        System.out.println(newStudent.announce());

        //TODO 4 Create method for full change of employee information
        // for example some employee change his work

        System.out.println("-------------------");
        Employee testEmployee = new Employee("Vasja", "Petrov", 30, 4, "Tester", "Somewhere", 1500);
        System.out.println(testEmployee.announce());

        changeEmployeeData(testEmployee);

        System.out.println("-------------------");
        System.out.println(checkDigit("Ivan88"));
        System.out.println(checkDigit("Jessica"));

    }


    public static void changeEmployeeData(Employee employee) {
        employee.setFirstName("Test");
        employee.setSecondName("TestSurname");
        employee.setAge(20);
        employee.setEmpId(6);
        employee.setJobTitle("Trainee");
        employee.setCompanyName("Somewhere else");
        employee.setSalary(700);

        System.out.println(employee.announce());
    }


    // Check if there is digits in String

    public static boolean checkDigit(String s){
        Pattern p = Pattern.compile( "[0-9]" );
        Matcher m = p.matcher( s );

        return m.find();
    }


}
