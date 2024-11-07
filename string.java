import java.lang.reflect.Array;

public class string {
   public static void main(String[] args) {
   //  String s = new String("heelo my name is nitin");
   //  String s1 = new String("heelo my name is nitin");
   Str n = new Str("abcdef");
   // n.m();
   n.reverse1();
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
      char[] arr = str1.toCharArray();
      int i=0;
      int j = arr.length-1;
       while(i<j) {
         swap(arr,i,j);
         i++;
         j--;
      }
      System.out.println(new String(arr));
   }
   public void reverse1(){
      char str; String nstr="";
      System.out.println(str1.length());
     for (int j=0; j<str1.length(); j++) {
        str = str1.charAt(j);
        nstr=str+nstr;
     }
      System.out.println(nstr);
   }

}