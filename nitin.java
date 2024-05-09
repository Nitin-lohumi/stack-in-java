public class nitin {
    public static void main(String[] args) {
        stack s1 = new stack();
        System.out.println("adding ... element in stack ");
        for(int i=0; i<=4; i++){
            s1.push();
        }
        System.out.println();

        System.out.println("displaying stack");
        s1.display();

        System.out.println();
 
        System.out.println("delete elements from an stack ");
        for(int i=0; i<=4; i++){
           s1.pop();
        }

        System.out.println();
        
        s1.display();
    }
}
