package OOPs.Inheritance;

public class Cub extends Lion{
    private int height;

    public Cub(String skin_color, int numberOfLegs, int height) {
        super(skin_color, numberOfLegs);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }

    

    @Override
    public String toString() {
        return "Cub Height = " + height + " feet";
    }
}
