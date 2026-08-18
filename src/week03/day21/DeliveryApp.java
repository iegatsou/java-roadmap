package week03.day21;

public class DeliveryApp {
    public static Delivery findLongestDelivery(Delivery[] deliveries) {
        Delivery longestDistance = null;
        for (int i = 0; i < deliveries.length; i++) {
            if (deliveries[i] != null && (longestDistance == null || deliveries[i].getDistance() > longestDistance.getDistance())) {
                longestDistance = deliveries[i];
            }
        }
        return longestDistance;
    }

    public static double calculateAverageDistance(Delivery[] deliveries) {
        double sum = 0;
        int nonNullCounter = 0;
        for (int i = 0; i < deliveries.length; i++) {
            if (deliveries[i] != null) {
                nonNullCounter++;
                sum += deliveries[i].getDistance();
            }
        }

        if (nonNullCounter == 0)
            return 0;
        else return sum / nonNullCounter;
    }

    static void main() {
        Delivery[] deliveries = new Delivery[6];
        deliveries[0] = new BikeDelivery("Nikos", 17.4);
        deliveries[1] = new VanDelivery("Kostas", 12.5, 500);
        deliveries[2] = null;
        deliveries[3] = new BikeDelivery("Danai", 5.3);
        deliveries[4] = new VanDelivery("Dimitra", 350.5, 1000);
        deliveries[5] = null;

        for (int i = 0; i < deliveries.length; i++) {
            if (deliveries[i] != null) {
                deliveries[i].deliver();
            }
        }
        for (int i = 0; i < deliveries.length; i++) {
            if (deliveries[i] instanceof Trackable)
                ((Trackable) deliveries[i]).track();
        }
        Delivery longest=findLongestDelivery(deliveries);
        if (longest==null)
            System.out.println("Empty Array");
        else {
            System.out.println("===Longest Distance===");
            longest.printInfo();
        }

        System.out.println("===Average Distance===");
        System.out.printf("Distance Delivery Average: (km)%.2f%n",calculateAverageDistance(deliveries));

    }
}
