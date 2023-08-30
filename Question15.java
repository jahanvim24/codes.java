public class Question15{
   private String name;
   private int num;
   public void set(String name, int num){
       this.name=name;
       this.num=num;
   }
   public void get(){
      System.out.println(name);
      System.out.println(num);
   }
 public static void main(String [] args){
    Question15 d1= new Question15();
    Question15 d2= new Question15();
    d1.set("CSIT",240);
    System.out.println("The department and strength respectively is ");
    d1.get();
    d2.set("AIML",120);
    System.out.println("The department and strength respectively is ");
    d2.get();
 }
}
