import java.util.Scanner;
 public class Question14 {
    private int a;
    public void setA(int a){
        this.a=a;
    }
     public int getA(){
        return a;
    }
  public static void main(String[] args) {
          int a=5;
          Question14 q= new Question14();
          q.setA(a);
          System.out.println("The entered number is "+q.getA());
    }
}
