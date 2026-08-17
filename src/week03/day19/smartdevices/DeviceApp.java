package week03.day19.smartdevices;


public class DeviceApp {
    public static int countTrackable(Device[] devices) {
        int trackableCounter = 0;
        for (Device device : devices) {
            if (device instanceof Trackable)
                trackableCounter++;
        }
        return trackableCounter;
    }

    static void main() {
//        Device[] devices = new Device[4];
//        devices[0] = new Laptop("Toshiba", "Satellite Pro C50");
//        devices[1] = new SmartPhone("Xiaomi", "Redmi Note 10");
//        devices[2] = new SmartWatch("Huawei", "GT 5");
//        devices[3] = new Laptop("HP", "ProBook 640 G4");
//
//        for (Device device : devices) {
//            if (device != null) {
//                device.printInfo();
//                device.turnOn();
//            }
//        }
//        for (Device device : devices) {
//
//            if (device instanceof Rechargeable)
//                ((Rechargeable) device).recharge();
//            if (device instanceof Trackable)
//                ((Trackable) device).trackLocation();
//        }
//        System.out.println("Number of trackable devices: " + countTrackable(devices));

        SmartPhone phone = new SmartPhone("Xiaomi", "Redmi Note 10");
        SmartWatch watch = new SmartWatch("Huawei", "GT 5");

        phone.showStatus();
        watch.showStatus();
    }
}
