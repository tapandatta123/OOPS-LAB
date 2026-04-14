class Employee{
 String name;
 double salary;
 Employee(String name,double salary){
  this.name=name;
  this.salary=salary;
 }
 void displaydetails(){
  System.out.println("enter the name:"+name);
  System.out.println("enter the salary:"+salary);
 }
}
class Manager extends Employee{
 int teamsize;
 Manager(String name,double salary,int teamsize){
  super(name,salary);
  this.teamsize=teamsize;
 }
 void displaydetails(){
  super.displaydetails();
  System.out.println("enter the teamsize :"+teamsize);
 }
}
class Projectmanager extends Manager  {
 String projectname;
  Projectmanager(String name,double salary,int teamsize,String projectname){
  super(name,salary,teamsize);
  this.projectname=projectname;
  }
 void displaydetails(){
  super.displaydetails();
  System.out.println("enter the projectname:"+projectname);
 }
}
public class Empdetail{
 public static void main (String args[]){
   Projectmanager  p = new Projectmanager("dona",99795,4,"arsfcj");
   p.displaydetails();
 }
}