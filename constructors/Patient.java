class Person{
 String name;
 int age;
 Person(String name,int age){
  this.name= name;
  this.age=age;
 }
 void display(){
  System.out.println("name:"+name);
  System.out.println("age:"+age);
 }
}
class Doctor extends Person{
  String specialization;
   Doctor(String name,int age,String specialization){
    super(name,age);
    this.specialization=specialization;
   }
   void display(){
    super.display();
    System.out.println("specialization:"+specialization);}
}
public class Patient{
 public static void main(String args[]){
   Doctor d = new Doctor("dona",18,"mbbs");
   d.display();
 }
}