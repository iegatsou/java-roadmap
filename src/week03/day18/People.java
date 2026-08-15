package week03.day18;

public class People {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0]=new Person("Kostas");
        people[1]=new Student2("Ifigenia",100);
        people[2]=new UniversityStudent("Danai",95,"AUTH");
        people[3]=new Person();
        
        
        for(int i=0;i<people.length;i++){
            people[i].introduce();
        }
    
        for(int i=0;i<people.length;i++){
            if (people[i] instanceof UniversityStudent) {
                UniversityStudent uS=(UniversityStudent) people[i];
                uS.study();
                uS.attendLecture();
                
            } else if (people[i] instanceof Student2) {
                Student2 s=(Student2) people[i];
                s.study();
            } else {
                System.out.println("I am neither a Student, nor a University Student.");
            }
            
        }
    
}
}