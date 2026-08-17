package week03.day19.smartdevices;

public interface Trackable {
    void trackLocation();
    default void showStatus(){
        System.out.println("Trackable device");
    }
}
