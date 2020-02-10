package bhaskar;
import java.util.Scanner;
public class inputsoutputs {
	Scanner sc=new Scanner(System.in);
	
	public float[] takeinputs() {
		System.out.println("Welcome to Calculator app!");
		float[] arr=new float[3];
		System.out.println("Enter first operand");
		arr[0]=sc.nextFloat();
		System.out.println("Enter second operand");
		arr[1]=sc.nextFloat();
		System.out.println("Choose any operation");
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
		arr[2]=sc.nextFloat();
		
		return arr;
	}
	
	public void printoutput(String s) {
		System.out.println(s);
	}
	
}
