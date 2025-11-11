public class Product {
    private String name;
    private double price;
    private String category;
    private boolean inStock;
    private int quantity;
    
    public Product() {
        this.name = "apples";
        this.price = 23;
        this.category = "fruit";
        this.inStock = false;
        this.quantity = 4;
    }
    
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = true;
        this.quantity = 4;
    }
    
    public Product(String name, double price, String category, boolean inStock, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
        this.quantity = quantity;
    }
    
    public void displayInfo() {
        System.out.println(name + " " + price + " " + category + " " + inStock + " " + quantity);
    }
    
    public void applyDiscount(double percent) {
    double discount = this.price * (percent / 100);
    this.price -= discount;
    }
    public void restock(int amount) {
        this.quantity += amount;
        this.inStock = true;
    }

    public void sell(int amount) {
        if (this.quantity >= amount) {
            this.quantity -= amount;
        } else {
            System.out.println("You are stupid");
        }
    }
    
}