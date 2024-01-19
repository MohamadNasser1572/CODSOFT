/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atminterface;

import java.util.Scanner;
public class ATM{
    private BankAccount userAccount;
    public ATM(BankAccount userAccount){
        this.userAccount=userAccount;
    }
    public  void displayMenu(){
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public void startATM(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Welcome to the ATM System! Enter your code number please: ");
               int num=sc.nextInt();
               if(num>=10000&&num<=99999)
                   break;
               else
                   System.out.println("Error, Your code number should be 5 digits.");
        }
        while(true){
            
            displayMenu();
            System.out.print("\nEnter your choice please: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Current Balance: "+userAccount.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount=sc.nextDouble();
                    userAccount.deposit(depositAmount);
                    System.out.println("Withdrawal successful. New balance: "+userAccount.checkBalance());
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount=sc.nextDouble();
                    if(withdrawAmount>0&&withdrawAmount<=userAccount.checkBalance()){
                        userAccount.withdraw(withdrawAmount);
                    System.out.println("Withdrawal successful. Remaining balance: "+userAccount.checkBalance());
                    }
                    else
                        System.out.println("Withdrawal unsuccessful,insufficient balance.");
                    break;
                case 4:
                    System.out.println("Exiting the ATM system, Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please enter a valid option: ");
            }    
        }
    }
}










