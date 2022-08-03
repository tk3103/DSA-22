import java.util.*;
class stack{
    private int top=-1;
    private int size;
    private int stack[];
    public stack(int size){
        this.size=size;
        stack=new int[size];
    }
    public void push(int x){
        if(isFull()){
            System.out.println("stack is full");
        }
        else{
            stack[++top]=x;
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        else{
            return stack[top--];
        }
        return 0;
    }
    public int peek(){
        return stack[top];
    }
    public boolean isFull(){
        return top==size-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
}
public class Stack_using_array {

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size : ");
        int size=sc.nextInt();
        stack st=new stack(size);
        st.push(14);
        st.push(12);
        st.push(10);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
    }
}
