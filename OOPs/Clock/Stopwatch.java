import java.util.Scanner;
public class Stopwatch {
    private Scanner userInput;
    public Stopwatch() {
    this.userInput = new Scanner(System.in);   
}

public void countUp() {
    int hour = 0;
    int min = 0;
    int sec = 0;

    for(int i = sec; i <= 90; i++) {
        System.out.println("H: " + hour + "M: " + min + "S: " + sec);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(i == 59 || sec == 59) {
            min += 1;
            sec = 0;
            continue;
        }
        if(min == 59) {
            hour += 1;
            min = 0;
        }
        sec++;
    } 
}
}