/* Data Types
	Data types define the type of a data variable can store
	It also indicates a compiler the amount of memory required to store the data

	There are two categories of data types
	1. Primitive Data types - int,byte,char,long,short,boolean,float,double
	2. Non-primitive data types - strings,array
*/
package dataTypes;

public class DataTypes {

	public static void main(String[] args) {
		//Declaring the variables of Primitive Data Types
		int i=101; // 4 bytes
		byte by=89; // 1 byte
		boolean b=true; // 1 bit
		char c='U'; // 2 bytes
		short s=345; // 2 bytes
		long ll=456l; // Long - L/l 8 Bytes
		float f=3.45f; // Float 4 bytes
		double d=3.45d; // 8 bytes
		
		System.out.println("boolean b holds the value "+b);
		System.out.println("byte by holds the value "+by);
		System.out.println("Character c holds the value "+c);
		System.out.println("short s holds the value "+s);
		System.out.println("Integer i holds the value "+i);
		System.out.println("Long ll holds the value "+ll);
		System.out.println("float f holds the value "+f);
		System.out.println("double d holds the value "+d);
		
	}

}
