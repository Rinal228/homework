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
        this.mileage += distance;
    }
    
    public void repaint(String newColor) {
        this.color = newColor;
    }
    
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }
    
}