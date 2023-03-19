package dataTypes;
/*
 	Constructor:
 		- Constructor is a special member function
 		- Initializes the newly created object
 		- Constructor has the same name as Class name
 		- No Return type
 		- Can not be called explicitly
 		- If user does not provide any of the constructor, compiler provides the default constructor
 		- Constructor can not be static
 */

public class Constructor {
	Constructor()
	{
		System.out.println("no-arg constructor");
	}
	
	static int i=0;
	
	public static void main(String[] args)
	{
		System.out.println("Main is called : "+i++);
		Constructor cobj=new Constructor(); // no-arg constructor is called
		
		if(i==10)
			return;
		String[] inp= {"hello","umar"};
		cobj.main(inp);
		
	}
	
}
