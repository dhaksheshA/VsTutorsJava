package OOPs.Inheritance;


public class Runner {
    public static void main(String[] args) {
        Child dhakshesh = new Child("black", 5, true, false);
        dhakshesh.getHeight();
        Dad dad = new Dad("black", 5, true);
        dad.getEyeColor();
    }
}
