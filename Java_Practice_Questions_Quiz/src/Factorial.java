//3.	Write a Java program to find the factorial of a number.
import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int num,i=1;
        long factorial=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=obj.nextInt();

        //finding factorial
        //factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of "+num+" is "+ factorial);
    }
}
