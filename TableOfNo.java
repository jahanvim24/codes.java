import java.util.Scanner;
class TableOfNo {
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number` ");
        n = s.nextInt();
        System.out.println("The table of number is ");
       for(int i=1;i<=10;i++){
        System.out.println(+n+" * "+i+" = "+(n*i));
       }
    }
}
