import java.util.*;
public class saurabh_arraylist{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        //add
        list.add(3);
        list.add(8);
        list.add(2);
        System.out.print("Initial arraylist: ");
        System.out.print(list);
        System.out.println();

        //remove
        list.remove(1);
        System.out.print("after removal: ");
        System.out.print(list);
        System.out.println();

        //size
        int size=list.size();
        System.out.print("size of arraylist: ");
        System.out.print(size);
        System.out.println();

        //insert
        list.add(2,9);
        list.add(1,1);
        System.out.print("After insertion, new arraylist:");
        System.out.print(list);
        System.out.println();

        //contains
        System.out.println(list.contains(5));
        System.out.println(list.contains(9));
    }
}