package OOPs;

public class Shop {
    private String name;
    private int numberOfEmployees;
    
    public Shop(String shop_name, int shop_numberOfEmployees) {
        this.name = shop_name;
        this.numberOfEmployees = shop_numberOfEmployees;
    }
    public String getName() {
        return name;
    }
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setName(String updated_name) {
        this.name = updated_name;
    }
    public void setNumberOfEmployees(int updated_numberOfEmployees) {
        this.numberOfEmployees = updated_numberOfEmployees;
    }
}
