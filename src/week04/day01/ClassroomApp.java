package week04.day01;

public class ClassroomApp {
    public static void main(String[] args) {
        Classroom classroom=new Classroom();
        classroom.addStudent(new Student("Anna", 85));
        classroom.addStudent(new Student("John", 46));
        classroom.addStudent(new Student("Maria", 92));
        classroom.addStudent(new Student("George", 38));
        classroom.addStudent(new Student("Helen", 70));

//        classroom.printAllStudents();
//        classroom.removeStudent("Anna");
//        classroom.printAllStudents();
//
//
//        System.out.println("===Find Student: Mary===");
//        Student foundStudent=classroom.findStudent("MARY");
//        if (foundStudent==null)
//            System.out.println("No student with that name!");
//        else foundStudent.printInfo();
//
//        System.out.println("===Average Grade===");
//        System.out.printf("Average: %.2f%n", classroom.calculateAverage());
//
//        System.out.println("===Top Student===");
//        classroom.findTopStudent().printInfo();
        int removed = classroom.removeStudentsBelowGrade(50);
        System.out.println("Remaining:");
        classroom.printAllStudents();
        System.out.println("Removed: " + removed);

    }
}