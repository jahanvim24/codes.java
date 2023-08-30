import java.util.Scanner;
class Question13 {
    private int a;
    public void setA(int a){
        this.a=a;
    }
     public int getA(){
        return a;
    }
}
class A{
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("Enter a number ");
          int a;
          a=s.nextInt();
          Question13 q = new Question13();
          q.setA(a);
          System.out.println("The entered number is "+q.getA());
    }
}
