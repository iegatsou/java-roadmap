package week03.day17;

public class Classroom {
    private Student[] students;

    public Classroom(int capacity) {
        this.students = new Student[capacity];
    }

    public boolean addStudent(Student student){
        for(int i=0;i<students.length;i++){
            if(students[i]==null){
                this.students[i]=student;
                return true;
            }
        }
        return false;
    }

    public void printAllStudents() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) students[i].printInfo();
        }
    }

    public double calculateAverage() {
        int sum = 0;
        int studentCounter = 0;
        for (int i = 0; i < students.length; i++)
            if (students[i] != null) {
                sum += students[i].getGrade();
                studentCounter++;
            }

        return (double) sum / studentCounter;
    }

}

//
//public class Classroom {
//    private Student[] students;
//
//    public Classroom(int capacity) {
//        this.students = new Student[capacity];
//    }
//
//    public boolean addStudent(Student student){
//        for(int i=0;i<students.length;i++){
//            if(students[i]==null){
//                this.students[i]=student;
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean isArrayEmpty() {
//
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null)
//                return false;
//        }
//
//        return true;
//    }
//    public boolean isArrayFull() {
//
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] == null)
//                return false;
//        }
//
//        return true;
//    }
//
//    public void printAllStudents() {
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null) students[i].printInfo();
//        }
//    }
//
//    public void printPassedStudents() {
//        for (int i = 0; i < students.length; i++) {
//
//            if (students[i] != null && students[i].hasPassed()) students[i].printInfo();
//        }
//    }
//
//    public double calculateAverage() {
//        int sum = 0;
//        int studentCounter = 0;
//        for (int i = 0; i < students.length; i++)
//            if (students[i] != null) {
//                sum += students[i].getGrade();
//                studentCounter++;
//            }
//
//        return (double) sum / studentCounter;
//    }
//
//    public Student findTopStudent() {
//        Student topStudent = null;
//        int index = 0;
//
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] == null) {
//                continue;
//            } else {
//                topStudent = students[i];
//                index = i;
//                break;
//            }
//        }
//        for (int i = index + 1; i < students.length; i++) {
//            if (students[i] != null && students[i].getGrade() > topStudent.getGrade())
//                topStudent = students[i];
//        }
//
//        return topStudent;
//    }
//
//    public Student findLowestStudent() {
//        Student bottomStudent = null;
//        int index = 0;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] == null) {
//                continue;
//            } else {
//                bottomStudent = students[i];
//                index = i;
//                break;
//            }
//        }
//        for (int i = index + 1; i < students.length; i++) {
//            if (students[i] != null && students[i].getGrade() < bottomStudent.getGrade())
//                bottomStudent = students[i];
//        }
//        return bottomStudent;
//    }
//
//    public Student findStudentByName(String name) {
//
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] != null && name.equalsIgnoreCase(students[i].getName())) {
//                return students[i];
//            }
//        }
//        return null;
//    }
//}
