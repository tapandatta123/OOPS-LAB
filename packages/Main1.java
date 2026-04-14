import student.Student;
import result.Result;
public class Main1{
 public static void main(String args[]){
  Student s = new Student("dona",90);
  Result r = new Result();
  r.calculateresult(s);
 }
}