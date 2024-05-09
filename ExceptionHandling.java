class Exe {
  static int a=10;
  static int b=0;
  static void err() throws Exception{
    System.out.println("inside throws");
      a=a/b;
      throw new Exception("demo");
  }
}
public class ExceptionHandling {
  public static void main(String[] args){
  try {
    Exe.err(); 
  }catch (Exception e){ 
    System.out.println("cought again and again");
    System.out.println(e);
  }
}
}
