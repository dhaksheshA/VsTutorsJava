package Projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        List<String> bankList = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            System.out.println();
            System.out.println("Welcome to DL Bank");
            System.out.print("What is your name? ");
            String name = myObj.nextLine();
            bankList.add(name);
            System.out.println();
            System.out.print("Are you a new customer? (Enter true or false) ");
            String isNewCustomer = myObj.nextLine();
            if (isNewCustomer.equalsIgnoreCase("true")) {
                System.out.println("Thanks for joining DL Bank.");
            } else if (isNewCustomer.equalsIgnoreCase("false")) {
                System.out.println("Thanks you for returning valued customer!");
            }

            System.out.print("What can we help you with? (Enter W for withdraw, L for loan, or D for deposit)");
            String help_on = myObj.nextLine();
            System.out.println();
            double balance = 10.00;

            if (help_on.equalsIgnoreCase("W")) {
                System.out.print("How much money do you want?");
                double amount_wanted = myObj.nextDouble();
                myObj.nextLine();
                System.out.println();
                if (amount_wanted > balance) {
                    System.out.println("Sorry, you don't have enough money.");
                    System.out.println("Bye, have a nice day!");

                } else {
                    balance -= amount_wanted;
                    System.out.println("Current Balance: " + balance);
                    System.out.println("Bye, have a nice day!");
                }

            }

            else if (help_on.equalsIgnoreCase("D")) {
                System.out.println("How much do you want to add to your balance?");
                double want_to_add = myObj.nextDouble();
                myObj.nextLine();
                balance += want_to_add;
                System.out.println("Current Balance: " + balance);
                System.out.println("Bye!");
            }

            else if (help_on.equalsIgnoreCase("L")) {
                System.out.print("How much loan do you want?");
                double amount_wanted = myObj.nextDouble();
                myObj.nextLine();
                System.out.println();
                System.out.println("You owe the bank " + amount_wanted);
                System.out.println("You have to return the loan by 3 years with simple interest!");
                float p, r, t, sinterest;
                p = (float) amount_wanted;
                r = 10;
                t = 3;
                sinterest = (p * r * t) / 100;
                System.out.println("Simple Interest is: " + sinterest);
                System.out.println("Bye, have a nice day!");
            }

            else {
                System.out.println("You entered a wrong letter.");
                System.out.println("BYE!");
            }
        }

        System.out.println("The bank has closed for today, come again tommorow!");
        System.out.println("There was a total of " + bankList.size() + " people today.");
        System.out.println("The names of our valued customers are " + bankList);
        myObj.close();
    }
}
