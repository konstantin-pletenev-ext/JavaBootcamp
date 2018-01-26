package sef.module9.sample;
// Complete Code
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//Employee Class with getters and setters
class Employee{
    
    private int age;    
    private String name;
    
    public void setAge(int age){
        this.age=age;    
    }
    
    public int getAge(){
        return this.age;    
    }
    
    public void setName(String name){
        this.name=name;    
    }
    
    public String getName(){    
        return this.name;    
    }
    public static void main(String[] args) {
    	
    	SimpleDateFormat format=new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date d1=format.parse("1977/08/23");
			Date d2=format.parse("1976/08/21");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
}