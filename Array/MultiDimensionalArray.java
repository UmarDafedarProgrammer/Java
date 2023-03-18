package dataTypes;

public class MultiDimenstionalArray{
  public static void main(String args[]){
   String Names[][] = {{"Umar","Uzma","Ali"},{"Anam","Hurain","Jameela"}};
   
   int Rows=Names.length;
   int Columns=Names[0].length;
   
   System.out.println("Number of Rows :"+Rows);
   System.out.println("Number of Columns :"+Columns);
   
   for(int i=0;i<Rows;i++)
   {
	   for(int j=0;j<Columns;j++)
	   {
		   System.out.print(Names[i][j]+" ");
	   }
	   System.out.println();
   }
   System.out.println();
   
   int Grades[][];
   Grades= new int[3][3];
   
   int init=87;
   
   for(int i=0;i<Grades.length;i++)
   {
	   for(int j=0;j<Grades[0].length;j++)
	   {
		   Grades[i][j]=init+i+j;
	   }
   }
   
   for(int i=0;i<Grades.length;i++)
   {
	   for(int j=0;j<Grades[0].length;j++)
	   {
		   System.out.print(Grades[i][j]+" ");
	   }
	   System.out.println();
   }
   System.out.println();
  }
}
