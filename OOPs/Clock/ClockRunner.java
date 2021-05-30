
import java.util.Scanner;
public class ClockRunner {
    
public static void main(String[] args) {
    Timer timer = new Timer(); 
    Stopwatch stopwatch = new Stopwatch(); 
    Scanner myObj = new Scanner(System.in);
    System.out.println("Do you want to set a timer or run the stopwatch?");
    String user_input = myObj.nextLine();
    if(user_input.equals("timer")) {
        timer.countDown();
    }
    else if (user_input.equals("stopwatch")){
        stopwatch.countUp();
    }
    else {
        System.out.println("Invalid Respone");
    }
} 
}