 package week03.day18;

public class UniversityStudent extends Student2{
    private String university;

    public UniversityStudent(String name, int grade, String university){
        super(name, grade);
        this.university=university;
    }
    public UniversityStudent(String name, int grade){
        this(name, grade, "John Doe University");
    }
    public UniversityStudent(int grade, String university){
        this("Unknown", grade, university);
    }
    public UniversityStudent(String name,String university){
        this(name, 0, university);
    }
    public UniversityStudent(String name){
        
        this(name, 0, "John Doe University");
    }
    public UniversityStudent(int grade){
        this("Unknown", grade, "John Doe University");
    }
    
    public UniversityStudent(){
        this("Unkown", 0, "John Doe University");
    }
    public void introduce(){
        System.out.println("I am "+getName()+", my grade is "+getGrade()+" and I Study at "+university);

    }
    public void attendLecture(){
        System.out.println("I am a university student thus I attend lectures");
    }
}