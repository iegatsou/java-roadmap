package week03.day19.smartdevices;

public interface Rechargeable {
    void recharge();
    default void showStatus(){
        System.out.println("Rechargeable device");
    }

}
