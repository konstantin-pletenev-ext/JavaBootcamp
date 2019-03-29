package sef.ATestTask.FirstActivity;

import java.util.*;

public class FirstActivity {

    public static void main(String[] args) {
        //TODO 1 Create collection of employee (more than 5) list or map
        //		System.out.println() result

        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("Jessy", "Moan", 35, 0001, "Boss", "Company", 2000.0));
        employeeList.add(new Employee("Sammy", "Zun", 34, 0002, "Senior", "Company", 1000.0));
        employeeList.add(new Employee("Jane", "Muss", 28, 0003, "Geek", "Company", 500.0));
        employeeList.add(new Employee("Emily", "Glitch", 25, 0004, "Worker", "Company", 700.0));
        System.out.println("Unsorted list of employees:");
        for (Employee i : employeeList) {
            System.out.println(i.getFirstName() + " = " + i.getSalary());
        }
        System.out.println("\n");

        //TODO 2 sort and this employees by salary (from min to max)
        // TIP - google bubble sort
        //		System.out.println() result

        for (int i = 0; i < employeeList.size(); i++){
            for (int j = 1; j < employeeList.size(); j++){
                if (employeeList.get(j-1).getSalary() > employeeList.get(j).getSalary()){
                    employeeList.add(j, employeeList.get(j));
                    employeeList.set(j, employeeList.get(j + 1));
                    employeeList.set(j - 1, employeeList.get(employeeList.size() -1));
                    employeeList.remove(employeeList.size() - 1);
                }
            }
            System.out.println(employeeList.get(i).getFirstName() + " " + employeeList.get(i).getSalary());
        }

        //TODO 3 create instance of a Student as a Person ->
        // than ask him introduce()
        // than make them Student
        // than ask him introduce()
        Student student = new Student();

        student.setFirstName("Anna");
        student.setSecondName("Soha");
        student.setAge(21);
        student.setSchoolName("Bootcamp");

        System.out.println("\nIntroduce student:\n=========================");
        System.out.println("Hi! My name is " + student.getFirstName() + " " + student.getSecondName() + ", my age is " + student.getAge() + " and " + student.introduceStudent());



        //TODO 4 Create method for full change of employee information
        // for example some employee change his work
        String emplFirstName;
        String emplSecondName;
        String emplNewCompany;

        emplFirstName = "Sammy";
        emplSecondName = "Zun";
        emplNewCompany = "New company";

        System.out.println("\nChange company:\n======================");
        for(int i = 0; i < employeeList.size(); i++){
            if(employeeList.get(i).getFirstName() == emplFirstName && employeeList.get(i).getSecondName() == emplSecondName){
                employeeList.get(i).setCompanyName(emplNewCompany);
            }
        }
        for (Employee i : employeeList) {
            System.out.println(i.getFirstName() + " = " + i.getCompanyName());
        }



    }

}
