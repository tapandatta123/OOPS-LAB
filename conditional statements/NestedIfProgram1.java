import java.util.Scanner;
public class NestedIfProgram1{
 public static void main(String args []){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter age:");
   int age = sc.nextInt();
   if (age > 0){
     if (age >= 18){
      System.out.println("Eligible to vote");
     }
   
     else {
       System.out.println("Not Eligible to vote");
     }
    
   }else {
     System.out.println("invalid age");
   }
   
 }
}