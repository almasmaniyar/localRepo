package miniprojectsprojects;

import java.io.*;
import java.util.Scanner;

public class BankApplicationFull {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank account:");
            String name = sc.nextLine();
            String customerId = sc.nextLine();
            BankAccount1 obj1 = new BankAccount1(name, customerId);
            obj1.menu();
        }
    }
}

class BankAccount1 {
    double bal;
    double prevTrans;
    String customerName;
    String customerId;
    String dataFilePath = "bank_data.txt";

    BankAccount1(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
        loadAccountData();
    }

    void deposit(double amount) {
        if (amount != 0) {
            bal += amount;
            prevTrans = amount;
        }
    }

    void withdraw(double amt) {
        if (amt != 0 && bal >= amt) {
            bal -= amt;
            prevTrans = -amt;
        } else if (bal < amt) {
            System.out.println("Bank balance insufficient");
        }
    }

    void getPreviousTrans() {
        if (prevTrans > 0) {
            System.out.println("Deposited: " + prevTrans);
        } else if (prevTrans < 0) {
            System.out.println("Withdrawn: " + Math.abs(prevTrans));
        } else {
            System.out.println("No transaction occurred");
        }
    }

    void loadAccountData() {
        try {
            File file = new File(dataFilePath);
            if (file.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 2 && parts[0].equals(customerId)) {
                        bal = Double.parseDouble(parts[1]);
                    }
                }
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void saveAccountData() {
        try {
            File file = new File(dataFilePath);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(customerId + "," + bal);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void menu() {
        char option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID:" + customerId);
        System.out.println("\n");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit Amount");
        System.out.println("c) Withdraw Amount");
        System.out.println("d) Previous Transaction");
        System.out.println("e) Exit");
        // ... Display menu options

        do {
        	 System.out.println("********************************************");
             System.out.println("Choose an option");
             option=sc.next().charAt(0);
             System.out.println("\n");

             switch (option){
                 case 'a':
                     System.out.println("......................");
                     System.out.println("Balance ="+bal);
                     System.out.println("......................");
                     System.out.println("\n");
                     break;
                 case 'b':
                     System.out.println("......................");
                     System.out.println("Enter a amount to deposit :");
                     System.out.println("......................");
                     double amt=sc.nextDouble();
                     deposit(amt);
                     System.out.println("\n");
                     break;
                 case 'c':
                     System.out.println("......................");
                     System.out.println("Enter a amount to Withdraw :");
                     System.out.println("......................");
                     double amtW=sc.nextDouble();
                     withdraw(amtW);
                     System.out.println("\n");
                     break;
                 case 'd':
                     System.out.println("......................");
                     System.out.println("Previous Transaction:");
                     getPreviousTrans();
                     System.out.println("......................");
                     System.out.println("\n");
                     break;

                 case 'e':
                     System.out.println("......................");
                     break;
                 default:
                     System.out.println("Choose a correct option to proceed");
                     break;
             }
            // ... Menu code

            // Save account data after each transaction
            saveAccountData();

        } while (option != 'e');

        System.out.println("Thank you for using our banking services");
    }
}
