package week04.day01;

public class ClassroomApp {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        Student anna = new Student("Anna", 85);
        Student maria = new Student("Maria", 92);
        Student john = new Student("John", 46);
        Student george = new Student("George", 38);

        classroom.addStudent(anna);
        classroom.addStudent(maria);
        classroom.addStudent(john);
        classroom.addStudent(george);


    }
}