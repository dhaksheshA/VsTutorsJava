package VSTutorsLessons;
public class SeventhClass {
    public static void main(String[] args) {
        //Review of last week:
        //Finding even/odd numbers in java
        int number_1 = 21;
        //Ask computer is it even or odd
        if(number_1 % 2 != 0) {
            System.out.println("Odd!");
        } else {
            System.out.println("Even!");
        }
        //Integrate with For Loop
        //1,2,3,4,5
        //Odd: 3
        //Even: 2

        int even_number_count = 0;
        int odd_number_count = 0;

        for(int i = 1; i <= 37; i++) {
            if(i % 2 == 0) {
                //We know that is even number
                even_number_count++;
            } else {
                //We know that is odd number
                odd_number_count++;
            }
        }
        System.out.println("Even number count " + even_number_count);
        System.out.println("Odd number count " + odd_number_count);
    }
}