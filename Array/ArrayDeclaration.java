/*

Declaration:
	int number[]; //array declaration
	number[] = new int[10]; //array instantiation
	number[0] = 10; //array Initialization
	number[1] = 20; //array Initialization
 		
 Syntax for array declaration:
 	int[] number; 
	int []number;  
	int number[];
 		
 	int[][] arr; 
	int [][]arr;
	int arr[][];
	int []arr[];
 */
package dataTypes;

public class ArrayDeclaration {

	public static void main(String[] args) {
		
		int Array[] = {1,2,3,4,5,6}; // Initializer list
		System.out.println("Array");
		for(int i:Array )
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		int Array2[];
		int x=2;
		Array2=new int[10];
		//Setting the values
		for(int i=0;i<Array2.length;i++)
		{
			x=x*2;
			Array2[i]=x;
		}
		//Reading the values
		System.out.println("Array2");
		for(int i:Array2)
		{
			System.out.print(i+" ");
		}
		
		
	}
}
