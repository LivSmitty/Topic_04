import java.util.Scanner;


/**
 * Created by scott_000 on 9/22/2016.
 */
public class Chapter08_09 {
    public static void main(String[] args) {

        //Create empty 3X3 empty array
        char[][] array = new char[3][3];

        //initialize array
        initializeArray(array);

        //prompt player X
        xChoice(array);

    }

    public static void initializeArray(char array[][]){
        for (int row = 0; row < array.length; row++){
            for (int column = 0; column < array[row].length; column++){
                array[row][column] = '*';
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }


    public static void xChoice(char array[][]){

        char currentPlayer = 'X';
        boolean flag = false;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a row (0, 1, or 2) for player X: ");
        int row = input.nextInt();
        System.out.print("Enter a column (0, 1, or 2) for player X: ");
        int column = input.nextInt();

        //apply user choice
        array[row][column] = 'X';
        displayArray(array);

        //check for winner
        checkForWinner(array, currentPlayer, flag);

        //if winner, display winner. Else, give opponent a turn
        if (flag == false)
            oChoice(array);
        else
            displayWinner(currentPlayer);
    }

    public static void oChoice(char array[][]){

        char currentPlayer = 'O';
        boolean flag = false;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a row (0, 1, or 2) for player O: ");
        int row = input.nextInt();
        System.out.print("Enter a column (0, 1, or 2) for player O: ");
        int column = input.nextInt();

        //apply user choice
        array[row][column] = 'O';
        displayArray(array);

        //check for winner
        checkForWinner(array, currentPlayer, flag);

        //if winner, display winner. Else, give opponent a turn
        if (flag == false)
            xChoice(array);
        else displayWinner(currentPlayer);

    }

    public static void displayArray(char array[][]) {


        //fill user choices in array
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkForWinner(char array[][], char currentPlayer, boolean flag) {

        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;

        //check condition: each row for winner
        for (int i = 0; i <= 2; i++) {
            if ((array[i][0] == array[i][1] && array[i][1] == array[i][2]))
                flag1 = true;
        }

        //check condition: column for winner
        for (int j = 0; j <= 2; j++) {
            if ((array[0][j] == array[1][j] && array[1][j] == array[2][j]))
                flag2 = true;
        }

        //check condition: one diagonal angle
        if ((array[0][0] == array[1][1] && array[1][1] == array[2][2]))
            flag3 = true;

        //check condition: second diagonal angle
        if ((array[0][2] == array[1][1] && array[1][1] == array[2][0]))
            flag4 = true;

       //is a condition true?
        if (flag1 == true || flag2 == true || flag3 == true || flag4 == true)
            flag = true;

        return flag;

    }

    public static void displayWinner(char currentPlayer){
        System.out.print("The winner is: " + currentPlayer);
    }


}
