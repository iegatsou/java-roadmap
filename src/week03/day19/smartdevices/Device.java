package week03.day19.smartdevices;

public abstract class Device {
    private String brand;
    private String model;
    public Device(String brand, String model){
        this.brand=brand;
        this.model=model;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public void printInfo(){
        System.out.println("Brand: " + brand + " - Model: " + model);
    }
    public abstract void turnOn();



}
