package week03.day16;


public class ClassroomApp {
    public static boolean isArrayEmpty(Student[] students) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null)
                return false;
        }

        return true;
    }

    public static void printAllStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) students[i].printInfo();
        }
    }

    public static void printPassedStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {

            if (students[i] != null && students[i].hasPassed()) students[i].printInfo();
        }
    }

    public static double calculateAverage(Student[] students) {
        int sum = 0;
        int studentCounter = 0;
        for (int i = 0; i < students.length; i++)
            if (students[i] != null) {

                sum += students[i].getGrade();
                studentCounter++;
            }

        return (double) sum / studentCounter;
    }

    public static Student findTopStudent(Student[] students) {
        Student topStudent = null;
        int index = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            } else {
                topStudent = students[i];
                index = i;
                break;
            }
        }
        for (int i = index+1; i < students.length; i++) {
            if (students[i] != null && students[i].getGrade() > topStudent.getGrade())
                topStudent = students[i];
        }

        return topStudent;
    }

    public static Student findLowestStudent(Student[] students) {
        Student bottomStudent = null;
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            } else {
                bottomStudent = students[i];
                index = i;
                break;
            }
        }
        for (int i = index+1; i < students.length; i++) {
            if (students[i] != null && students[i].getGrade() < bottomStudent.getGrade()) bottomStudent = students[i];
        }
        return bottomStudent;
    }

    public static Student findStudentByName(Student[] students, String name) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && name.equalsIgnoreCase(students[i].getName())) {
                return students[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
//        students[0] = new Student("Anna", 78);
        students[1] = new Student("John", 45);
//        students[2] = new Student("Maria", 92);
//        students[3] = new Student("George", 67);
        students[4] = new Student("Helen", 85);
        if (isArrayEmpty(students)) {
            System.out.println("Empty Array. Cannot retrieve Data!");
        } else {

            printAllStudents(students);
            System.out.println("---------");
            System.out.println("Passed Students:");
            printPassedStudents(students);
            System.out.println("---------");
            double gradesAverage = calculateAverage(students);
            System.out.printf("Average Grade: %.2f%n", gradesAverage);
            System.out.println("---------");
            Student topStudent = findTopStudent(students);
            System.out.print("Top Student: ");
            topStudent.printInfo();
            System.out.println("---------");
            Student bottomStudent = findLowestStudent(students);
            System.out.print("Bottom Student: ");
            bottomStudent.printInfo();
            System.out.println("---------");
            Student found = findStudentByName(students, "Nick");
            if (found != null) {
                found.printInfo();
            } else {
                System.out.println("Student not found.");
            }
        }

    }
}
