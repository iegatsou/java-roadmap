package week03.day15;

public class StudentApp {
    public static void main(String[] args) {
        Student anna = new Student("Anna", 78);
        Student john = new Student("John", 45);
        Student maria = new Student("Maria", 92);
        anna.printInfo();
        System.out.println("Passed: " + anna.hasPassed());
        john.printInfo();
        System.out.println("Passed: " + john.hasPassed());
        maria.printInfo();
        System.out.println("Passed: " + maria.hasPassed());
    }
}
