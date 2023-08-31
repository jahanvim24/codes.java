class BoxwithCons{
private int length;
private int breadth;
private int height;
BoxwithCons(int l,int b,int h){
length= l;
breadth= b;
height= h;

}
public void getDimension(){
System.out.println(length);
System.out.println(breadth);
System.out.println(height);
}
public static void main(String[] args) {
BoxwithCons b = new Box(10,20,30);
b.getDimension();
}
}
