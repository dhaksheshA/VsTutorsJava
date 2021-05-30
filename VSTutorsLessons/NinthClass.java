package VSTutorsLessons;
import java.util.ArrayList;
import java.util.List;

public class NinthClass {
    public static void main(String[] args) {
        //Review ArrayLists (10 mins)
        //Generics
        //int a => primitive type ("wrapper class - Integer")
        //boolean a => primitive type ("wrapper class - Boolean")
        ArrayList<Integer> list = new ArrayList<Integer>();
        //list.add("Hi");
        //list.add("Hi1");
        //list.add("Hi2");
        //list.add("Hi3");
        list.add(4);
        list.add(1000000); //.add is known as a method
        list.add(40); 
        list.add(1, 50);
        list.add(2, 3);
        System.out.println(list.get(3)); //.get() is known as a method
        System.out.println(list.size()); //.size() is known as a method
        System.out.println(list);
        //.add(number), .add(index, number), .size(), .get()
        
        //You create a list of groceries (you must have 5 items) and you need to show the size of the list and also add in another item you forgot to at index position 3
        List<String> groceries_list = new ArrayList<String>();
        groceries_list.add("Cookies");
        groceries_list.add("Apple");
        groceries_list.add("Toy");
        groceries_list.add("Game");
        groceries_list.add("Blocks");
        System.out.println(groceries_list.contains("toy")); //call a method or function
        System.out.println(groceries_list.size()); //call a method or function
        groceries_list.add(3, "Chips");
        System.out.println("Here is the list: " + groceries_list);
        System.out.println(groceries_list.size());
        //You create a list of Booleans (you must have at least 3) and you need to tell me how many of them are false and how many are true, FOR LOOP
        List<Boolean> boolean_list = new ArrayList<Boolean>();
        boolean_list.add(true); //0th index
        boolean_list.add(false);
        boolean_list.add(false);
        boolean_list.add(true);
        boolean_list.add(false);
        boolean_list.add(false);
        boolean_list.add(false);

        int true_count = 0;
        int false_count = 0;

        for(int i = 0; i < boolean_list.size(); i++) {
            if(boolean_list.get(i) == true) {
                //We have a true item in our list
                true_count += 1; //true_count = true_count + 1
            } 
            else {
                //We have a false item in our list
                false_count += 1;
            }
        }
        System.out.println("True Count: " + true_count);
        System.out.println("False Count: " + false_count);

        //Streams (one line!)

       
        //New students view presentation and look over GitHub (via website) while I teach Dhak/Latt
    }
}