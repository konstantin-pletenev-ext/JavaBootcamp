package sef.module14.sample;
//Complete Code
public class GenericSample <E>{

	private E field;
	
	public void setValue(E arg){
		this.field =arg;
	}
	
	public E getValue(){
		return field;
	}
	
	public static void main(String arg[]){
		GenericSample<String> g1 = new GenericSample<String>();
		GenericSample<Integer> g2 = new GenericSample<Integer>();
		
		g1.setValue("Hello!");
		System.out.println(g1.getValue());
		g2.setValue(new Integer(42));
		System.out.println(g2.getValue());
		
	}
}
