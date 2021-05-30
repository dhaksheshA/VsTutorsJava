package VSTutorsLessons;
public class FirstClass {
    public static void main(String[] args) {
        //Printing
        System.out.println("Sai");
        //Variables
        String name = "Sai"; //String is for words
        int age = 17; //int is for whole numbers
        boolean first_time_visitor = true; //boolean is for true or false
        double divide_result = 3 / 2; //double shows decimals

        //Concatenation - joining
        System.out.println("My name is " + name + ". My age is " + age + ". Am I a first time visitor: " + first_time_visitor);

        //Operations (add, subtract, multiply, divide)
        int sum_result = 2 + 90;
        int subtract_result = 92 - 10;
        int multiply_result = 2 * 80;
        int divide_result2 = 10 / 5;
        System.out.println(sum_result);
        System.out.println(subtract_result);
        System.out.println(multiply_result);
        System.out.println(divide_result2);
        //1.5 -> rounds down to 1.0; floor division

        //Casting
        double divide_result4 = (double) 3/4; 
        System.out.println(divide_result4);
    }
}