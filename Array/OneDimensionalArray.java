package dataTypes;

public class OneDimenstionalArray{
  public static void main(String args[]){
    //array declaration
    String names[] = new String[5];

    //array initialization
    names[0]="Umar";
    names[1]="Uzma";
    names[2]="Anam";
    names[3]="Hurain";
    names[4]="Dafedar";

    //print array elements
    for(int i=0;i<names.length;i++)
      System.out.println("names["+i+"]: "+names[i]);
  }
}
