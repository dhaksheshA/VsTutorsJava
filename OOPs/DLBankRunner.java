package OOPs;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class DLBankRunner {
    public static void main(String[] args) {
        ArrayList<DLBank> customers = new ArrayList<DLBank>();
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
            System.out.println("Are you a new customer (Enter true or false)?");
            boolean customer_isnew = scanner.nextBoolean();
            System.out.println();
            if (customer_isnew == true) {
                System.out.println("We need your information to create a new account for you.");
                System.out.println("May I know what is your name (Enter Name Here)?");
                String customer_name = scanner.nextLine();
                scanner.nextLine();
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
                System.out.println("What do you want help with (Enter D for Deposit | Enter W for Withdraw | Enter L for Loan)?");
                String customer_action = scanner.nextLine();
                System.out.println();
                DLBank customer = new DLBank(customer_name, customer_age, customer_phonenumber, customer_action, customer_isnew, customer_phonenumber);
                customers.add(customer);
            if(customer_action.equals("D"))
                customer.deposit();
            if(customer_action.equals("W"))
                customer.withdraw();
            else if(customer_action.equals("L"))
                customer.loan();
            else 
                System.out.println("ERROR!");
            customerCount--;
            } else {
                System.out.println("May I know your account number?");
                long customer_accountnumber = scanner.nextLong();
                scanner.nextLine();
                for(Long l : userAccounts) {
                    if(l == customer_accountnumber) {
                        customer_isnew = false;
                        System.out.println("You are a customer!");
                    }
                    else{
                        customer_isnew = true;
                        System.out.println("You are not a customer!");
                        System.exit(customerCount);
                        customerCount--;
                    }
                }
                System.out.println("What do you want help with (Enter D for Deposit | Enter W for Withdraw | Enter L for Loan)?");
                String customer_action = scanner.nextLine();
                System.out.println();
                DLBank customer = new DLBank(customer_action, customerCount, customer_accountnumber, customer_action, customer_isnew, customer_accountnumber);
                customers.add(customer);
            if(customer_action.equals("D"))
                customer.deposit();
            if(customer_action.equals("W"))
                customer.withdraw();
            else if(customer_action.equals("L"))
                customer.loan();
            else 
                System.out.println("ERROR!");
            customerCount--;
                }
              }
         while(customerCount != 0);
    }
}
