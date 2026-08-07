package week01.day05;

public class GreetingDemo {

    public static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }
    public static void sayGoodbye(String name) {
        System.out.println("Goodbye " + name + "!");
    }

    public static void main(String[] args) {
            greet("Danae");
            greet("George");
            greet("Nikol");
            sayGoodbye("Danae");


    }
}