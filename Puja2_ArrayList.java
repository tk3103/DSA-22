import java.util.*;

class ArrayList{

    private int[] arr=new int[8];
    private int count=-1;

    public void add(int element)
    {
        if(count==arr.length-1)
        {
            int[] arrNew=new int[2*arr.length];
            for(int i=0;i<arr.length;i++)
            {
                arrNew[i]=arr[i];
            }
            arr=arrNew;
        }
        count++;
        arr[count]=element;
    }

    public int size()
    {
        return count+1;
    }

    public int remove()
    {
        int deletedElement=arr[count];
        if(count>=0)
        {
            arr[count]=0;
            count--;
        }
        return deletedElement;
    }

    public void insert(int element, int index)
    {

        if(index>arr.length || index<0)
        {
            System.out.println("Invalid Index");
        }

        else if(count==arr.length-1)
        {
            int[] arrNew=new int[2*arr.length];
            for(int i=0;i<arr.length;i++)
            {
                arrNew[i]=arr[i];
            }
            arr=arrNew;

            for(int i=count+1;i>=index;i--)
            {
                arr[i+1]=arr[i];
            }
            arr[index]=element;
            count++;
        }

        else
        {
            for(int i=count+1;i>=index;i--)
            {
                arr[i+1]=arr[i];
            }
            arr[index]=element;
            count++;
        }

    }

    public boolean contains(int element)
    {
        for(int i=0;i<=count;i++)
        {
            if(arr[i]==element)
                return true;
        }
        return false;
    }

    public int delete(int index)
    {
        int temp=-1;
        if(index>count+1 || index<0)
        {
            System.out.println("Invalid Position");
            return temp;
        }

        else if(index == count+1)
        {
            temp=remove();
        }

        else
        {
            temp=arr[index];
            for(int i=index;i<=count;i++)
            {
                arr[i]=arr[i+1];
            }
            count--;
        }
        return temp;
    }

    public void display()
    {
        for(int i=0;i<=count;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

public class Puja_ArrayList{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        ArrayList list=new ArrayList();
        int option=0;
        while(option!=8)
        {
            System.out.println("\n\nOPTIONS");
            System.out.println("\n1. Add\n2. Size\n3. Remove\n4. Insert\n5. Contains\n6. Delete\n7. Display\n8. EXIT\n");
            System.out.println("\nEnter your option: ");
            option=sn.nextInt();
            switch(option)
            {
                case 1:
                {
                    System.out.println("\nEnter the element: ");
                    int element=sn.nextInt();
                    list.add(element);
                    break;
                }
                case 2:
                {
                    System.out.println("\nSize = "+list.size());
                    break;
                }
                case 3:
                {
                    int rem=list.remove();
                    System.out.println(rem+" is removed\n");
                    break;
                }
                case 4:
                {
                    System.out.println("\nEnter the element: ");
                    int element=sn.nextInt();
                    System.out.println("Enter the index: ");
                    int index=sn.nextInt();
                    list.insert(element,index);
                    break;
                }
                case 5:
                {
                    System.out.println("\nSearch an element: ");
                    int element=sn.nextInt();
                    System.out.println(list.contains(element));
                    break;
                }
                case 6:
                {
                    System.out.println("\nEnter the index to be deleted: ");
                    int index=sn.nextInt();
                    System.out.println(list.delete(index)+" is deleted\n");
                    break;
                }
                case 7:
                {
                    System.out.println("\nThe elements are\n");
                    list.display();
                    break;
                }
                case 8:
                {
                    System.out.println("\nEXIT\n");
                    break;
                }
                default:
                {
                    System.out.println("\nINVALID OPTION\n");
                    break;
                }
            }
        }
        sn.close();
    }
}
