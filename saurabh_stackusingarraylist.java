import java.util.ArrayList;

class stackusingarraylist{
    ArrayList<Integer> list=new ArrayList<>();

    public void push(int el){
        list.add(el);
    }
    public int size(){
        return list.size();
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
public class saurabh_stackusingarraylist {
    public static void main(String []args){
    stackusingarraylist s=new stackusingarraylist();
    //add
    s.push(4);
    s.push(2);
    s.push(5);
    s.push(8);

    //display
    s.display();
    
    //remove
    s.pop();

    //size
    System.out.println(s.size());

    //peek
    System.out.println(s.peek());

    }
}
