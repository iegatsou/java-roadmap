package week04.day01;
import java.util.Objects;
import java.util.Locale;



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
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Student s)
            if (this.name.equalsIgnoreCase(s.name) && this.grade==s.grade)
                return true;
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase(Locale.ROOT), grade);
    }
}