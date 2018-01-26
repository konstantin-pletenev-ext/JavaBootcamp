package sef.module9.sample;
// Complete Code
import java.util.Comparator;

class NameComparator implements Comparator{
	 
    public int compare(Object emp1, Object emp2){    
 
        //parameter are of type Object, so we have to downcast it to Employee objects
       
        String emp1Name = ((Employee)emp1).getName();        
        String emp2Name = ((Employee)emp2).getName();
       
        //uses compareTo method of String class to compare names of the employee
        return emp1Name.compareTo(emp2Name);
    
    }
 
}
