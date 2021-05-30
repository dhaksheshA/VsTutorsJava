package OOPs;

public class Animal {
    String name;
    String color;
    int height;
    public Animal(String user_name, String user_color, int user_height) { 
        this.name = user_name;
        this.color = user_color;
        this.height = user_height;
    }
    public void hunt() {
        System.out.println(this.name + " is hunting");
    }
    public void run() {
        System.out.println(this.name + " is running");
}
    public String getName() {
    return name;
}
    public String getColor() {
    return color;
    }
    public int getHeight() {
        return height;
    }
}
