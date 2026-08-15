package BossChallenge;

public class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;        
    }
    public Employee(String name){
        this(name, 1000);
        System.out.println("You did not give employee's salary, so it was to minimum 1000$.");
    }
    public Employee(double salary){
        this("Jane Doe", salary);
        System.out.println("You did not give employee's name, so it was to default 'John Doe'");    
    }
    public Employee(){
         this("Jane Doe", 1000);
         System.out.println("You did not give employee's name or salary, so they were set to default 'John Doe' and the minimum of 1000$.");    
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void work(){
        System.out.println(name + " is working.");
    }

}