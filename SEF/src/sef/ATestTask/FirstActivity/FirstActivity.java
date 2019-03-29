package sef.ATestTask.FirstActivity;

import java.util.*;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result

        List employee = new ArrayList();
        Employee ivan = new Employee("Ivan", "Ivanov", "Accountant", 250.0);
        Employee ira = new Employee("Irina", "Ivanova", "Teacher", 350.0);
        Employee aleksandr = new Employee("Aleksandr", "Ivanov", "Administrator", 250.02);
        Employee rita = new Employee("Rita", "Ivanova", "Manager", 450.0);
        Employee danil = new Employee("Danil", "Ivanov", "Manager", 550.00);
        Employee vlada = new Employee("Vlada", "Ivanova", "Manager", 550.05);

        employee.add(ivan);
        employee.add(ira);
        employee.add(aleksandr);
        employee.add(rita);
        employee.add(danil);
        employee.add(vlada);

        for (Object element : employee) {
            System.out.println(element);
        }

        System.out.println();

        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result
        Collections.sort(employee, new SalaryComparator());
        System.out.println("Order of employee after sorting by salary is:");

        for (int i = 0; i < employee.size(); i++) {
            try {

                System.out.println(employee.get(i + 1));
            } catch (IndexOutOfBoundsException ex) {

            }
        }

        // Collections.sort(employee);

        //TODO 3 create instance of a Student as a Person ->
        // than ask him introduce()
        // than make them Student
        // than ask him introduce()
        System.out.println();
        Person person = new Student();
        System.out.println(person);
        Person personE = new Student("Alex", "Ivanov", 25, "LU");
        personE.introduce();
        System.out.println(personE.announce());

        //TODO 4 Create method for full change of employee information
        // for example some employee change his work
        System.out.println();

        Employee jana = new Employee("Ja99na", "Ivanova8", 29, "Accountant", "Samsung");
        System.out.println(jana.announce());
        System.out.println();

        changeData(jana);
    }

    public static void changeData(Employee employee) {
        employee.setFirstName("Irina");
        employee.setSecondName("Petrova");
        employee.setJobTitle("Manager");
        employee.setCompanyName("Accenture");
        System.out.println(employee.announce());
    }
}
