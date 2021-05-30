package VSTutorsLessons;
public class FifthClass {
    public static void main(String []args){
        //Recap On Arrays
        int a = 5;
        int b = 10;
        int[] array = new int[2]; 
        array[0] = a;
        array[1] = b;
        System.out.println(array[0]);
        System.out.println(array[1]);
        
        String[] words = new String[3];
        words[0] = "hi";
        words[1] = "sai";
        words[2] = "lattika";
        
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        
        //Shopping Practice Problem
        /*
            This is the practice problem description: You go to a store and pick some items.
            You pick 3 items from the store. And you put those in your basket. Code this using an array.
            Print this out on the terminal screen.
        */
        //For Loop
        
        //less than or equal to we say <=
        //Basic Number Example
        //print from 1 -> 10
        System.out.println("1,2,3,4,5,6,7,8,9,10");
        for(int start = 1; start <= 50; start++) {
            System.out.print(start + " ");
        }
        System.out.println();
        //Connect it to array
        for(int i = 0; i < words.length; i++) {
            words[i] = "Java Class";
            System.out.print(words[i] + " ");
        }

     }
}