package OOPs;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class DLRunner1 {
    public static void main(String[] args) {
        ArrayList<DL1> customers = new ArrayList<DL1>();
        int customerCount = 150;
        ArrayList<Long> userAccounts = new ArrayList<Long>();
        userAccounts.add(235674797L);
        userAccounts.add(362985280L);
        userAccounts.add(637952063L);
        userAccounts.add(237593254L);
         do {
            Random rand = new Random(); 
            Scanner scanner = new Scanner(System.in);
            System.out.println("Thanks for coming to DL Bank!");
            System.out.println();
            System.out.println("May I know your account number (Enter only numbers)?");
            long userAccountNumber = scanner.nextLong(); 
            scanner.nextLine();
            System.out.println();
            boolean isCustomer = false;
            for (Long accountNumber : userAccounts) {
                if (userAccountNumber == accountNumber) {
                    isCustomer = true;
                }
            } 
            System.out.println("You are a customer: " + isCustomer);
             if (isCustomer == false) {
               System.out.println("We need your information to create a new account for you.");
                 System.out.println("May I know what is your name (Enter Name Here)?");
                 String customer_name = scanner.nextLine();
                 System.out.println();
                 System.out.println("May I know what is your age (Enter Age Here)?");
                 int customer_age = scanner.nextInt();
                 scanner.nextLine();
                 System.out.println();
                 System.out.println("May I know your phone number (Enter Phone Number Here)?");
                 long customer_phonenumber = scanner.nextLong();
                 scanner.nextLine();
                 System.out.println();
                 System.out.println("Thanks for your cooperation!");
                 long leftLimit = 100000000L;
                 long rightLimit = 100000000000L;
                 long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
                 System.out.println("Congratulations! You have made your account");
                 System.out.println("Your account number is: " + generatedLong);
                 userAccounts.add(generatedLong);
                 customerCount--;
             } else {
                System.out.println("What do you want help with (Enter D for Deposit | Enter W for Withdraw | Enter L for Loan)?");
                String customer_action = scanner.nextLine();
                System.out.println();
                DL1 customer = new DL1(customer_action, customerCount, userAccountNumber, customer_action,
                        isCustomer, userAccountNumber);
                customers.add(customer);
            if(customer_action.equals("D"))
                customer.deposit();
            if(customer_action.equals("W"))
                customer.withdraw();
            else if(customer_action.equals("L"))
                customer.loan();
                 customerCount--;
             }
         } while (customerCount != 0);
    }
}