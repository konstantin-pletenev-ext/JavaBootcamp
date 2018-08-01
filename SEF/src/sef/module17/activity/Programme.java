package sef.module17.activity;

public class Programme {

    public static void main(String[] args) {

        Person_T person1 = new Person_T();
        Student_T student1 = new Student_T();
        Employee_T employee1 = new Employee_T();

        student1.setGrade(2);
        student1.setSchool("SchoolName");
        student1.setName("Jet Set");
        student1.setAge(20);

        System.out.println(student1.announce());

        employee1.setSalary(20000);
        employee1.setTitle("developer");
        employee1.setName("Ron Don");
        employee1.setAge(30);

        System.out.println(employee1.announce());
        System.ou

    }
}