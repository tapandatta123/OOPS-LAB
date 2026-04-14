class Shape{
  double length;
  double breadth;
  
  Shape(double length,double breadth){
   this.length = length;
   this.breadth = breadth;
  }
  void area(){
   System.out.println("calculating the shape of the area");}
}
class Rectangle extends Shape{
  Rectangle(double length,double breadth){
   super(length,breadth);
  }
 void area(){
   double result=length*breadth;
   System.out.println("area of rectangle :"+result);
 }
}
public class Areaofshapes{
 public static void main(String args []){
   Rectangle r = new Rectangle(3,5);
   r.area();
 }
}