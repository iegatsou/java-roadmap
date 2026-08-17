package week03.day19.smartdevices;

public class SmartPhone extends Device implements Rechargeable, Trackable {
    public SmartPhone(String brand, String model) {
        super(brand, model);
    }
    @Override
    public void showStatus(){
        Rechargeable.super.showStatus();
        Trackable.super.showStatus();
    }
    @Override
    public void turnOn() {
        System.out.println("Smartphone " + getBrand() + " - " + getModel() + " is turned on");
    }

    @Override
    public void recharge() {
        System.out.println("Smartphone " + getBrand() + " - " + getModel() + " has rechargeable battery");
    }

    @Override
    public void trackLocation() {
        System.out.println("Smartphone " + getBrand() + " - " + getModel() + " can be tracked.");
    }
}
