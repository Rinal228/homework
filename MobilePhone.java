public class MobilePhone {
    private String brand;
    private String model;
    private int storageGB;
    private int batteryLevel;
    private boolean isPoweredOn;
    private static int totalPhones = 0;
    private final int MAX_BATTERY = 100;
    
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
    public static void displayTechSupport() {
        System.out.println("Поддержи свою форму");
    }
    
    public void displayInfo() {
       System.out.println(brand + " " + model + " " + storageGB + " " + batteryLevel + " " + isPoweredOn);
    }
    public void displayInfo(boolean showPowerStatus) {
        if(showPowerStatus) {
            displayInfo();
        } else {
            System.out.println(brand + " " + model + " " + storageGB + " " + batteryLevel);
        }
       
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
        if(this.batteryLevel + percent < 100) {
            this.batteryLevel += percent;
        } else {
            this.batteryLevel = 100;
        }
        if(this.batteryLevel == 0) powerOff();
        
    }
    public void chargeBattery(int percent, int minutes) {
        chargeBattery(percent);
        System.out.println(minutes);
    }
    
    public void useBattery(int percent) {
        if (this.batteryLevel >= percent) {
            this.batteryLevel -= percent;
           
        } else {
            this.batteryLevel = 0;
        }
    }
    public void useBattery(int percent, String appName) {
        useBattery(percent);
        System.out.println(appName);
    }
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getStorageGB(){
        return this.storageGB;
    }
    public void setStorageGB(int storageGB){
        if(storageGB > 0) {
            this.storageGB = storageGB;
        }
        
    }
    public int getBatteryLevel(){
        return this.batteryLevel;
    }
    public void setBatteryLevel(int batteryLevel){
        if(batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        }
        
    }
    public boolean getIsPoweredOn(){
        return this.isPoweredOn;
    }
    public void setIsPoweredOn(boolean isPoweredOn){
        this.isPoweredOn = isPoweredOn;
    }
    
}