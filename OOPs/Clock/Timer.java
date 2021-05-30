import java.util.Scanner;
public class Timer {
    private Scanner userInput;
   
    public Timer() {
        this.userInput = new Scanner(System.in); 
    }
   
    public void countDown() {
        System.out.print("Please enter the hours");  
        int hours = userInput.nextInt();

        System.out.print("Please enter the minutes");  
        int minutes = userInput.nextInt();

        System.out.print("Please enter the seconds");  
        int seconds = userInput.nextInt();

        long totalTime = (hours*3600000) + (minutes*60000) + (seconds*1000);
        
        try {
            Thread.sleep(totalTime);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.print("Beep! Beep! Beep! Your time is over!");
    }
}
