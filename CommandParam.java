public class CommandParam {
     static float s=0F;
    public static void main(String args[]) {
        System.out.println(args.length);
       for(int i=0;i<args.length;i++){
           s=s+Float.parseFloat(args[i]);
       }
       System.out.println("the sum is "+s);
     
    }
}
