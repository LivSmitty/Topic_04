import java.util.Scanner;

/**
 * Created by scott_000 on 9/25/2016.
 */
public class TestAccount {
    public static void main(String[] args) {
        //create ID Array and Balance Array
        int idArray[] = new int[10];
        double balanceArray[] = new double[10];

        //fill arrays for ID and Balance
        for (int i = 0; i <= 9; i++) {
            idArray[i] = i;
            balanceArray[i] = 100.00;

        }

        Account.mainMenu(balanceArray);

        }



    }





