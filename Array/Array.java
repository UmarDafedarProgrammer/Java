/*
	Array:
		- It is non-primitive data type
		- It contains the list of elements of same data type (homogeneous data)
		- Array can be one dimensional/or multidimensional
		- The size of array is fixed
		- It is quicker for the search and accessing the elements
		- Constant time access using index
		- The length property of array returns the number of elements present in the array.
		
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

public class Array {

	public static void main(String[] args) {
		
		int MyArray[]; //declaration

//		int j; local variable has to be initialized before use
		
		MyArray=new int[10];
		
		for (int i:MyArray)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
