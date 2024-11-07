import java.util.Scanner;

public class string {
   public static void main(String[] args) {
   //  String s = new String("heelo my name is nitin");
   //  String s1 = new String("heelo my name is nitin");
   Scanner sc = new Scanner(System.in);
   String s = sc.nextLine();
   Str n = new Str(s);
   // n.m();
   n.reverse();
   sc.close();
   }
}
class Str{
   String str1;
   String str="";
   Str(String str1){
      this.str1=str1;
   }
   public void swap(char[] arr ,int Frist,int last){
         char temp = arr[Frist];
         arr[Frist] = arr[last];
         arr[last] = temp;
   }
   public void reverse(){
      int index = str1.length()-1;
      String rev = "";
      while(index>=0){
        rev = rev + str1.charAt(index);
        index--;
      }
      System.out.println("your rev is "+ rev);
   }
   public void reverse1(){
      char[] ch = str1.toCharArray();
      int i=0;
      int j=ch.length-1;
       while(i<j){
         char temp = ch[i];//n
         ch[i] = ch[j];//n
         ch[j] = temp;
         i++;
         j--;
       }
      System.out.println(new String(ch));
   }

}