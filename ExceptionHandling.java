class Exe {
  static int age;
  @SuppressWarnings("static-access")
  Exe(int a){
    this.age= a;
  }
  static void msg() throws CreateException{
     if(age<18){
      throw new CreateException("age is under 18");
     }
    else{
      System.out.println("allowed ");
    }
  }
}
public class ExceptionHandling {
  public static void main(String[] args){
  @SuppressWarnings("unused")
  Exe n = new Exe(17);
  try {
    Exe.msg();
  }catch(CreateException e){
   System.out.println(" alert age in less then 18");
   System.out.println(e);
  }
}
}
