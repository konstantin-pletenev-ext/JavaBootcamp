package sef.ATestTask.FirstActivity;


import java.util.*;

public class FirstActivity {

    public static void main(String[] args) {

        //TODO 1 Create collection of employee (more than 5) list or map
        List employesList = new ArrayList();


        employesList.add(new Employee("Ivan3", "Ivanov", 20, 1, "Director", "Udens", 500));
        employesList.add(new Employee("Andrej", "Petrof", 22, 2, "Manager", "Gaze", 300));
        employesList.add(new Employee("Kiril", "Sidorof", 23, 3, "Developer", "Gaisa", 400));
        employesList.add(new Employee("Roman", "Smernof", 25, 4, "Tester", "Apsardze", 600));
        employesList.add(new Employee("Ilya", "Smernoff", 27, 5, "Seller", "Parvald", 700));


        for (int i = 0; i < employesList.size(); i++) {
            Employee e = (Employee) employesList.get(i);
            System.out.println(e.getFirstName() + " " + e.getSecondName() + " " + e.getAge() + " " + e.getEmpId() + " " + e.getJobTitle() + " " + e.getCompanyName() + " " + e.getSalary());
        }


        //TODO 2 sort and this employees by salary (from min to max)

        class Sort implements Comparator<Employee> {
            public int compare(Employee a, Employee b) {
                return (int) (a.getSalary() - b.getSalary());

            }

        }
        Collections.sort(employesList, new Sort());
        System.out.println("-------------------------");


        for (int i = 0; i < employesList.size(); i++) {
            Employee e = (Employee) employesList.get(i);
            System.out.println(e.getFirstName() + " " + e.getSecondName() + " " + e.getAge() + " " + e.getEmpId() + " " + e.getJobTitle() + " " + e.getCompanyName() + " " + e.getSalary());
        }


        // TIP - google bubble sort
        //		System.out.println() result

        //TODO 3 create instance of a Student as a Person ->
        System.out.println("-------------------------");
        Person newPersona = new Person("Dima", "Vasiljevs", 30);
        System.out.println(newPersona.announce());
        Person newStudent = new Student("Dima", "Vasiljevs", 30, "Bankas", 4);


        System.out.println(newStudent.announce());

        System.out.println("-------------------------");
        // than ask him introduce()
        // than make them Student
        // than ask him introduce()

        //TODO 4 Create method for full change of employee information


        // for example some employee change his work
        changework(employesList);

        for (int i = 0; i < employesList.size(); i++) {
            Employee e = (Employee) employesList.get(i);
            System.out.println(e.getFirstName() + " " + e.getSecondName() + " " + e.getAge() + " " + e.getEmpId() + " " + e.getJobTitle() + " " + e.getCompanyName() + " " + e.getSalary());
        }
        System.out.println("-------------------------");
        Person check = new Person();
        check.setFirstName("hhhh8h8");
        check.checkNames();

    }

    public static void changework(List employesList) {

        Employee e = (Employee) employesList.get(1);
        e.setCompanyName("Darbs");
        Employee ee = (Employee) employesList.get(2);
        ee.setCompanyName("Darbs");


    }


}
