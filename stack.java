import java.util.*;
public class stack {
    Scanner io= new Scanner(System.in);
    int box[]= new int [5];
    int top;
    int item;
    stack(){
        top=-1;
    }
    void push(){
        if(top==4){
          System.out.println("overflow");
        }
        else{
            System.out.println("enter the items in stack");
            item= io.nextInt();
            top++;
            box[top]=item;
        }
    }
    void pop(){
    if(top<0){
        System.out.println("stack underflow");
    }
    else{
        top= top-1;
    }
    }
    void display(){
        if(top<0){
            System.out.println(" now  ! stack underflow");
        }
        else{
            for(int i=4; i>=0; i--){
                System.out.println(box[i]);
            }
        }
    }
}
