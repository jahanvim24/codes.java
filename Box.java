public class Box{
   private int height;
   private int length;
   private int breadth;
  
   public void set(int height,int length,int breadth){
      this.height=height;
      this.length=length;
      this.breadth=breadth;
  }
  public void get(){
     System.out.println(height);
     System.out.println(length);
     System.out.println(breadth);
     
  }
  public int volume(){
      return(length*breadth*height);
  }
public static void main(String [] args){
    Box cuboid1= new Box();
    cuboid1.set(10,20,30);
    System.out.println("The dimensions are  : ");
    cuboid1.get();
    System.out.println("The area of cuboid 1 is "+cuboid1.volume());
    
}
   
}
