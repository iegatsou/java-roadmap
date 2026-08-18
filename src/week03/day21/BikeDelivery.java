package week03.day21;

public class BikeDelivery extends Delivery {
    private String riderName;

    public BikeDelivery(String riderName, double distance) {
        super(distance);
        if (riderName==null || riderName.isEmpty()) {
            this.riderName="John Doe";
        } else this.riderName=riderName;
    }

    public String getRiderName() {
        return riderName;
    }

    @Override
    public void deliver() {
        System.out.print(riderName + " delevers #" + getId() + " delivery with his bike. The distance is (km)");
        System.out.printf("%.2f%n", getDistance());
    }
    public void printInfo(){
        System.out.print("Driver: " + riderName);
        System.out.printf(" - Distance: %.2f%n", getDistance());
    }
}