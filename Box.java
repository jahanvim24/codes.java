public class Box{
   private int height;
   private int length;
   private int breadth;
  Box(){
      height=0;
      length=0;
      breadth=0;
  }
  Box(int height,int length,int breadth){
      this.height=height;
      this.length=length;
      this.breadth=breadth;
  }
  public int volume(){
      return(length*breadth*height);
  }
public static void main(String [] args){
    Box cuboid1= new Box();
    System.out.println("The area of cuboid 1 is "+cuboid1.volume());
    Box cuboid2 = new Box(10,15,20);
    System.out.println("The area of cuboid 2 is "+cuboid2.volume());
}
   
}
