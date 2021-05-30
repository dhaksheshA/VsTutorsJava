package VSTutorsLessons;
import java.util.ArrayList;
import java.util.List;

public class EleventhClass {
    public static void main(String[] args) {
        //For loops
        List<Integer> even_numbers = new ArrayList<Integer>();
        //Goal: Go from 0 to 100 and get all the even numbers to store into even_numbers arraylist.
        for(int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                even_numbers.add(i);
            }
        }

        System.out.println(even_numbers);
        System.out.println(even_numbers.size());

        //While loops
        int i = 0; //initialization (starting point)
        while(i <= 100) { // where do you want to go until
            if (i % 2 == 0) {
                even_numbers.add(i);
            }
            i++; //incrementation (how do you want to proceed)
        }

        System.out.println(even_numbers);
        System.out.println(even_numbers.size());


    }
}