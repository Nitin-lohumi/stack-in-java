public class string {
   public static void main(String[] args) {
   //  String s = new String("heelo my name is nitin");
   //  String s1 = new String("heelo my name is nitin");
   Str n = new Str("nitin", "helo");
   n.m();
   n.replace();
   n.print();
   }
}

class Str{
   String str1;
   String str2;
   String str;
   Str(String str1,String str2){
      this.str1=str1;
      this.str2= str2;
   }
   void m(){
      System.out.println("charAt" +str1.charAt(0));
      System.out.println("substring "+str1.substring(0,2));
      if(str1.equals(str2)){
      System.out.println("both string are equals");
      }
      else{
        try {
         throw new Exception(str1);
      } catch (Exception e) {
       System.out.println("not same string");
      }
      }
   }
   void print(){
      System.out.println("printing.....");
      System.out.println(str1);
      System.out.println(str2);
   }
   void replace(){
      // System.out.println("replace "+str1.replace('n','t'));
    try{
      for(int i=0; i<str1.length(); i++){
      str = str1.replace(str1.charAt(i),str2.charAt(i+1));
         for(int j =0; j<str1.length(); j++){
            System.out.println(str.replace(str.charAt(j),str2.charAt(j)));
         }
        }
        throw new Exception();
    }catch(Exception e){
      System.out.println("handle the error");
    }
   }

}