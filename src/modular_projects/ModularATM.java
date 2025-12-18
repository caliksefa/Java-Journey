package modular_projects;
import java.util.Scanner ;
public class ModularATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance, amount;


        System.out.print("Please enter your current balance: ");
        balance = input.nextDouble();

        int choice;
        do {
            System.out.print(
                    "1: Actual Balance\n" +
                            "2: Deposit Money\n" +
                            "3: Withdraw Money\n" +
                            "4: Exit\n" +
                            "Please enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    System.out.print("Please enter your deposit: ");
                    amount = input.nextDouble();
                    balance = depositMoney(balance, amount);
                    break;
                case 3:
                    System.out.print("Please enter your withdraw: ");
                    amount = input.nextDouble();
                    balance = withdrawMoney(balance, amount);
                    break;
                case 4:
                    System.out.print("Exiting to program... See you next time :(");
                    break;
                default:
                    System.out.print("Invalid enterence... Try again!");
                    break;
            }

        } while (choice != 4);


    }

    public static void showBalance(double currentBalance) {
        System.out.printf("Current Balance is %.2f", currentBalance);
        System.out.println();
    }

    public static double depositMoney(double currentBalance, double amount) {
        System.out.println("Successfully deposit!");
        return currentBalance + amount;
    }

    public static double withdrawMoney(double currentBalance, double amount) {
        if (amount > currentBalance) {
            System.out.println("Money is not enough... ERROR");
            return currentBalance ;
        }
        else {
            System.out.println("Successfully withdraw");
            return currentBalance - amount;
        }

    }
}


