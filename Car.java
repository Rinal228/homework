public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private boolean isRunning;
    private double mileage;
    
    public Car() {
        this.brand = "BMW";
        this.model = "M5";
        this.year = 2020;
        this.color = "Black";
        this.price = 30000000;
        this.isRunning = false;
        this.mileage = 0.0;
    }
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = "White";
        this.price = 300000;
        this.isRunning = false;
        this.mileage = 0.0;
    }
    
    public Car(String brand, String model, int year, String color, double price, boolean isRunning, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.isRunning = isRunning;
        this.mileage = mileage;
    }
    
    public void displayInfo() {
        System.out.println(brand + " " + model + " " + year + " " + color + " " + price + " " + isRunning + " " + mileage);
    }
    
    public void startEngine() {
        this.isRunning = true;
    }
    
    public void stopEngine() {
        this.isRunning = false;
    }
    
    public void drive(double distance) {
        if(this.isRunning) {
            this.mileage += distance;
        }
        
    }
    public String getBrand() {
        return this.brand;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String getColor() {
        return this.color;
    }
     public double getPrice() {
        return this.price;
    }
    
    public boolean getIsRunning() {
        return this.isRunning;
    }
    
    public double getMileage() {
        return this.mileage;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }
    
    public void setMileage(double mileage) {
        if(mileage > 0) {
            this.mileage = mileage;
        }
        
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void repaint(String newColor) {
        this.color = newColor;
    }
    
    public void updatePrice(double newPrice) {
        if(newPrice >= 0) {
            this.price = newPrice;
        }
        
    }
    
}