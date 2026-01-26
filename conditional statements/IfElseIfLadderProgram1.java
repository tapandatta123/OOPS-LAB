import java.util.Scanner;
public class IfElseIfLadderProgram1{
 public static void main(String args []){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter age:");
   int age = sc.nextInt();
   if (age < 0){
      System.out.println("Invalid age");
   }
   
   else if ( age < 18) {
    System.out.println("Not Eligible to vote");
   }
    
   else {
     System.out.println("Eligible to vote");
   }
   
 }
}