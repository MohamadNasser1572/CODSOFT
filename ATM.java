/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atminterface;

/**
 *
 * @author pc
 */

import java.util.Scanner;
public class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void startATM() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (isValidWithdrawal(withdrawAmount)) {
                        userAccount.withdraw(withdrawAmount);
                        displayMessage("Withdrawal successful. Remaining balance: " + userAccount.checkBalance());
                    } else {
                        displayMessage("Withdrawal failed. Insufficient funds.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    displayMessage("Deposit successful. Updated balance: " + userAccount.checkBalance());
                    break;

                case 3:
                    displayMessage("Current Balance: " + userAccount.checkBalance());
                    break;

                case 4:
                    displayMessage("Exiting ATM. Thank you!");
                    System.exit(0);
                    break;

                default:
                    displayMessage("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private boolean isValidWithdrawal(double amount) {
        return amount > 0 && amount <= userAccount.checkBalance();
    }

    private void displayMessage(String message) {
        System.out.println(message);
    }
}
