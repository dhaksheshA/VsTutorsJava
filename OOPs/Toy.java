package OOPs;

public class Toy {
    String name;
    int price;
    int quantity;
    boolean available;
    public Toy(String toy_name, int toy_price, int toy_quantity, boolean toy_available) {
        this.name = toy_name;
        this.price = toy_price;
        this.quantity = toy_quantity;
        this.available = toy_available;
    }
    public void toyName() {
        System.out.println(this.name);
    }
    public void toyPrice() {
        System.out.println(this.price);
    } 
    public void toyQuantity() {
        System.out.println(this.quantity);
    }
    public void toyAvailable() {
        System.out.println(this.available);
    }
	public void printName() {
        System.out.println("Toy: " + this.name);
    	}
	public void printPrice() {
        System.out.println("Price: $" + this.price);             
	}
	public void printQuantity() {
        System.out.println("Quantity: " + this.quantity);
	}
	public void printAvailable() {
        System.out.println("Available: " + this.available);
	}
	
}
