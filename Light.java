public class Light{

boolean isOn;
public void switchOn(){
isOn=true;
System.out.println(isOn);
}
public void switchOff(){
isOn=false;
System.out.println(isOn);
}
public static void main(String [] args){
Light led = new Light();
Light halogen = new Light();
led.switchOn();
led.switchOff();
halogen.switchOn();
halogen.switchOff();
System.out.println(led.isOn);
System.out.println(halogen.isOn);
}
}
