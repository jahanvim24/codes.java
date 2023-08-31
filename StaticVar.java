class StaticVar{
static int count;
StaticVar(){
count++;
}

public static void main(String [] args){
StaticVar s1 = new StaticVar();
StaticVar S2 = new StaticVar();
System.out.println(count);
}
}
