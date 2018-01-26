package sef.module14.sample;
//Complete Code
import java.util.ArrayList;
import java.util.List;

public class EmployeeGenerics {
	
	public static void main(String arg[]){
		
		Employee e1 = new Employee("John Doe", 1123);
		Employee e2 = new Employee("Jane Doe", 2321);
		Employee e3 = new Employee("Juan dela Cruz", 1112);
		Employee e4 = new Employee("Juanita dela Cruz", 9321);
		
		List <Employee>employeeList = new ArrayList<Employee>();
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		
		int size = employeeList.size();
		Employee temp;
		for(int i = 0; i < size; i++)
		{
			temp = employeeList.get(i);
			System.out.println(temp.getName() + " " + temp.getId());
		}
	}
}
