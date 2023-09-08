class Complex{
  int real;
  int imag;
  public Complex(int r, int i){
    real = r;
    imag = i;
  }
  static Complex add(Complex ob1,Complex ob2){
      return new Complex (ob1.real - ob2.real,ob1.imag-ob2.imag);
  }
    public static void main(String []args){
    Complex ob1= new Complex(8,8);
    Complex ob2= new Complex(5,4);
    Complex ob3=Complex.add(ob1,ob2);
    System.out.println(ob3.real+"+"+ob3.imag+""+"i");
    
   }
}
