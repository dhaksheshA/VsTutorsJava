package VSTutorsLessons;
import java.util.Scanner;

public class ThirdClass {
    public static void main(String[] args) {
        System.out.println("Is 1 + 2 = 3?");
        String computerAnswer = "yes"; //what you, Lattika, and Sai thinks is the right answer
        Scanner keyboardInput = new Scanner(System.in); 
        String userAnswer = keyboardInput.nextLine(); //gets the answer (whatever user types into box)
        //compare the 2 answers
        //if the answers are the same (Lattika's and my answers are matching the answer user types, the user got it correct)
        if(computerAnswer.equalsIgnoreCase(userAnswer)) {//when comparing 2 strings, use .equals
            System.out.println("You got it correct!");
        } 
        //check if user answer is either yes or no, if it is not yes or no, then you say are you a baby?
        else if (!(userAnswer.equalsIgnoreCase("yes")) && !(userAnswer.equalsIgnoreCase("no"))) { 
            System.out.println("Are you a baby?");
            String userAnswer2 = keyboardInput.nextLine(); 
            if (!(userAnswer2.equalsIgnoreCase("yes")) && !(userAnswer2.equalsIgnoreCase("no"))) {
                System.out.println("Yes, you are a baby!");
            }
        }
        else {
            System.out.println("You got it wrong!");
        }
        //YES doesnt equal yes
        keyboardInput.close();

    }
}
