import java.util.Scanner;
class Alphabet {
    public static void main(String[] args) {
        char ch;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a alphabet ");
        ch = s.next().charAt(0);
        if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            System.out.println("The alphabet is vowel ");
        }
        else{
             System.out.println("The alphabet is consonant  ");
        }
    }
}
