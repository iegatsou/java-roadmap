package week03.day21;

public class VanDelivery extends Delivery implements Trackable {
    private String driverName;
    private double maxWeight;

    public VanDelivery(String driverName, double distance, double maxWeight) {
        super(distance);
        if (driverName == null || driverName.isBlank()) {
            this.driverName = "John Doe";
        } else this.driverName = driverName;
        if (maxWeight <= 0) {
            this.maxWeight = 5;
            System.out.println("Cannot have max weight less or equal to zero. Set to minimum 5 kilos");
        } else this.maxWeight = maxWeight;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    @Override
    public void deliver() {
        System.out.print(driverName + " delevers #" + getId() + " delivery with his van. The distance is (km)");
        System.out.printf("%.2f%n", getDistance());
        System.out.println("and the maximum weight limit is: " + maxWeight);
    }

    @Override
    public void track() {
        System.out.println("Delivery #" + getId() + " is trackable");
    }
    public void printInfo(){
        System.out.print("Driver: " + driverName);
        System.out.printf(" - Distance: %.2f%n", getDistance());
    }
}
