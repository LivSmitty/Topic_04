import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by scott_000 on 9/19/2016.
 */
public class Chapter07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] numbers = new double[10];
        System.out.println("Enter 10 numbers: ");

        //Fill Array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        //Sort Array
        double min = numbers[0];
        int indexOfMin = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
                indexOfMin = i;
            }
        }


        //Print smallest element of array
        System.out.print("The minimum number is: " + numbers[indexOfMin]);



    }
}
