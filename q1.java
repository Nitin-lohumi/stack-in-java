 class sup{
  final int age;
sup(int a, int b){
  this.age=a;
}
final void main(){
  System.out.println("this is main method inside in super class");
}
}
class sub extends sup{
  int c;
 void show(){
    System.out.println("this is a abstract class ");
  }
void display(){
  System.out.println("this is method is out side the abstact class");
}
sub(int a, int b, int c){
super(a, b);
this.c= c;
}
// void main(){
//   System.out.println("this is main method ");// error we can't intislize the method in
//which delcared by final keyword
// }
}
public class q1 {
  public static void main(String[] args) {
   sub s= new sub(10,21,32);
   System.out.println(s.age);
   }
}