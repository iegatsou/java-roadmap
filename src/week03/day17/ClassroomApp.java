package week03.day17;

public class ClassroomApp {
    public static void main(String[] args) {
        Classroom classroom = new Classroom(3);

        classroom.addStudent(new Student("Anna", 78));
        classroom.addStudent(new Student("John", 45));
        classroom.addStudent(new Student("Maria", 92));

        System.out.println(classroom.isArrayFull());

    }
}
