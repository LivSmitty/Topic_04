


    import java.util.Date;
    import java.util.Scanner;

    public class Account {

        //declare variables
        public int id = 0;
        public double balance = 0;
        public double annualInterestRate = 0;
        public double deposit;
        public double withdraw;
        private java.util.Date dateCreated;


        Account() {

        }

        Account(int x, double y) {
            id = x;
            balance = y;
        }

        double getMonthlyInterestRate(double y) {
            annualInterestRate = y;
            return (annualInterestRate/100)/12;
        }
        double getMonthlyInterest(double i) {
            return balance * i;
        }

        double getDeposit(double d) {
            balance = balance + d;
            return balance;
        }
        public static void getWithdraw(double w, double[] balanceArray, int currentID ) {
            balanceArray[currentID] = balanceArray[currentID] - w;

        }

        public static void getDeposit(double d, double[] balanceArray, int currentID){
            balanceArray[currentID] = balanceArray[currentID] + d;
        }

        public java.util.Date getDateCreated() {
            dateCreated = new java.util.Date();
            return dateCreated;
        }

        public static void mainMenu(double balanceArray[]) {
            //get ID number from User
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an ID (0-9): ");
            int currentID = input.nextInt();
            if (currentID >= 9) {
                System.out.println("Incorrect ID. Enter an ID (0-9): ");
                currentID = input.nextInt();
            }


            //get menu choice
            System.out.print("Main Menu" + "\n1: check balance: " + "\n2: withdraw" + "\n3: deposit" + "\n4: exit"
                    + "\nEnter a choice: ");
            int choice = input.nextInt();

            if (choice == 1) {
                Account.getBalance(choice, balanceArray);
                mainMenu(balanceArray);
            }

            if (choice == 2) {
                System.out.print("Enter an amount to withdraw: ");
                double withdraw = input.nextDouble();
                Account.getWithdraw(withdraw, balanceArray, currentID);
                mainMenu(balanceArray);
            }

            if (choice == 3) {
                System.out.print("Enter an amount to deposit: ");
                double deposit = input.nextDouble();
                Account.getDeposit(deposit, balanceArray, currentID);
                mainMenu(balanceArray);
            }

            if (choice == 4) {
                mainMenu(balanceArray);
            }

        }



        public static void getBalance(int currentID, double[] balanceArray) {

            System.out.println(balanceArray[currentID]);

        }

    }



