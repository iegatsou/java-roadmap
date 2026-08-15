package week03.day18;

public class Person {

private String name;

public Person (String name){
    this.name=name;
}
public Person (){
    this.name="Unknown";
}

public void introduce(){
    System.out.println("Hello, I am " + name);
}

public String getName(){
    return name;
}
    
}