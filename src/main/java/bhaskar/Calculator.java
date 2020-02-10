package bhaskar;
import bhaskar.*;
public class Calculator {

	public static void main(String[] args) {
		//Taking inputs
		inputsoutputs io=new inputsoutputs();
		float[] arr=io.takeinputs();
		
		//Calculating
		mathoperations calc=new mathoperations();
		String res=calc.compute(arr);
		
		//Printing Output
		io.printoutput(res);
	}

}
