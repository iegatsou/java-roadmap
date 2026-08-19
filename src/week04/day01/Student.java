package week04.day01;


public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public Student(String name) {

        this(name, 0);
    }

    public Student(int grade) {
        this("Unknown", grade);
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void printInfo() {

        System.out.println(name + " - " + grade);
    }

}




