package OOPs;
public class ToyRunner {
    public static void main(String[] args) {
        Toy ball = new Toy("Ball", 15, 6, true);
        Toy bat = new Toy("Bat", 60, 3, true);
        Toy wicket = new Toy("Wicket", 21, 0, false);
        ball.printName();
        ball.printPrice();
        ball.printQuantity();
        ball.printAvailable();
        bat.printName();
        bat.printPrice();
        bat.printQuantity();
        bat.printAvailable();
        wicket.printName();
        wicket.printPrice();
        wicket.printQuantity();
        wicket.printAvailable();
    }
}