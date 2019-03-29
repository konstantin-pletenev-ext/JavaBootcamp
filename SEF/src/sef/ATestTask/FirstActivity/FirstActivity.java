package sef.ATestTask.FirstActivity;

import java.util.*;

public class FirstActivity {

	public static void main(String[] args) {

		//TODO 1 Create collection of employee (more than 5) list or map
		//		System.out.println() result/done

		List employeesList = new ArrayList();
		employeesList.add(new Employee("Ivan ", "Isajev", 30, 1, "Director", "Ventspils nafta", 3000));
		employeesList.add(new Employee("Svetlana", "Komsjukova", 31, 2, "Vice president", "Sia B", 1500));
		employeesList.add(new Employee("Aleksandrs", "Komsjukovs", 32, 3, "Company owner", "Sia B", 2300));
		employeesList.add(new Employee("Emily", "Clark", 35, 4, "Secretary", "Sia B", 1.000));
		employeesList.add(new Employee("Peter", "Parker", 33, 5, "Super Hero", "Sia B", 5000));

		print(employeesList);
		getSalary(employeesList);

		Collections.sort(employeesList, new EmployeeSalaryComparator());

		print(employeesList);
		getSalary(employeesList);
//TODO 3 create instance of a Student as a Person ->
		Person student1 = new Student("Emil","Cool",22,"Best University",100);



		// than ask him introduce()
		System.out.println(student1.announce());

		// than make them Student
		Student student1t2 = (Student) student1;

		// than  ask him introduce()
		System.out.println(student1t2.announce());
	}

	//TODO 2 sort and this employees by salary (from min to max)
	// TIP - google bubble sort
	//		System.out.println() result
	public static void getSalary(List<Employee> ls) {
		for (Employee e : ls) {
			System.out.println(e.getSalary());
		}

	}

	void  bubbleSort(List<Employee> els)
	{

		int n = els.size();

		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (els.get(j).getSalary() > els.get(j).getSalary()+1)
				{
					// swap arr[j+1] and arr[i]
					int temp = els.get(j);
					els(j).getSalary()= els.get(j).getSalary()+1;
					els(j).getSalary()+1] = temp;
				}
	}

	static class EmployeeSalaryComparator implements Comparator<Employee>{

		public int compare(Employee a, Employee b){
			return (int) (a.getSalary()-b.getSalary());

		}
	}



		//TODO 4 Create method for full change of employee information
		// for example some employee change his work
	static Employee employeeChangeInfo(Employee emp) {
		Employee empNew = new Employee();
		empNew.setJobTitle(emp.getJobTitle());
		empNew.setJobTitle("");
	}


	static void print(List employeeList)
	{
		Iterator it=employeeList.iterator();
		while (it.hasNext())
			System.out.println(((Employee)it.next()).announce());

	}
}
