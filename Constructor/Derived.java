package dataTypes;

public class Derived extends Base {
	
	private int di;
	private String dstr;
	
	Derived()
	{
		System.out.println("Derived class: no-args Constructor is called");
	}
	
	Derived(int i,String s)
	{
		super(i,s);
		System.out.println("Derived Class Parameterised constructor is called");
		di=i;
		dstr=s;
		
	}
	
	public void Display()
	{
		System.out.println("Derived: Display Function is called");
		System.out.println(di+" "+dstr);
	}
	
	public static void main(String[] str)
	{
		System.out.println("Derived:Main Function is called");
		Derived obj=new Derived(111,"Great");
		obj.Display();
	}
	
}
