package sef.module6.activity;



public class InheritanceActivity {

	public static void main(String[] args) {
		
		// Create Person object and set name of Person as Sarah Johnson
		// and age as 21
		Person_I p = new Person_I();
		Person_I pWithParams = new Person_I("name", 12);
		pWithParams.getName();
		p.setName("Sarah Johnson");
		p.setAge(Integer.parseInt("21"));
		
		System.out.println("-----------------------------");
		//Create Employee object and 
		// set salary as 70000, title as Developer, age as 32 and name as Shawn Cun
		Employee_I e = new Employee_I();
		e.setSalary(70000);
		e.setTitle("Developer");
		e.setAge(32);
		e.setName("Shawn Chui");
		
		
		// Print Info using Employee object
		System.out.println("-----------------------------");
		System.out.println("Employee's Name is   : " + e.getName());
		System.out.println("Employee's Age is    : " + e.getAge());
		System.out.println("Employee's Title is  : " + e.getTitle());
		System.out.println("Employee's Salary is : " + e.getSalary());
		
		
		// Print Info using Person object
		System.out.println("-----------------------------");
		System.out.println("Person's Name is    : " + p.getName());
		System.out.println("Person's Age is     : " + p.getAge());
		
			
		
	}

}
