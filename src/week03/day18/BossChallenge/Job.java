package week03.day18.BossChallenge;

public class Job {
    public static Employee findHighestPaid(Employee[] employees){
        Employee highestPaidEmployee=null;
        int index=0;
        for (int i=0;i<employees.length;i++){
            if(employees[i]!=null){
                highestPaidEmployee=employees[i];
                index=i;
                break;
            }
        }
        if(highestPaidEmployee==null) return null;
        for (int i=index+1; i< employees.length; i++){
            if(employees[i]!=null && employees[i].getSalary()>highestPaidEmployee.getSalary()){
                highestPaidEmployee=employees[i];
            }
        }
        return highestPaidEmployee;
    }
    public static int countDevelopers(Employee[] employees){
        int devCounter=0;
        for (int i=0; i<employees.length; i++){
            if (employees[i] instanceof Developer)
                devCounter++;
        }
        return devCounter;
    }
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new Employee("George", 1500);
        employees[1] = new Developer("Anna", 2200, "Java");
        employees[2] = new Manager("Maria", 3000, 5);
        employees[3] = new Developer("John", 2500, "Python");

        for (int i = 0; i < employees.length; i++) {
            employees[i].work();
        }
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] instanceof Developer) ((Developer) employees[i]).debug();
            else if (employees[i] instanceof Manager) ((Manager) employees[i]).holdMeeting();
            else System.out.println("General employee.");
        }
        Employee highest=findHighestPaid(employees);
        if (highest!=null) {
            System.out.println("Highest paid: ");
            highest.work();
        }

        System.out.println("In this company work " + countDevelopers(employees) + " Developers");

    }
}