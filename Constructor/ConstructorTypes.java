package dataTypes;

/*
 If user does not provide any of the constructor, compiler provides a constructor with empty body
 which is called default constructor
 
 There are three types of constructors
 1. Default constructor
 		Compiler generates a empty constructor with no input arguments
 		If user implements any of the constructor, then compiler does not generates a default constructor
 2. no-arg constructor
 		User provided constructor without any input arguments
 3. Parameterized constructor
 		A Constructor which takes input arguments.
*/

public class ConstructorTypes {
	
	int i=21;
	
	public static void main(String[] args)
	{
		System.out.println("main Function is called");
		ConstructorTypes obj;//Declaration
		obj = new ConstructorTypes(); // Instantiation, default constructor is called
		obj.Display();
	}
	
	ConstructorTypes(int j)
	{
		i=j;
		System.out.println("Parameterised constructor is called :"+i);
	}
	
	ConstructorTypes()
	{
		System.out.println("No-args constructor is called :"+i);
		i=11;
	}
	
	
	public void Display()
	{
		System.out.println("Display Function is called :"+i);
	}
	
}
