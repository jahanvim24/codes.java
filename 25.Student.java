//this is the demonstration of toString() method 
public class Student{
    private String name;
    private int rollno;
    private String department;
    //these are class variables or instance variables 
    Student(String name, int rollno, String department){
       //these are local variables 
        this.name=name;
        this.rollno=rollno;
        this.department =department;
    }
    public String toString(){
        return name+" "+rollno+" "+department;
    }
public static void main(String [] args){
    Student s1 = new Student("Jahanvi ",69,"CSIT");
    Student s2 = new Student("Ram ",98,"CSIT");
    System.out.println(s1);
    System.out.println(s2);
    }
}
