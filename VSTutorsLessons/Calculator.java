package VSTutorsLessons;
import java.util.Scanner;
public class Calculator {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int what_do_you_need = showMenu();
        
        double double_a = getValue();
        double double_b = getValue();
        
        double result;

        if(what_do_you_need == 1) {
            //adding    
            result = add(double_a, double_b);
        } else if (what_do_you_need==2) {
            result = subtract(double_a, double_b);
        } else if (what_do_you_need==3) {
            result = multiply(double_a, double_b);
        } else {
            result = divide(double_a, double_b);
        }
        System.out.println("Result: " + result);
    }

    public static double getValue() {
        System.out.println("Eneter one value");
        double double_a = input.nextDouble();
        return double_a;
    }

    public static double divide(double double_a, double double_b) {
        return double_a/double_b;
    }

    public static double multiply(double double_a, double double_b) {
        return double_a*double_b;
    }

    public static int showMenu() {
        // Code to show the menu
        System.out.println("SHOWING THE MENU!");
        System.out.println("What do you want? 1 - add");
        int calculate = input.nextInt();
        return calculate;
    }
    public static double add(double double_a, double double_b) {
        return double_a + double_b;
    }

    public static double subtract(double double_a, double double_b) {
        return double_a - double_b;
    }
    
}