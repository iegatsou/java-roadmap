package week03.day18.BossChallenge;

public class Developer extends Employee {
    private String programmingLanguage;
    public Developer(String name,double salary, String programmingLanguage){
        super(name,salary);
        this.programmingLanguage=programmingLanguage;
    }
    public Developer(){
        super();
        this.programmingLanguage="Java";
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void work(){
        System.out.println(getName()+" is coding in Java");
    }
    public void debug(){
        System.out.println(getName()+" is debuging");
    }
}
