package week03.day18.BossChallenge;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this(name, 1000);
    }

    public Employee(double salary) {
        this("Jane Doe", salary);
    }

    public Employee() {
        this("Jane Doe", 1000);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void work() {
        System.out.println(name + " is working.");
    }
}