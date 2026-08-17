package week03.day19.smartdevices;

public class SmartWatch extends Device implements Rechargeable, Trackable{
    public SmartWatch(String brand, String model) {
        super(brand, model);
    }
    @Override
    public void showStatus(){
        System.out.println("SmartWatch status");
    }
    @Override
    public void turnOn() {
        System.out.println("SmartWatch " + getBrand() + " - " + getModel() + " is turned on");
    }

    @Override
    public void recharge() {
        System.out.println("SmartWatch " + getBrand() + " - " + getModel() + " has rechargeable battery");
    }

    @Override
    public void trackLocation() {
        System.out.println("SmartWatch " + getBrand() + " - " + getModel() + " can be tracked.");
    }
}
