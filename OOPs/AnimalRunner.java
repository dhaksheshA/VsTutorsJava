package OOPs;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Lion", "Yellowish Orange", 4);
        Animal animal2 = new Animal("Deer", "Brown", 6);
        Animal animal3 = new Animal("Rabbit", "White", 2);
        Animal animal4 = new Animal("Elephant", "Grey", 9);
        String name1 = animal1.getName();
        String name2 = animal2.getName();
        String name3 = animal3.getName();
        String name4 = animal4.getName();
        String color1 = animal1.getColor();
        String color2 = animal2.getColor();
        String color3 = animal3.getColor();
        String color4 = animal4.getColor();
        int height1 = animal1.getHeight();
        int height2 = animal2.getHeight();
        int height3 = animal3.getHeight();
        int height4 = animal4.getHeight();
        System.out.println("Name: " + name1);
        System.out.println("Color: " + color1);
        System.out.println("Height: " + height1 + "ft");
        animal1.hunt();
        animal1.run();
        System.out.println("Name: " + name2);
        System.out.println("Color: " + color2);
        System.out.println("Height: " + height2 + "ft");
        animal2.hunt();
        animal2.run();
        System.out.println("Name: " + name3);
        System.out.println("Color: " + color3);
        System.out.println("Height: " + height3 + "ft");
        animal3.hunt();
        animal3.run();
        System.out.println("Name: " + name4);
        System.out.println("Color: " + color4);
        System.out.println("Height: " + height4 + "ft");
        animal4.hunt();
        animal4.run();
    }
}
