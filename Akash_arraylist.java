import java.util.*;

class stackusingarraylist{
    ArrayList<Integer> list=new ArrayList<>();
    public int size(){
        return list.size();
    }

    public void push(int element){
        list.add(element);
    }

    public int pop(){
        if(list.isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        list.remove(list.size()-1);
        return list.get(list.size()-1);
    }
    public int peek(){
        if(list.isEmpty()){
            System.out.println("stack is empty.");
            return -1;
        }
        return list.get(list.size()-1);
    }
    public void display(){
        if(list.isEmpty()){
            System.out.println("stack is empty.");
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
public class Akash_arraylist {
    public static void main(String []args){
    stackusingarraylist s=new stackusingarraylist();
    s.push(10);
    s.push(20);
    s.push(50);
    s.pop();
    s.display();
    System.out.println(s.size());
    System.out.println(s.peek());

    }
}