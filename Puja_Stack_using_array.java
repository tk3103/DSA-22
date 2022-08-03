import java.util.*;

class Stack{
    private int top=-1;
    private int size;
    private int[] stack;

    public Stack(int size){
        this.size=size;
        stack = new int[size];
    }

    public void push(int x){
        if(isFull()){
            System.out.println("stack overflow");
        }
        else{
            stack[++top]=x;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }
    
    public boolean isFull(){
        return top==size-1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("underflow");
        }
        for(int i=top;i>=0;i--){
           System.out.println(stack[i]);
        }
    }
}

public class StackDemo {
    public static void main(String[] args){
        Stack s = new Stack(6);
        System.out.println("popped element:"+s.pop());
        s.push(50);
        s.push(40);
        s.push(30);
        s.push(20);
        s.push(10);
        s.push(80);
        s.push(89);
        s.display();
        System.out.println("popped element:"+s.pop());
        System.out.println("peek element:"+s.peek());

    }
}
