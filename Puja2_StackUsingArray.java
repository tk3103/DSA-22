import java.util.*;

class Stack {

    private int size;
    private int[] arr;
    private int top=-1;

    Stack(int size) {
        this.size=size;
        arr=new int[size];
    }

    public boolean isEmpty() {
        return top==-1;
    }

    public boolean isFull() {
        return top==size-1;
    }

    public void push(int element) {
        if(isFull()) {
            System.out.println("Stack Overflow");
        }
        else {
            arr[++top]=element;
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top];
    }
    public void display() {
        if(isEmpty()) {
            System.out.println("Stack Underflow");
        }
        for(int i=top;i>=0;i--) {
            System.out.print(arr[i]+" ");
        }
    }
}

public class Puja_StackUsingArray {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.print("\nEnter the size: ");
        int size=sn.nextInt();
        Stack stack=new Stack(size);
        int option=0;
        while(option!=7)
        {
            System.out.println("\n\nOPTIONS");
            System.out.println("\n1. isEmpty\n2. isFull\n3. Push\n4. Pop\n5. Peek\n6. Display\n7. EXIT\n");
            System.out.print("Enter your option: ");
            option=sn.nextInt();
            switch (option) {
                case 1:
                    System.out.println(stack.isEmpty());
                    break;
                case 2:
                    System.out.println(stack.isFull());
                    break;
                case 3:
                    System.out.print("\nEnter the element: ");
                    int element=sn.nextInt();
                    stack.push(element);
                    break;
                case 4:
                    System.out.println(stack.pop()+" is deleted\n");
                    break;
                case 5:
                    System.out.println(stack.peek()+" is the topmost element");
                    break;
                case 6:
                    System.out.print("\nThe elements are: ");
                    stack.display();
                    break;
                case 7:
                    System.out.println("\nEXIT\n");
                    break;
                default:
                    System.out.println("\nINVALID OPTION\n");
                    break;
            }
        }
        sn.close();
    }
}
