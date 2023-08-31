import java.util.Scanner;
class  SumofNatural{
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter value of n` ");
        n = s.nextInt();
       for(int i=1;i<=n;i++){
           sum=sum+i;
       }
       System.out.println("The sum of natural numbers upto n is "+sum);
    }
}
