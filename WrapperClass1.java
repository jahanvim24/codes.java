//this is a program for wrapper class 
public class WrapperClass1
{
	public static void main(String[] args) {
	System.out.println("For integer ");
	int a =20;
	Integer i = Integer.valueOf(a);
	Integer j =a;
	System.out.println(a+" "+i+" "+j+"\n");
	System.out.println("For double ");
	double b = 45.777D;
	Double k = Double.valueOf(b);
	Double l =b;
	System.out.println(b+" "+k+" "+l+"\n");
	System.out.println("For character ");
	char c = 'j';
	Character m = Character.valueOf(c);
    Character n =c;
	System.out.println(c+" "+m+" "+n+"\n");
	System.out.println("For float ");
	float d = 52.0F;
	Float o = Float.valueOf(d);
    Float p =d;
	System.out.println(d+" "+o+" "+p+"\n");
	}
}
