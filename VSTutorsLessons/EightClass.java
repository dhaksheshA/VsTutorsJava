package VSTutorsLessons;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EightClass {
    public static void main(String[] args) {
        //Arrays
        //Cannot change the size of the number of elements = "static"
        //Only have placement
        int[] array = {1, 2, 3, 10, 10000};
        System.out.println(array.length);
        System.out.println(array);
        //[I@2f0e140->> memory address 

        //ArrayList
        //Changing the numbers of elements whenever = "dynamic"
        //Has MANY more Features
        //Memory allocation is higher than for an array!
        //ArrayList is underneath the List
        List my_creative_list = new ArrayList();
        my_creative_list.add("Dhakshesh is Super Cool...");
        my_creative_list.add("Lattika is also super cool!");
        my_creative_list.add(5);
        my_creative_list.add(true);
        my_creative_list.add(4.31);
        System.out.println(my_creative_list);

        //You have 3 people in a line waiting to get popcorn
        List people = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String name = "";
        for(int person = 1; person <= 3; person++) {
            System.out.print("What is your name? ");
            name = sc.nextLine();
            people.add(name);
            System.out.println();
        }
        System.out.println(people);

        //Generics

    }
}