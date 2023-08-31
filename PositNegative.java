import java.util.Scanner;
class PositNegative {
    public static void main(String[] args) {
        int a;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number ");
        a = s.nextInt();
        if(a>0){
            System.out.println("The number is positive ");
        }
        else{
             System.out.println("The number is negative ");
        }
    }
}
