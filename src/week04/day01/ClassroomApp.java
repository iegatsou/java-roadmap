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

        Student annaCopy = new Student("ANNA", 85);
        System.out.println(anna == annaCopy);
        System.out.println(anna.equals(annaCopy));
        System.out.println(classroom.containsStudent(annaCopy));
        System.out.println(classroom.countStudentsAboveGrade(80) + " students above 80.");
        classroom.removeStudentsBelowGrade(50);
        classroom.printAllStudents();

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
//        int removed = classroom.removeStudentsBelowGrade(50);
//        System.out.println("Remaining:");
//        classroom.printAllStudents();
//        System.out.println("Removed: " + removed);

    }
}