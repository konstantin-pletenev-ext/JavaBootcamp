package sef.module6.activity;



public class InheritanceActivity {

	public static void main(String[] args) {
		
		// Create Person object p. Write code to and set name of Person as Sarah Johnson
		// and age as 21
		
		Person_I p1 = new Person_I();
		p1.setName("Sarah Johnson");
		p1.setAge(21);

		
		System.out.println("-----------------------------");

		//Create Employee object e and
		// set salary as 70000, title as Developer, age as 32 and name as Shawn Cun

		Person_I p2 = new Person_I();

		Employee_I e = new Employee_I();
		e.setName("Shawn Cun");
		e.setAge(32);
		e.setTitle("Developer");
		e.setSalary(70000);

		
		// Print Info using Employee object
		System.out.println("-----------------------------");
		System.out.println("Employee's Name is   : " + p2.getName());
		System.out.println("Employee's Age is    : " + p2.getAge());
		System.out.println("Employee's Title is  : " + e.getTitle());
		System.out.println("Employee's Salary is : " + e.getSalary());
		
		
		// Print Info using Person object
		System.out.println("-----------------------------");
		System.out.println("Person's Name is    : " + p1.getName());
		System.out.println("Person's Age is     : " + p1.getAge());
		
			
		
	}

}
