package week03.day21;

public abstract class Delivery {
    private int id;
    private double distance;
    private static int deliveriesCounter = 0;

    public Delivery(double distance) {
        deliveriesCounter++;
        this.id = deliveriesCounter; // I believe id should be unique and not set by user
        if (distance <= 0) {
            this.distance = 1;
            System.out.println("Distance cannot be less or equal to zero. Set at default 1km.");
        } else this.distance = distance;
    }

    public int getId() {
        return id;
    }

    public static int getDeliveriesCounter() {
        return deliveriesCounter; // returns how many Delivery Objects were created
    }

    public double getDistance() {
        return distance;
    }

    public abstract void deliver();
    public abstract void printInfo();
}
