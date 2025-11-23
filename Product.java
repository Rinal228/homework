public class Product {
    private String name;
    private double price;
    private String category;
    private boolean inStock;
    private int quantity;
    private static int totalProducts = 0;
    private final String  STORE_NAME = "Супермаркет 'У дома'";
    
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
    public static double calculateTotalValue(Product[] products) {
        double result = 0;
        for(int i = 0; i < products.length(); i++) {
            result += products[i].getPrice();
        }
        return result;
    }
    
    public void displayInfo() {
        System.out.println(name + " " + price + " " + category + " " + inStock + " " + quantity);
    }
    public void displayInfo(boolean showStockStatus) {
        if(showStockStatus) {
            displayInfo();
        } else {
            System.out.println(name + " " + price + " " + category + " " + quantity);
        }
        
    }
    
    public void applyDiscount(double percent) {
        double discount = this.price * (percent / 100);
        this.price -= discount;
    }
    public void applyDiscount(double percent, String promoCode) {
        applyDiscount(percent);
        System.out.println(promoCode);
    }
    public void restock(int amount) {
        this.quantity += amount;
        this.inStock = true;
    }
    public void restock(int amount, String supplier) {
        restock(amount);
        System.out.println(supplier);
    }

    public void sell(int amount) {
        if (this.quantity >= amount) {
            this.quantity -= amount;
        } else {
            System.out.println("You are stupid");
        }
    }
    public void sell(int amount, String customer) {
        sell(amount);
        System.out,println(customer);
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        if(price > 0 && price <= 1000000) {
            this.price = price;
        }
        
    }
    public String getCategory() {
        return this.category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public boolean getInStock() {
        return this.inStock;
    }
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public void setQuantity(int quantity) {
        if(quantity > 0) {
            this.quantity = quantity;
        }
        
    }
    
}