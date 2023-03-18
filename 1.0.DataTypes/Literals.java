/* Literals
 
A literal is a fixed value that we assign to a variable

1. Integer Literals
 	byte b = 100;
	short s = 200;
	int num = 13313131;
	long l = 928389283L;
	
2. Floating point literals
 	double num1 = 22.4;
	float num2 = 22.4f;

3. Char literal
 	char ch = 'Z';

4. String literal
  	String str = "BeginnersBook";
 */

package dataTypes;

public class DataTypes {
	
	public static void main(String[] args) {
		byte by = 100;
		short s = 200;
		int num = 13313131;
		long l = 928389283L;
		double d = 22.4;
		float f = 22.4f;
		char ch = 'Z';
		String str = "BeginnersBook";
		boolean b=true;
		
		
		System.out.println("boolean b holds the value "+b);
		System.out.println("byte by holds the value "+by);
		System.out.println("Character ch holds the value "+ch);
		System.out.println("short str holds the value "+str);
		System.out.println("Integer num holds the value "+num);
		System.out.println("Long l holds the value "+l);
		System.out.println("float f holds the value "+f);
		System.out.println("double d holds the value "+d);
	}

}


/*
OUTPUT:

boolean b holds the value true
byte by holds the value 100
Character ch holds the value Z
short str holds the value BeginnersBook
Integer num holds the value 13313131
Long l holds the value 928389283
float f holds the value 22.4
double d holds the value 22.4
*/
