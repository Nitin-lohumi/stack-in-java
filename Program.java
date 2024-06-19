abstract class A{
    public abstract void show();
    int a;
    A(int a){
        this.a= a;
    }
}
class C extends A{
    C(int a){
        super(a);
    }
   public void show(){
        System.out.println("this is abstarct method" +a);
    }
}
class Program {
    public static void main(String[] args) {
        C obj = new C(100);
        obj.show();
    }
}
