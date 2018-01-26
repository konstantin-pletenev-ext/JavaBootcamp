package sef.module14.sample;
//Complete Code
public class UpperBound <E extends Number>{
	
	private E field;
	
	public void setField(E arg){
		field = arg;
	}
	
	public E getField(){
		return field;
	}
	
	public static void main(String arg[]){
		//E in UpperBound class gets replaced with Float
		UpperBound<Float> g1 = new UpperBound<Float>();
		//E in UpperBound class gets replaced with Integer
		UpperBound<Integer> g2 = new UpperBound<Integer>();
		
		//Not legal: String is not a subclass of Number
		//UpperBound<String> g2 = new UpperBound<String>();
		//Un comment the above statement and the code would not compile
		

		g1.setField(new Float(1.1f));
		g2.setField(new Integer(42));
		System.out.println(g1.getField());
		System.out.println(g2.getField());		
		
	}
	
}
