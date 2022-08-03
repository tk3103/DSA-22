import java.util.Scanner;
import java.util.ArrayList;

class Stack_using_ArrayList {

    ArrayList<Integer> list=new ArrayList<>();

    public void push(int element) {
        list.add(element);
    }

    public int pop() {
        if(list.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int element=list.get(list.size()-1);
        list.remove(list.size()-1);
        return element;
    }

    public int peek() {
        if(list.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return list.get(list.size()-1);
    }

    public void display() {
        if(list.isEmpty()) {
            System.out.println("Stack Underflow");
        }
        for(int i=list.size()-1;i>=0;i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
public class Puja_StackUsingArrayList {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        Stack_using_ArrayList stack=new Stack_using_ArrayList();
        int option=0;
        while(option!=5)
        {
            System.out.println("\n\nOPTIONS");
            System.out.println("\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. EXIT\n");
            System.out.print("Enter your option: ");
            option=sn.nextInt();
            switch (option) {
                case 1:
                    System.out.print("\nEnter the element: ");
                    int element=sn.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    System.out.println(stack.pop()+" is deleted\n");
                    break;
                case 3:
                    System.out.println(stack.peek()+" is the topmost element");
                    break;
                case 4:
                    System.out.print("\nThe elements are: ");
                    stack.display();
                    break;
                case 5:
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
