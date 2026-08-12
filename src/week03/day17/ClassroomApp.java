package week03.day17;

public class ClassroomApp {
    public static void main(String[] args) {
        System.out.println(Classroom.getClassroomCounter());

        Classroom a = new Classroom(5);
        Classroom b = new Classroom(10);
        Classroom c = new Classroom(20);

        System.out.println(Classroom.getClassroomCounter());

    }
}
