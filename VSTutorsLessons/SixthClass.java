package VSTutorsLessons;
import java.util.Scanner;
//* = everything

public class SixthClass {

     public static void main(String []args){
        //RECAP On Arrays + For Loops
        int[] my_numbers = new int[5];
        my_numbers[4] = 15;
        my_numbers[3] = 5;
        my_numbers[1] = 7;
        //For loop
        for(int number_inside_bracket = 1; number_inside_bracket <= 4; number_inside_bracket += 2) {
            System.out.print(my_numbers[number_inside_bracket] + " ");
        }
        System.out.println();

        //if statements
        //if this is true -> something happens
        //if you are older than 10, you can play the game.
        //otherwise you can't
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your age?");
        int age = keyboard.nextInt();
    
        if (age > 10) {
            System.out.println("YOU CAN PLAY!");
        } 
        else {
            System.out.println("NOOOOOOO YOU CAN'T!!");
        }

        //2 students like even numbers, they dont like odd numbers; save all evens into one array, and the next array will be all odd numbers. 
        //Use an array to store all the even numbers and odd numbers
        //Hint: We need to make variables, and also use if statements INSIDE of a for loop!
        
        //We are going from 0 to 10 (inclusive on both sides)
        int[] even_numbers = new int[10];
        int[] odd_numbers = new int[10];
        
        for(int i = 0; i < 10; i++) {
            //Decide whether the number we are at is even or odd
            if (i % 2 == 0) { //Use modulus to check if even!
                //This number is even
                even_numbers[i] = i;
            } 
            else {
                //The number is odd
                odd_numbers[i] = i;
            }
        }
        
        for (int element: even_numbers) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int element: odd_numbers) {
            System.out.print(element + " ");
        }
        System.out.println();

     }
}