import java.util.Scanner;
class Question3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any two numbers ");
        a=s.nextInt();
        b=s.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println(" The numbers after swapping are "+a+ " and "+b);
        
    }
}
