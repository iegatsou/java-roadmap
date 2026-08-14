package week03.day18;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        if (grade >= 0) this.grade = grade;
        else System.out.println("Cannot set negative grade. Grade set to zero");
    }

    public Student(String name) {

        this(name, 0);
    }

    public Student() {
        this("Unknown");
    }
    public String toString() {
        return "HELLO";
    }
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void printInfo() {
        System.out.println(name + " - " + grade);
    }

    public boolean hasPassed() {

        return grade >= 50;

    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
