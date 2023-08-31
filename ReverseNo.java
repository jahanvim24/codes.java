import java.util.Scanner;
class ReverseNo {
    public static void main(String[] args) {
        System.out.println("Enter any number ");
        Scanner s=new Scanner(System.in);
        int n;
        int rev=0;
        n=s.nextInt();
        while(n>0){
            int a=n%10;
            rev=(rev*10)+a;
            n=n/10;
        }
        System.out.println("the number after reversing is "+rev);
    }
}
