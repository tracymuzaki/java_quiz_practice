//4.	Write a java program to count the number of digits in a number.
import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        int number,count=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number= obj.nextInt();

        //counting number of digits
        while (number != 0){
            number /= 10;
            count++;
        }
        System.out.println("The number of digits is " + count);
    }
}
