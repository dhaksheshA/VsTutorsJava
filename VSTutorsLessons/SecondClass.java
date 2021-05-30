package VSTutorsLessons;
import java.util.Date;

public class SecondClass {
    public static void main(String[] args) {
        //Intro into byte, long (space saving), char
        int number = 20; // -2B -> 2B
        double decimal = 20.7;
        byte small_num = 11; // -128 -> 127
        long phone_num = 48990812347879223L;
        char letter_a = 'a'; //char acter
        //Primative vs Reference (Date Class)
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        //Order of Operations (PEMDAS/BODMAS) with Math Operations
        int result = 2 + (3 * 4) / 6;
        System.out.println(result);
        //String methods - Special Reference Type
        String name = "jioshiuhihqehoqe";
        System.out.println(name.toUpperCase()); //makes all the letter uppercase
        System.out.println(name.endsWith("e")); //returns (prints) true if last letter of name is 'e'

        //Math class (.min, .max, .floor, .ceil)
        int max_number = Math.max(4, 5); //max of 2 numbers
        System.out.println(max_number);
        int min_number = Math.min(3, -6); //min of 2 numbers
        System.out.println(min_number); 
        double rounded_down_number = Math.floor(3.87); //rounds the decimal number DOWN
        System.out.println(rounded_down_number);
        double rounded_up_number = Math.ceil(2.10);  //rounds the decimal number UP
        System.out.println(rounded_up_number);

    }    
}
