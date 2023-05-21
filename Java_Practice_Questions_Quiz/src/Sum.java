//6.	Write a java program to find the sum of elements in an array.
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        int num, i = 0, j = 0, sum = 0;

        Scanner obj= new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        num = obj.nextInt();

        int [] array = new int[num];
        System.out.print(" Please enter " + num + " elements  : ");

        while(i < num)
        {
            array[i] = obj.nextInt();
            sum = sum + array[i];
            i++;
        }

        System.out.println("The Sum of elements in the array is: " + sum);
    }
}
