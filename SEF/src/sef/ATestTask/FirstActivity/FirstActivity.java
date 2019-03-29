package sef.ATestTask.FirstActivity;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result

		final String FirstName;
		final String SecondName;
		final double Salary;

		Employee a = new Employee();
		a.setFirstName("Janis");
		a.setSecondName("Berzins");
		a.setsalary(1783);
		a.setjobTitle("gardener");
		System.out.println(a.getFirstName() + " " + a.getSecondName() + " salary is " + a.getsalary() + " EUR working as a " + a.getjobTitle());
		Employee b = new Employee();
		b.setFirstName("Kaspars");
		b.setSecondName("Daugavins");
		b.setsalary(2943);
		b.setjobTitle("game developer");
		System.out.println(b.getFirstName() + " " + b.getSecondName() + " salary is " + b.getsalary() + " EUR working as a " + b.getjobTitle());
		Employee c = new Employee();
		c.setFirstName("Uldis");
		c.setSecondName("Ozols");
		c.setsalary(943);
		c.setjobTitle("fireman");
		System.out.println(c.getFirstName() + " " + c.getSecondName() + " salary is " + c.getsalary() + " EUR working as a " + c.getjobTitle());
		Employee d = new Employee();
		d.setFirstName("Renate");
		d.setSecondName("Lejniece");
		d.setsalary(1100);
		d.setjobTitle("musician");
		System.out.println(d.getFirstName() + " " + d.getSecondName() + " salary is " + d.getsalary() + " EUR working as a " + d.getjobTitle());
		Employee e = new Employee();
		e.setFirstName("Ance");
		e.setSecondName("Krauze");
		e.setsalary(3984);
		e.setjobTitle("hunter");
		System.out.println(e.getFirstName() + " " + e.getSecondName() + " salary is " + e.getsalary() + " EUR working as a " + e.getjobTitle());
		Employee f = new Employee();
		f.setFirstName("Roberts");
		f.setSecondName("Kruze");
		f.setsalary(1999);
		f.setjobTitle("hockey player");
		System.out.println(f.getFirstName() + " " + f.getSecondName() + " salary is " + f.getsalary() + " EUR working as a " + f.getjobTitle());
		System.out.println("----------------------------------------------------------------------");
		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result

		int sal[] = {1783, 2943, 943, 1100, 3984, 1999};
		for (int i = 0; i < sal.length; i++){
			for (int j = 0; j < sal.length; j++){
				if (sal[j]>sal[i])
					sal[i]=sal[j];}
		System.out.println(sal[i]);}
		System.out.println("----------------------------------------------------------------------");
		//TODO 3 create instance of a Student as a Person ->
				// than ask him introduce()
				// than make them Student
				// than ask him introduce(){

		Person x = new Student();
		x.getFirstName();
		x.getSecondName();
		x.getAge();
		System.out.println("Hello my name is " + x.getFirstName()+ " " + x.getSecondName() + " and I am " + x.getAge() + " years old");
		x = new Person();
		x.getFirstName();
		x.getSecondName();
		x.getAge();
		System.out.println("Hello my name is "  + x.getFirstName()+ " " +x.getSecondName() + " and I am " + x.getAge() + " years old");

		System.out.println("---------------------------------------------------------------------");

		//TODO 4 Create method for full change of employee information
				// for example some employee change his work

		System.out.println("Hello my name is " + a.getFirstName() + " " + a.getSecondName() + " my salary is " + a.getsalary() + " EUR working as a " + a.getjobTitle());
		a.setSecondName("Lasis");
		a.setsalary(1337);
		a.setjobTitle("bartender");
		System.out.println("Hello, today I got married and my second name changed to " + a.getSecondName() + " and I found a new job as a " + a.getjobTitle() + " for "+ a.getsalary() + " EUR");
		System.out.println("-------------------------------------------------------------------------");
	}
}