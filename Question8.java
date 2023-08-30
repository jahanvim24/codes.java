import java.util.Scanner;
class Question8 {
    public static void main(String[] args) {
        int n;
        int f=1;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number` ");
        n = s.nextInt();
       for(int i=1;i<=n;i++){
           f=f*i;
       }
       System.out.println("The factorial of number is "+f);
    }
}
