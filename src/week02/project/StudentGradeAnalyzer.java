package week02.project;

import java.util.Scanner;

public class StudentGradeAnalyzer {

public static void showAllStudents(String[] students,int[] grades){
    for(int i=0; i<students.length; i++){
        System.out.println(students[i]+" - "+grades[i]);
    }
}

public static void showAverageGrade(int[] grades){
    double gradeAverage=0;
    int sum=0;
    for(int i=0;i<grades.length;i++){
        sum+=grades[i];
    }
    gradeAverage=(double)sum/grades.length;
    System.out.printf("Average grade: %.2f%n", gradeAverage);

}
public static int findPosition(int n, int grades[]) {
        for (int i = 0; i < grades.length; i++) {
            if (n == grades[i]) {
                return i;
            }
        }
        return -1;
    }
public static int findPosition(String student, String students[]) {
        for (int i = 0; i < students.length; i++) {
            if (student.equals(students[i])) {
                return i;
            }
        }
        return -1;
    }
public static void showMaxGrade(String[] students,int[] grades){
    int max=grades[0];
    for (int i=1;i<grades.length;i++){
        if (grades[i]>max) {
            max=grades[i];            
        }
    }
    int maxIndex=findPosition(max, grades);
    System.out.println("Highest Grade: "+students[maxIndex]+" - "+grades[maxIndex]);

}

public static void searchStudent(String[] students){
    Scanner scanner=new Scanner(System.in);
    String student="";
    System.out.println("Give student name: ");
    student=scanner.nextLine();
    String studentLowerCase=student.toLowerCase();
    for(int i=0;i<students.length;i++){
        if(studentLowerCase.equals(students[i].toLowerCase())){
            int studentIndex=findPosition(student, students)
           System.out.println("");
           break; 
        }
    }

}
public static void showMinGrade(String[] students,int[] grades){
    int min=grades[0];
    for (int i=1;i<grades.length;i++){
        if (grades[i]<min) {
            min=grades[i];            
        }
    }
    int minIndex=findPosition(min, grades);
    System.out.println("Highest Grade: "+students[minIndex]+" - "+grades[minIndex]);

}

public static void showMenu(){
    
    
    System.out.println("===== STUDENT GRADE ANALYZER =====");
    System.out.println("1. Show all students");
    System.out.println("2. Show average grade");
    System.out.println("3. Show highest grade");
    System.out.println("4. Show lowest grade");
    System.out.println("5. Search student");
    System.out.println("6. Show passed students");
    System.out.println("0. Exit");
    System.out.print("Choose: ");
    
    
    
}

public static void main(String[] args) {
    String[] names = {"Anna", "John", "Maria", "George", "Helen"};
    int[] grades = {78, 45, 92, 67, 85};
    int choice=-1;
    Scanner scanner=new Scanner(System.in);
    while (choice!=0) {
        
    
    
    showMenu();
    choice=scanner.nextInt();
    
    if (choice==1){
        showAllStudents(names, grades);}
    else if(choice==2){
        showAverageGrade(grades);
    }
    else if(choice==3){
        showMaxGrade(names, grades);
    }
    else if(choice==4){
        showMinGrade(names, grades);
    }
    
     }
    scanner.close();
}

}
