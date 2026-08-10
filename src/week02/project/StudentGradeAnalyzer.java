package week02.project;

import java.util.Scanner;

public class StudentGradeAnalyzer {

    public static void showAllStudents(String[] students, int[] grades) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " - " + grades[i]);
        }
    }

    public static void showPassedStudents(String[] students, int[] grades) {
        System.out.println("Passed:");
        for (int i = 0; i < students.length; i++) {
            if (grades[i] >= 50)
                System.out.println(students[i] + " - " + grades[i]);
        }
    }

    public static void statistics(String[] students, int[] grades) {
        int passedCounter = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 50)
                passedCounter++;
        }
        System.out.println("Passed: " + passedCounter);
        System.out.println("Failed: " + (grades.length - passedCounter));
        System.out.println("Highest: " + (grades[findMaxGradeIndex(grades)]));
        System.out.println("Lowest: " + grades[findMinGradeIndex(grades)]);
        System.out.println("Average: " + showAverageGrade(grades));
    }

    public static double showAverageGrade(int[] grades) {

        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return (double) sum / grades.length;


    }

    public static int findPosition(int n, int grades[]) {
        for (int i = 0; i < grades.length; i++) {
            if (n == grades[i]) {
                return i;
            }
        }
        return -1;
    }


    public static int findMaxGradeIndex(int[] grades) {
        int maxGrade = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > maxGrade) {
                maxGrade = grades[i];
            }
        }
        return findPosition(maxGrade, grades);
    }


    public static int findMinGradeIndex(int[] grades) {
        int minGrade = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < minGrade) {
                minGrade = grades[i];
            }
        }
        return findPosition(minGrade, grades);
    }

    public static int searchStudent(Scanner scanner, String[] students) {
        System.out.print("Give student name: ");
        String student = scanner.nextLine();

        for (int i = 0; i < students.length; i++) {
            if (student.equalsIgnoreCase(students[i])) {
                return i;
            }
        }

        return -1;
    }

    public static void showMenu() {
        System.out.println("===== STUDENT GRADE ANALYZER =====");
        System.out.println("1. Show all students");
        System.out.println("2. Show average grade");
        System.out.println("3. Show highest grade");
        System.out.println("4. Show lowest grade");
        System.out.println("5. Search student");
        System.out.println("6. Show passed students");
        System.out.println("7. Statistics");
        System.out.println("0. Exit");
        System.out.print("Choose: ");
    }

    public static void main(String[] args) {
        String[] names = {"Anna", "John", "Maria", "George", "Helen"};
        int[] grades = {78, 45, 92, 67, 85};
        String choice = "-1";
        Scanner scanner = new Scanner(System.in);
        while (!choice.equals("0")) {


            showMenu();
            choice = scanner.nextLine();
            if (choice.equals("0")) {
                System.out.println("GoodBye!");
            } else if (choice.equals("1")) {
                showAllStudents(names, grades);
            } else if (choice.equals("2")) {
                double gradeAverage = showAverageGrade(grades);
                System.out.printf("Average grade: %.2f%n", gradeAverage);
            } else if (choice.equals("3")) {
                int gradeIndex = findMaxGradeIndex(grades);
                System.out.println("Highest Grade: " + names[gradeIndex] + " - " + grades[gradeIndex]);
            } else if (choice.equals("4")) {
                int gradeIndex = findMinGradeIndex(grades);
                System.out.println("Lowest Grade: " + names[gradeIndex] + " - " + grades[gradeIndex]);
            } else if (choice.equals("5")) {
                int studentIndex = searchStudent(scanner,names);
                if (studentIndex == -1) {
                    System.out.println("There is no student with that name.");
                } else {
                    System.out.println(names[studentIndex] + " - " + grades[studentIndex]);
                }
            } else if (choice.equals("6")) {
                showPassedStudents(names, grades);
            } else if (choice.equals("7")) {
                statistics(names,grades);
            }

        }
        scanner.close();
    }

}
