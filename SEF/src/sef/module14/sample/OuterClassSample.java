package sef.module14.sample;
//Complete Code
public class OuterClassSample {

	int outerClassVariable =10;
	
	
	private class InnerClass
	{
		int innerClassVariable =20;
		public void display()
		{
			System.out.println(outerClassVariable);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Let me check if I can use Inner Class");
		InnerClass obj=new OuterClassSample().new InnerClass();
		System.out.println(obj.innerClassVariable);
		obj.display();
	}
}
