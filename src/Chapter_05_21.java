import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by scott_000 on 9/19/2016.
 */
public class Chapter_05_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        displayHeader();
        monthlyPayment(loanAmount, numberOfYears);
    }

    public static void monthlyPayment(double loanAmount, int numberOfYears){
        double monthPay;
        double monthlyInterestRate;
        int counter;
        double interestRate = 5;
        for (counter = 1; interestRate <= 8; counter++){
            monthlyInterestRate = interestRate / 1200;
            monthPay = loanAmount * (monthlyInterestRate) / (1 - 1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12)) *10;
            totalPayment(monthPay, numberOfYears, interestRate);
            interestRate = interestRate + .125;
        }
    }

    public static double totalPayment(double monthPay, int numberofYears, double interestRate) {
        double totalPay;
        totalPay = monthPay * numberofYears * 12;
        displayResults(monthPay, totalPay, interestRate);
        return totalPay;
    }

    public static void displayResults(double monthPay, double totalPay, double interestRate) {
       //Print table that includes InterestRate, Monthly Payment, and Total Payment.
        DecimalFormat df = new DecimalFormat("$##,##0.00");
        DecimalFormat p = new DecimalFormat("##0.000");
        System.out.printf("\n" + p.format(interestRate) + "               " +  df.format(monthPay) + "               " + df.format(totalPay));

    }

    public static void displayHeader() {
        System.out.printf("Interest Rate       " +  "Monthly Payment       " + "Total Payment          ");
    }
}

