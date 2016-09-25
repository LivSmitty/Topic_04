import java.util.Scanner;

/**
 * Created by scott_000 on 9/25/2016.
 */
public class Chapter10_08 {
    int filingStatus;
    public static final double SINGLE_FILER = 0;
    public static final double MARRIED_JOINTLY_OR_QUALIFY_WIDOW = 1;
    public static final double MARRIED_SEPARATELY = 2;
    public static final double HEAD_OF_HOUSEHOLD = 3;

    int[][] brackets;
    double[] rates;

    double taxableIncome;
    double tax;

    public static void tax(){

    }

    public static void tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){

    }
    public int getFilingStatus(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Filing Status " + "\n0: Single Filer" + "\n1: Married, filing jointly/Qualified Widower"
                + "\n2: Married, Filing Seperately " + "\n3: Head of Household");
        filingStatus = input.nextInt();
        return filingStatus;
    }

    public int[][] getBrackets(){
        Scanner input = new Scanner(System.in);

        //fill brackets array with user input
        for (int i = 0;i <= 4; i++){//i is for Tax Rate
            System.out.print("Enter brackets for " + rates[i]);
            int low = input.nextInt();
            int high = input.nextInt();
            brackets[i][i] = brackets[low][high];
        }
        return brackets;
    }

    public double[] getRates(){
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {
            System.out.print("Enter Tax Rate: ");
            rates[i] = input.nextDouble();
        }

        return rates;
    }

    public double getTaxableIncome(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter income: ");
        taxableIncome = input.nextDouble();
        return taxableIncome;
    }

    public double getTax(){

        return tax;
    }

}
