package week03.day18;

public class Student2 extends Person{
    private int grade;

    public Student2(String name, int grade){
        super(name);
        if(grade>=0) this.grade=grade;
        else System.out.println("Cannot set negative grade. Grade set to zero");
    }
    public Student2(String name){
        this(name,0);
    }
    public Student2(int grade){
        this("Unknown",grade);
    }
    public Student2(){
        this("Unknown",0);
    }
    public void introduce(){
        System.out.println("I am " + getName() + " and my grade is "+grade);
    }
    public int getGrade(){
        return grade;
    }
    public void study(){
        System.out.println("I am a student thus I study");
    }

    }




