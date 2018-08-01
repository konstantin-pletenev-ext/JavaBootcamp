package sef.module17.activity;

public class Programme {

    public static void main(String args[]) {

        Person_T person1 = new Person_T();
        Student_T student1 = new Student_T();
        Employe_T empl1 = new Employe_T();

        student1.setGrade(2);
        student1.setSchool("SchoolName");
        student1.setName("Jhon");
        student1.setAge(22);

        System.out.println(student1.announce());
        System.out.println();

    }
}
