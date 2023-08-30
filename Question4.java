import java.util.Scanner;
class Question4 {
    public static void main(String[] args) {
        int a;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number ");
        a=s.nextInt();
        if(a%2==0){
            System.out.println("The number is even ");
        }
        else{
             System.out.println("The number is odd ");
        }
    }
}
