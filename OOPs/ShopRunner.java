package OOPs;

public class ShopRunner {
    public static void main(String[] args) {
    Shop walmart = new Shop("Walmart", 300);
    System.out.println("The name of the shop is: " + walmart.getName());
    System.out.println("The number of employees in this the shop are: " + walmart.getNumberOfEmployees());
    walmart.setName("Costco");
    walmart.setNumberOfEmployees(600);
    System.out.println("The name of the shop is: " + walmart.getName());
    System.out.println("The number of employees in this the shop are: " + walmart.getNumberOfEmployees());
    }
}
