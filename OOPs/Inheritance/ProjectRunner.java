package OOPs.Inheritance;

public class ProjectRunner {
    public static void main(String[] args) {
        Puppy jimmy = new Puppy("Black and White", 5, "Dalmatian", 22);
        String breed = jimmy.getbreed();
        int teethHeight = jimmy.getteethHeight();
        String furColorChild = jimmy.getfurColor();
        int tailLengthChild = jimmy.gettailLength();
        System.out.println(furColorChild);
        System.out.println(tailLengthChild);
        System.out.println(jimmy);
        Dog john = new Dog("black and white", 5);
        String furColor = john.getfurColor();
        int tailLength = john.gettailLength();
        System.out.println(john);
    }
}
