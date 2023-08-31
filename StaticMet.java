class StaticMet{
static int a;
static int b;
public static void set (int i,int j){
a=i;
b=j;
}
public static void swapno(){
int c=0;
c=a;
a=b;
b=c;

}
public static void main(String[] args) {
StaticMet.set(3,4);
StaticMet.swapno();
System.out.println("a= "+a);
System.out.println("b= "+b);

}
}
