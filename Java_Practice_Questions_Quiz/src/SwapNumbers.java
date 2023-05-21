//1.	Write a Java program to swap 2 numbers.
//used a temporary variable and asked user for input
import java.util.Scanner;
public class SwapNumbers {

    public static void main(String[] args) {
        //declared variables
        int first , second ,temp;
        //created an object of the scanner class
        Scanner obj = new Scanner(System.in);
        //prompted user for input
        System.out.println("Enter first number:");
        //used nextInt to read integers
        first = obj.nextInt();//reads user input
        System.out.println("Enter Second number: ");
        second = obj.nextInt();

        //Swapping numbers
        temp = first;
        first = second;
        second = temp;
        //output Swapped numbers
        System.out.println("Swapped values are: "+ first + " and " + second);
    }
}