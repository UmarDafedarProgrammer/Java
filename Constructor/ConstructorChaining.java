package dataTypes;

public class ConstructorChaining {

	int i;
	String str;
	
	ConstructorChaining()
	{
		this(10);
		System.out.println("no-arg constructor is called");
	}
	
	ConstructorChaining(int j)
	{
		this("Default");
		this.i=j;
		System.out.println("Parameterised constructor with inp int is called");
	}
	
	ConstructorChaining(String str)
	{
		System.out.println("Parameterised constructor with inp string is called");
		this.str=str;
	}
	
	public void Display()
	{
		System.out.println("Display Function is called :"+i+" and "+str);
	}
	
	public static void main(String[] args) {
		System.out.println("Main function is called");
		ConstructorChaining obj=new ConstructorChaining();
		obj.Display();
	}

}


/*
  OUTPUT:
Main function is called
Parameterised constructor with inp string is called
Parameterised constructor with inp int is called
no-arg constructor is called
Display Function is called :10 and Default
*/
