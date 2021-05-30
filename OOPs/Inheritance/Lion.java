package OOPs.Inheritance;

public class Lion {
    private String skin_color;
    private int numberOfLegs;

    public Lion(String skin_color, int numberOfLegs) {
        this.skin_color = skin_color;
        this.numberOfLegs = numberOfLegs;
    }

    public String getSkin_color() {
        return skin_color;
    }
    
    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return "Lion Skin Color = " + skin_color + ", Lion Number Of Legs = " + numberOfLegs;
    }
}
