package sef.module9.sample;
 // Complete Code
import java.util.*;
 
class AgeComparator implements Comparator{
    
    public int compare(Object emp1, Object emp2){
    
        int emp1Age = ((Employee)emp1).getAge();        
        int emp2Age = ((Employee)emp2).getAge();
       
        if(emp1Age > emp2Age)
            return 1;
        else if(emp1Age < emp2Age)
            return -1;
        else
            return 0;    
    }
    
}
