package dataTypes;
import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		
		int a1,a2,sum;
		
		Scanner scan=new Scanner(System.in);
		
		a1=scan.nextInt();
		a2=scan.nextInt();
		sum=a1*a2;
		scan.close();
		System.out.println("Product of "+a1+" and "+a2 +" is "+sum);
	}

}
