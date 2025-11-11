public class MobilePhone {
    private String brand;
    private String model;
    private int storageGB;
    private int batteryLevel;
    private boolean isPoweredOn;
    
    public MobilePhone() {
        this.brand = "Realme";
        this.model = "Gt 7";
        this.storageGB = 64;
        this.batteryLevel = 0;
        this.isPoweredOn = false;
    }
    
    public MobilePhone(String brand, String model, int storageGB) {
        this.brand = brand;
        this.model = model;
        this.storageGB = storageGB;
        this.batteryLevel = 0;
        this.isPoweredOn = false;
    }
    
    public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn) {
        this.brand = brand;
        this.model = model;
        this.storageGB = storageGB;
        this.batteryLevel = batteryLevel;
        this.isPoweredOn = isPoweredOn;
    }
    
    public void displayInfo() {
       System.out.println(brand + " " + model + " " + storageGB + " " + batteryLevel + " " + isPoweredOn);
    }
    
    public void powerOn() {
        if (this.batteryLevel > 0) {
            this.isPoweredOn = true;
        } else {
            System.out.println("Go to the gym");
        }
    }
    
    public void powerOff() {
        this.isPoweredOn = false;
    }
    
    public void chargeBattery(int percent) {
        this.batteryLevel += percent;
    }
    
    public void useBattery(int percent) {
        if (this.batteryLevel >= percent) {
            this.batteryLevel -= percent;
           
        } else {
            this.batteryLevel = 0;
        }
    }
    
}