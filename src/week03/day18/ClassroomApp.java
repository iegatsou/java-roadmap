package week03.day18;

public class ClassroomApp {
    public static void main(String[] args) {
//        Classroom classroom=new Classroom(5);
//        classroom.addStudent(new Student("Anna",78));
//        classroom.addStudent(new Student("John",45));
//        classroom.addStudent(new Student("Maria",92));
//        classroom.addStudent(new Student("Helen",85));
//        Student byName = classroom.findStudent("MaRia");
//        Student byGrade = classroom.findStudent(85);

//        if (byName != null) {
//            byName.printInfo();
//        }
//
//        if (byGrade != null) {
//            byGrade.printInfo();
//        }
//        Student byNameAndGrade=classroom.findStudent("MaRia", 93);
//        if (byNameAndGrade != null) {
//            byNameAndGrade.printInfo();
//        } else {
//            System.out.println("There is no such student");
//        }
        Student anna = new Student("Anna", 78);

        System.out.println(anna);
        System.out.println(anna.toString());

        String text = "Student: " + anna;
        System.out.println(text);


    }
}
