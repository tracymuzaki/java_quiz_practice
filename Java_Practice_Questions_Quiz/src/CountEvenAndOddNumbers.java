//5.	Write a java program to count the number of even and odd digits in a number.
import java.util.Scanner;
public class CountEvenAndOddNumbers {
    public static void main(String[] args) {
        long num,evenCount = 0, oddCount = 0;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter number here: ");
        num = obj.nextLong();

        //counting the number of even numbers
        while (num > 0)
        {
            if (num%2==0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println("Number of even numbers is "+ evenCount);
        System.out.println("Number of odd numbers is "+ oddCount);
    }
}
