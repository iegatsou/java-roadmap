package week03.day17;


public class Classroom {
    private Student[] students;
    private static int classroomCounter = 0;

    public Classroom(int capacity) {

        this.students = new Student[capacity];
        classroomCounter++;
    }

    public boolean isArrayEmpty() {

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null)
                return false;
        }

        return true;
    }

    public boolean addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                this.students[i] = student;
                return true;
            }
        }
        return false;
    }

    public boolean removeStudent(String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getName().equalsIgnoreCase(name)) {
                students[i] = null;
                return true;
            }
        }
        return false;
    }
    public static int getClassroomCounter(){
        return classroomCounter;

    }

    public void printSummary() {
        if (isArrayEmpty()) {
            System.out.println("Classroom is empty.");
        } else {
            System.out.println("Students: ");
            printAllStudents();
            System.out.printf("Average: %.2f%n", calculateAverage());
            System.out.print("Top Student: ");
            findTopStudent().printInfo();
            System.out.print("Lowest Student: ");
            findLowestStudent().printInfo();
        }

    }

    public void printAllStudents() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) students[i].printInfo();
        }
    }


    public void printPassedStudents() {
        for (int i = 0; i < students.length; i++) {

            if (students[i] != null && students[i].hasPassed()) students[i].printInfo();
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                topStudent = students[i];
                index = i;
                break;
            }
        }
        if (topStudent == null) {
            return null;
        }
        for (int i = index + 1; i < students.length; i++) {
            if (students[i] != null && topStudent.getGrade() < students[i].getGrade()) {
                topStudent = students[i];
            }
        }


        return topStudent;
    }

    public Student findLowestStudent() {
        Student lowestStudent = null;
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                lowestStudent = students[i];
                index = i;
                break;
            }
        }
        if (lowestStudent == null) {
            return null;
        }
        for (int i = index + 1; i < students.length; i++) {
            if (students[i] != null && lowestStudent.getGrade() > students[i].getGrade()) {
                lowestStudent = students[i];
            }
        }


        return lowestStudent;
    }

    public Student findStudentByName(String name) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getName().equalsIgnoreCase(name)) {
                return students[i];
            }
        }
        return null;
    }


    public double calculateAverage() {
        int sum = 0;
        int studentCounter = 0;
        for (int i = 0; i < students.length; i++)
            if (students[i] != null) {
                sum += students[i].getGrade();
                studentCounter++;
            }
        if (studentCounter == 0) {
            return 0;
        }

        return (double) sum / studentCounter;
    }

}