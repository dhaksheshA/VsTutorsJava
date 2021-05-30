package OOPs.Polymorphism;

import java.util.ArrayList;

public class AnimalRunner {
    public static void main (String[]args) {
    Animal Lion = new Lion(); 
    Animal Cat = new Cat();
    Animal Frog = new Frog();

ArrayList <Animal> animal_list = new ArrayList<Animal>();
animal_list.add(Lion);
animal_list.add(Cat);
animal_list.add(Frog);

for(Animal animal: animal_list) {
    animal.sound();
}
}
}