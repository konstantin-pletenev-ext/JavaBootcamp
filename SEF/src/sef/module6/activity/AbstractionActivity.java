package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		Shape p1 = new Square(5);
		Shape p2 = new Rectangle(5,6);
		
		p1.setColor("Red");
			
		p2.setColor("Green");
				
		System.out.println("*** Print the Information for Square ***");
		System.out.println("Color of Square         :"+ p1.getColor());
		System.out.println("Area of Square          :"+ p1.calculateArea());
		System.out.println("Perimeter of Square     :"+ p1.calculatePerimeter());
		
		System.out.println("*** Print the Information for Rectangle ***");
		System.out.println("Color of Square         :"+ p2.getColor());
		System.out.println("Area of Square          :"+ p2.calculateArea());
		System.out.println("Perimeter of Square     :"+ p2.calculatePerimeter());
		
	}
	
	
	
}
