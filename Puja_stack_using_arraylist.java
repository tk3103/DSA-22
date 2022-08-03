import java.util.*;

class stack{
    ArrayList<Integer> l = new ArrayList<>();

    public void push(int x){
        l.add(x);
    }

    public int pop(){
        if(l.isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        int el = l.get(l.size()-1);
        l.remove(l.size()-1);
        return el;
    }

    public int peek(){
        if(l.isEmpty()){
            System.out.println("underflow");
            return -1;
        }
        return l.get(l.size()-1);
    }
    
    public void display(){
        if(l.isEmpty()){
            System.out.println("underflow");
        }
        for(int i=l.size()-1;i>=0;i--){
            System.out.println(l.get(i));
        }
    }


}
public class stack_using_ArrayList {
    public static void main(String[] args){
        stack s = new stack();
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
