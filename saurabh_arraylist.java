import java.util.*;
class arraylist{
    private int c=-1;
    private int a[]=new int[2];
    public void add(int element){
        if(c==a.length-1){
            int[] a1=new int[2*a.length];
            for(int i=0;i<a.length;i++){
                a1[i]=a[i];
            }
            a=a1;
        }
        c++;
        a[c]=element;
    }
    public int remove(){
        int e=a[c];
        if(c>-1){
            a[c]=0;
            c--;
        }
        return e;
    }
    public void insert(int index,int ele){
        if(index>c||index<0){
            System.out.println("index is Invalid");
        }
        else if(c+1==a.length){
            int a1[] = new int[a.length * 2];
            for (int i = 0; i <=c; i++) {
                a1[i] = a[i];
            }
            a=a1;
            for(int i=c;i>=index;i--) {
                a[i+1] = a[i];
            }
            a[index]=ele;
            c++;
        }
        else
        {
            for(int i=c;i>=index;i--){
                a[i+1]=a[i];
            }
            a[index]=ele;
            c++;
        }
    }
    public boolean contains(int e){
        for(int i=0;i<=c;i++){
            if(a[i]==e){
                return true;
            }
        }
        return false;
    }
    public int size(){
        return c+1;
    }
    public int delete(int index){
        int result=-1;
        if(index==c+1){
            result=remove();
        }
        else if(index>(c + 1) || index < 0){
            return result;
        }
        else{
            result=a[index];
            a[index]=0;
            for(int i=index;i<=c;i++){
                a[i]=a[i+1];
            }
            c--;
        }
        return result;
    }
    public void display(){
        for(int i=0;i<=c;i++){
            System.out.print(a[i]+" ");
        }
    }
}

public class saurabh_arraylist{
    public static void main(String[] args){
        arraylist list=new arraylist();

        //add
        list.add(3);
        list.add(8);
        list.add(2);
        System.out.print("Initial arraylist: ");
        list.display();
        System.out.println();

        //remove
        list.remove();
        System.out.print("after removal: ");
        list.display();
        System.out.println();

        //size
        int size=list.size();
        System.out.print("size of arraylist: ");
        System.out.print(size);
        System.out.println();

        //insert
        list.insert(2,9);
        list.insert(1,1);
        System.out.print("After insertion, new arraylist:");
        list.display();
        System.out.println();

        //contains
        System.out.println(list.contains(5));
        System.out.println(list.contains(9));
    }
}
