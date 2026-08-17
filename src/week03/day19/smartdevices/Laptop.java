package week03.day19.smartdevices;

public class Laptop extends Device implements Rechargeable {
    public Laptop(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop "+getBrand() + " - " + getModel() + " is turned on");
    }

    @Override
    public void recharge() {
        System.out.println("Laptop "+ getBrand() + " - " + getModel() + " has rechargeable battery");
    }
}
