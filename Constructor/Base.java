package dataTypes;

public class Base {
	
	int bi;
	String bstr;
	Base()
	{
		System.out.println("Base Class: no-args constructor is called");
	}
	
	public void Display()
	{
		System.out.println("Base:Display is called");
		System.out.println(bi+" "+bstr);
	}
	
	Base(int i,String s)
	{
		bi=i;
		bstr=s;
		System.out.println("Base:Parameterised constructor is called");
		System.out.println(bi+" "+bstr);
	}
	
	public static void main(String args[])
	{
		System.out.println("Display");
	}
}


