package beginner;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Balance : ");
        int bankBalance = sc.nextInt();

        if (bankBalance < 0) {
            System.out.println("Invalid Initial balance");
            return;
        }
        System.out.println("Enter - \n 1 for Credit \n 2 for Debit \n");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                System.out.println("Enter the amount to be credited: ");
                int credit = sc.nextInt();
                if (credit < 0) {
                    System.out.println("Invalid amount");
                    return;
                }
                bankBalance += credit;
                break;
            case 2:
                System.out.println("Enter the amount to be debited: ");
                int debit = sc.nextInt();
                if (debit < 0) {
                    System.out.println("Invalid amount");
                    return;
                }
                if (debit > bankBalance) {
                    System.out.println("Transaction Failed due to insufficient bank balance.");
                    return;
                }
                bankBalance -= debit;
                break;
            default:
                System.out.println("Invalid operation code.");
                return;
        }

        System.out.println("current bank balance is : " + bankBalance);
    }
}
