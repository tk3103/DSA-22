import java.util.*;
class stack_arraylist{
   private java.util.ArrayList<Integer> l=new java.util.ArrayList<>();
    public void add(int x){
        l.add(x);
    }
    public int remove(){
        if(l.isEmpty()){
            System.out.println("arraylist is empty");
        }
        int ele=l.get(l.size()-1);
        l.remove(l.size()-1);
        return ele;
    }
    public boolean isempty(){
        return l.isEmpty();
    }
    public int peek(){
        if(isempty()){
            System.out.println("ArrayList is empty");
           
        }
        
            return l.get(l.size()-1);
        
    }
    public int size(){
        return l.size();
    }
    public void show(){
        if(l.isEmpty()){
            System.out.println("empty arrayList");
        }
        else{
            for(int x:l){
                System.out.print(x+",");
            }
        }
    }
}
public class stack_using_arraylist {
    public static void main(String[] args) {
        stack_arraylist st =new stack_arraylist();
        st.add(52);
        st.add(32);
        st.add(85);
        System.out.println(st.remove());
        System.out.println(st.isempty());
        System.out.println(st.peek());
        System.out.println(st.size());
        st.show();

    }
}
