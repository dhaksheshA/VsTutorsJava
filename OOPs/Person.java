package OOPs;

public class Person {
    String name;
    int age;
    //constructor
    public Person(String user_name, int user_age) { 
        this.name = user_name;
        this.age = user_age;
    }

    //Method/Functions
    public void eat() {
        System.out.println(this.name + " is eating");
        //Random stuff
    }
    public void sleep() {
        System.out.println(this.name + " is sleeping");
}
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}