import java.util.Scanner;
public class SwitchCaseProgram1{
 public static void main(String args []){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter age:");
   int age = sc.nextInt();
   int category;
   if (age <= 0)
      category  = 0;
   else if ( age < 18) 
      category = 1;
   else 
      category = 2;
   switch (category){
     case 0 :
       System.out.println("Invalid age");
       break;
     case 1:
       System.out.println("Not eligible to vote");
       break;
     case 2:
       System.out.println("Eligible to vote");
       break;
     default:
       System.out.println("InVaild input");
   }   
 }
}