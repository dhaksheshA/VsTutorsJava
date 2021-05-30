package OOPs;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DLBank {
    private String name;
    int age;
    long phonenumber;
    String action;
    boolean isnew;
    long accountnumber;
    Scanner scanner = new Scanner(System.in);
    private Scanner myObj;
public DLBank(String customer_name, int customer_age, long customer_phonenumber, String customer_action, boolean customer_isnew, long customer_accountnumber) { 
    this.name = customer_name;
    this.age = customer_age;
    this.phonenumber = customer_phonenumber;
    this.action = customer_action;
    this.isnew = customer_isnew;
    this.accountnumber = customer_accountnumber;
    myObj = new Scanner(System.in);
}
public void customername() {
    System.out.println(this.name);
}
public void customerage() {
    System.out.println(this.age);
} 
public void customerphonenumber() {
    System.out.println(this.phonenumber);
}
public void customeraction() {
    System.out.println(this.action);
}
public void customerisnew() {
    System.out.println(this.isnew);
}
public void customeraccountnumber() {
    System.out.println(this.accountnumber);
}
public void open() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");  
    LocalDateTime now = LocalDateTime.now();  
    System.out.println("The DL bank is opened at " + dtf.format(now));
}
public void close() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");  
    LocalDateTime now = LocalDateTime.now();  
    System.out.println("The DL bank is closed at " + dtf.format(now));
}
public void deposit() {
    System.out.println("What is your balance?");
    double balance = myObj.nextDouble();
    myObj.nextLine();
    System.out.println("How much do you want to add to your balance?");
    double want_to_deposit = myObj.nextDouble();
    myObj.nextLine();
    balance += want_to_deposit;
    System.out.println("Current Balance: " + balance);
    System.out.println("Congratulations, you have deposited: " + want_to_deposit + " Have a great day and make sure to come back again!");
}
public void withdraw() {
    System.out.println("What is your balance?");
    double balance = myObj.nextDouble();
    myObj.nextLine();
    System.out.println("How much money do you want to withdraw ?");
    double want_to_withdraw = myObj.nextDouble();
    myObj.nextLine();
    System.out.println();
    if(want_to_withdraw > balance) {
        System.out.println("Sorry, you don't have enough money to withdraw.");
        System.out.println("Bye, have a great day and make sure to come back!");
}
else {
    balance -= want_to_withdraw;
    System.out.println("Current Balance: " + balance);
    System.out.println("Congratulations, you have withdrawed: " + want_to_withdraw + " Have a great day and make sure to come back again!");
}   
}
public void loan() {
    System.out.println("How much loan do you want?");
    double want_to_loan = myObj.nextDouble();
    myObj.nextLine();
    float p, r, t, sinterest;
    System.out.println("How much amount do you want?");
    double amount_wanted = myObj.nextDouble();
    myObj.nextLine();
    System.out.println();
	p = (float) amount_wanted;
    r = 10;
    t = 6;
    sinterest = (p * r * t) / 100;
    System.out.println();
    System.out.println("Your simple interest is: " + sinterest);
    System.out.println("You owe the bank: " + sinterest + want_to_loan + " in 6 years");
    System.out.println("Congratulations, you have successfully got your loan of: " + want_to_loan + " Have a great day and make sure to come back again!");
}
public String getName() {
    return name;
}
public int getAge() {
    return age;
}
public long getPhoneNumber() {
    return phonenumber;
}
public String getAction() {
    return action;
}
public boolean getIsNew() {
    return isnew;
}
public long getAccountNumber() {
    return accountnumber;
}
public void setName(String updated_name){
    this.name = updated_name;
}
public void setAge(int updated_age){
    this.age = updated_age;
}
public void setPhoneNumber(long updated_phonenumber){
    this.phonenumber = updated_phonenumber;
}
public void setAction(String updated_action){
    this.action = updated_action;
}
public void setIsNew(boolean updated_isnew) {
    this.isnew = updated_isnew;
}
public void setAccountNumber(long updated_accountnumber) {
    this.accountnumber = updated_accountnumber;
}
}




