package dataTypes;

import java.util.*;

public class ArrayClass{
  public static void main(String args[]){
	  
	  int Myarray[]= {1,2,3,12,4,3,12,4,5,6,2,3,5,6,3,4,5,6,2,3};
	  PrintArray(Myarray);
	  PrintNumberofElementsInArray(Myarray);
	  RemoveDuplicateElements(Myarray);
	  Myarray=LeftRotateElementOfAnArray(Myarray,2);
	  PrintArray(Myarray);
	  Myarray=RightRotateElementOfAnArray(Myarray,6);
	  PrintArray(Myarray);
	  PrintSmallAndLargeNumber(Myarray);
  
  }
  
  public static void PrintArray(int[] array)
  {
	  System.out.println("PrintArray function is called");
	  for(int i:array)
	  {
		  System.out.print(i+" ");
	  }
	  System.out.println();
  }
  
  public static void PrintNumberofElementsInArray(int array[])
  {
	  System.out.println("PrintNumberofElementsInArray function is called");
	  
	  System.out.println("Size of an array : "+array.length);
  }
  
  public static void RemoveDuplicateElements(int array[])
  {
	  System.out.println("RemoveDuplicateElements function is called");
	  Set st = new HashSet<>();
	  
	  for(int i=0;i<array.length;i++)
	  {
		  st.add(array[i]);
	  }
	  
	  st.forEach(elem -> System.out.print(elem + " "));
	  System.out.println();
	  return;
  }
  
  public static int[] LeftRotateElementOfAnArray(int array[],int count)
  {
	  int firstelement;
	  for(int i=1;i<=count;i++)
	  {
		  firstelement = array[0];
		  for(int j=0;j<(array.length-1);j++)
		  {
			  array[j]=array[j+1];
		  }
		  array[array.length-1]=firstelement;
	  }
	  
	  return array;
  }
  
  public static int[] RightRotateElementOfAnArray(int array[],int count)
  {
	  int lastelement;
	  for(int i=1;i<=count;i++)
	  {
		  lastelement = array[array.length-1];
		  for(int j=array.length-1;j>0;j--)
		  {
			  array[j]=array[j-1];
		  }
		  array[0]=lastelement;
	  }
	  
	  return array;
  }
  
  public static void PrintSmallAndLargeNumber(int[] array)
  {
	  int large,small;
	  large=array[0];
	  small=array[0];
	  for(int i=1;i<array.length-1;i++)
	  {
		  if(array[i]>large)
			  large=array[i];
		  if(array[i]<small)
			  small=array[i];
					  
	  }
	  System.out.println("Smallest element : "+small);
	  System.out.println("Largest Element :"+large);
  }
}
