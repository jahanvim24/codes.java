//this is a program for unboxing
public class WrapperClass2
{
	public static void main(String[] args) {
    Float a = new Float(43.8F);
    float i = a.floatValue();
    float j = a;
    System.out.println(a+" "+i+" "+j);
    Integer b = new Integer(43);
    int k = b.intValue();
    int l = b;
    System.out.println(b+" "+k+" "+l);
    Character c = new Character('a');
    char m = c.charValue();
    char n = c;
    System.out.println(c+" "+m+" "+n);
    
    
    }
}
