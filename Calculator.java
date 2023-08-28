public class Calculator{
   private int a;
   private int b;
  Calculator(int a,int b){
      this.a=a;
      this.b=b;
  }
  public int add(){
       return (a+b);
  }
  public int subtract(){
       return (a-b);
  }
  public int divide(){
       return (a/b);
  }
  public int multiply(){
       return (a*b);
  }
  public int modulus(){
       return (a%b);
  }
public static void main(String [] args){
    Calculator c = new Calculator(20,10);
    System.out.println("The sum is "+c.add());
    System.out.println("The sum is "+c.subtract());
    System.out.println("The sum is "+c.multiply());
    System.out.println("The sum is "+c.divide());
    System.out.println("The sum is "+c.modulus());
    
}
   
}
