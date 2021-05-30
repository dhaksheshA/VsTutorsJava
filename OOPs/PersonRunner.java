package OOPs;

public class PersonRunner {
    public static void main(String[] args) {
        //we are going to instantiate our Person
        //Scanner key = new Scanner(System.in)
        Person person1 = new Person("Sai", 17);
        Person person2 = new Person("Lattika", 12);
        Person person3 = new Person("Dhakshesh", 15);
        int age1 = person1.getAge();
        int age2 = person2.getAge();
        int age3 = person3.getAge();
        String name1 = person1.getName();
        String name2 = person2.getName();
        String name3 = person3.getName();
        System.out.println("Age: " + age1);
        System.out.println("Name: " + name1);
        person1.eat();
        person1.sleep();
        System.out.println("Age: " + age2);
        System.out.println("Name: " + name2);
        person2.eat();
        person2.sleep();
        System.out.println("Age: " + age3);
        System.out.println("Name: " + name3);
        person3.eat();
        person3.sleep();
    }
}
