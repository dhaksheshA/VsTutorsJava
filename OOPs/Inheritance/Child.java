package OOPs.Inheritance;

public class Child extends Dad {
    //Attributes tht only children have
    private boolean hasSchool;

    public Child(String eyeColor, int height, boolean hasBeard, boolean hasSchool) {
        super(eyeColor, height, hasBeard);
        this.hasSchool = hasSchool;
    }

    public boolean isHasSchool() {
        return hasSchool;
    }

    public void setHasSchool(boolean hasSchool) {
        this.hasSchool = hasSchool;
    }

    @Override
    public String toString() {
        return "Child [hasSchool=" + hasSchool + "]";
    }

    
}
