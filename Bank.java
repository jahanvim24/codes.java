class Bank{
   private long ac;
   private double bal;
   public void withdraw(long ac,double j){
       this.ac=ac;
       if(bal>j){
           bal-=j;
           System.out.println("Rs "+j+" withdrawn from account no. " +ac+" successfully");
       }
   }
   public void deposit(long ac,double bal){
       this.ac=ac;
       this.bal=bal;
     System.out.println("Rs. " +bal+" deposited in account no. "+ac+" successfully");
   }
}
class Customer{
    public static void main(String [] args){
        Bank c= new Bank();
        c.deposit(1233454,50000);
        c.withdraw(653866,9000);
    }
}
