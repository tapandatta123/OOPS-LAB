class User{
 String name;
 User(String name){
  this.name=name;
 }
 void showuser(){
  System.out.println("name of user:"+name);
 }
}
class Movie{
 String movie;
 Movie(String movie){
  this.movie=movie;
 }
 void showmovie(){
  System.out.println("movie"+movie);
 }
}
class Subscription{
 String type;
 Subscription(String type){
  this.type=type;
 }
  void showsubscription(){
   System.out.println("subscitption:"+type);
  }
}
public class Movieonline{
 public static void main(String args[]){
   User u = new User("dona");
    Movie m = new Movie("DJ");
    Subscription s = new Subscription("netflix");
    u.showuser();
    m.showmovie();
    s.showsubscription();
  }
}
