//2.	Write a Java program to find the largest of 3 numbers.
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        int first,second,third;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number: ");
        first = obj.nextInt();
        System.out.println("Enter second number: ");
        second = obj.nextInt();
        System.out.println("Enter third number: ");
        third = obj.nextInt();

        //checking for largest number
        if (first>=second && first>=third){
            System.out.println("The largest number is: "+ first);
        } else if (second>=first && second>=third) {
            System.out.println("The largest number is: "+ second);
        } else{
            System.out.println("The largest number is: "+ third);
        }
    }
}
