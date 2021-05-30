public class Question_3 {
    public static void main(String[] args) {
        int a = 9;
        int b = 1;
        int c = 0;
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if ( ab==10||bc==10||ac == 10){
            System.out.println("10");
        }
        else if (ab>10||bc>10||ac>10){
            System.out.println("5");
        }
        else{
              System.out.println("0");
        }
    }
}
