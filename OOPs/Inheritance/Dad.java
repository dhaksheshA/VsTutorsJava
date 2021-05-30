package OOPs.Inheritance;

public class Dad {
    //Child inherits these qualities from Dad
    private String eyeColor;
    private int height;
    //Dad has his own qualities
    private boolean hasBeard;

    public Dad(String eyeColor, int height, boolean hasBeard) {
        this.eyeColor = eyeColor;
        this.height = height;
        this.hasBeard = hasBeard;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isHasBeard() {
        return hasBeard;
    }

    public void setHasBeard(boolean hasBeard) {
        this.hasBeard = hasBeard;
        
    }

    @Override
    public String toString() {
        return "Dad [eyeColor=" + eyeColor + ", hasBeard=" + hasBeard + ", height=" + height + "]";
    }
}
