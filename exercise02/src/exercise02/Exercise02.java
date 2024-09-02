package ;
import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        //prompt the user input
		System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        
        //While loop to multiply the digits
        int sum = 1;
        //loop until it no longer able to remove the extracted digit
        while (number>0) {
        	//extract the last digit
        	int digit = number % 10; 
        	// multiplication of the digit
        	sum *= digit;
        	//remove the extracted digit 
        	number /= 10;
        }
        
        //display result
        System.out.println("The multiplication of all digits is " + sum);
        
        input.close();	 
    }
}
