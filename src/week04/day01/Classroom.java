package week04.day01;

import java.util.ArrayList;
import java.util.Iterator;

public class Classroom {
    private ArrayList<Student> students;


    public Classroom() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }

    public boolean removeStudent(String name) {
        Student student = findStudent(name);

        if (student == null) {
            return false;
        }

        return students.remove(student);
    }

    public int removeStudentsBelowGrade (int minimumGrade){
        int removedStudentsCounter=0;
        Iterator<Student> iterator= students.iterator();
        while (iterator.hasNext()){
            Student nextStudent=iterator.next();
            if (nextStudent.getGrade()<minimumGrade){
                iterator.remove();
                removedStudentsCounter++;
            }
        }
        return removedStudentsCounter;
    }

    public Student findStudent(String name) {

        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public double calculateAverage() {
        if (students.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (Student student : students) {
            sum += student.getGrade();
        }

        return sum / students.size();
    }

    public Student findTopStudent() {
        Student topStudent=null;
        for (Student student : students) {
            if (topStudent == null || topStudent.getGrade() < student.getGrade()) {
                topStudent = student;
            }
        }
        return topStudent;
    }

    public void printAllStudents() {
        System.out.println("===All Students===");
        for (Student student : students) {
            student.printInfo();
        }
    }
}