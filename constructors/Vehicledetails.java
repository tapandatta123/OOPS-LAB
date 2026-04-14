class Vehicle{
  int speed;
  Vehicle(int speed){
    this.speed=speed;
  }
}
class Bike extends Vehicle{
 int enginecapacity;
 Bike(int speed,int enginecapacity){
  super(speed);
  this.enginecapacity=enginecapacity;
 }
 void display(){
  System.out.println("speed:"+speed);
   System.out.println("enginecapacity:"+enginecapacity);}
}
public class Vehicledetails{
  public static void main(String args[]){
   Bike b = new Bike(3,6);
   b.display();
 
 }
}