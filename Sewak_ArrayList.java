import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Sewak_ArrayList{
    private int arr[]=new int[8];
    int count=-1;
    public int size()
    {
        return count+1;
    }
    public void add(int a)
    {
        if(count+1==arr.length)
        {
            int newarr[] = new int[arr.length*2];
            for(int i=0;i<count;i++)
            {
                newarr[i]=arr[i];
            }
            newarr[++count]=a;
            arr=newarr;
        }
        else
        {
            arr[++count]=a;
        }
    }
    public int remove()
    {
        int temp=0;
        if(count>-1)
        {
            temp = arr[count];
            arr[count]=0;
            count--;
        }
        else
        {
            System.out.println("-:Array is Empty:-");
        }
        return temp;
    }
    public void insert(int a,int index)
    {
        if(index>count||index<0)
        {
            System.out.println("Invalid Position");
        }
        else if(count+1==arr.length)
        {
            int newarr[] = new int[arr.length * 2];
            for (int i = 0; i <=count; i++) {
                newarr[i] = arr[i];
            }
            arr=newarr;
            for(int i=count;i>=index;i--) {
                arr[i+1] = arr[i];
            }
            arr[index]=a;
            count++;
        }
        else
        {
            for(int i=count;i>=index;i--)
            {
                arr[i+1]=arr[i];
            }
            arr[index]=a;
            count++;
        }

    }
    public int contains(int b)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==b)
            {
                return i;
            }
        }
        return -1;
    }
    public void display()
    {
        for(int i=0;i<=count;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

class Sewak_ArrayList_test {

    public static void main(String[] args) {
        Sewak_ArrayList s = new Sewak_ArrayList();
        s.add(54);
        s.add(20);
        s.display();
        s.remove();
        s.display();
        s.insert(30,1);
        s.display();
        s.add(24);
        s.add(26);
        s.add(28);
        s.display();
        s.insert(25,3);
        s.display();
        s.insert(75,2);
        s.display();
        s.size();
        System.out.println(s.size());
        System.out.println(s.contains(75));

    }



}
