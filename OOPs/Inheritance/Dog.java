package OOPs.Inheritance;
public class Dog {
    private String furColor;
    private int tailLength;
    
    
    public Dog(String furColor, int tailLength){
        this.furColor = furColor;
        this.tailLength = tailLength;
    }
    public String getfurColor() {
        return furColor;
    }

    public void setEyeColor(String furColor) {
        this.furColor = furColor;
    }

    public int gettailLength() {
        return tailLength;
    }

    public void settailLength(int tailLength) {
        this.tailLength = tailLength;
    }
    @Override
    public String toString() {
        return " DOG: Fur Color = " + furColor + ", " + "Tail Length = " + tailLength + " inches";
    }
}
