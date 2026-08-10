package week03.day15;

public class Student {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println(name + " - " + grade);
    }
    public boolean hasPassed(){

            return grade>=50;

    }
}
