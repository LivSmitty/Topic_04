import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by scott_000 on 9/19/2016.
 */
public class Chapter_05_039 {
    public static void main(String[] args) {
        //Get base salary and sales amount from user.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base salary: ");
        double baseSalary = input.nextDouble();
        System.out.println("Enter amount of sales: ");
        double salesAmt = input.nextDouble();
        double commission = 0;

        //Calcuate commission.
        if (salesAmt <= 5000) {
            commission = 5000 * .08;
        }
            else if (salesAmt <= 10000) {
                commission = (5000 * .08) + ((salesAmt - 5000) * .10);
            }
            else if (salesAmt >= 10000.01) {
                commission = (5000 * .08) + ((10000 - 5000) * .10) + ((salesAmt - 10000) * .12);
                }

        //Format total salary
        DecimalFormat df = new DecimalFormat("$##,##0.00");

        //Print total salary to console
        System.out.println("Total Salary: " + df.format(commission + baseSalary));

        }

}
