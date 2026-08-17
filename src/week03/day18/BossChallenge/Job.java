package week03.day18.BossChallenge;

public class Job{

    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0]=new Employee("George");
        employees[1]=new Developer("Anna",1000,"Java");
        employees[2]=new Manager("Maria",1600, 5);
        employees[3]=new Developer("John",1200,"Python");



    }
}