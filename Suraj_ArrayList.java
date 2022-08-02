'''
import java.util.*;

class Arraylist {

    private int[] arr = new int[5];
    private int count = -1;

    public void add(int x) {
        if (count + 1 == arr.length) {

            int len = arr.length;
            int[] arrtemp = new int[arr.length * 2];
            for (int i = 0; i < len; i++) {
                arrtemp[i] = arr[i];
            }
            arr = arrtemp;

        }

        count = count + 1;
        arr[count] = x;

    }

    public void add_at_index(int x, int pos) {
        int temp = 0;
        if (pos > arr.length || pos < 0) {
            System.out.println("Invalid Position");
        }

        else if (count + 1 == arr.length) {
            int len = arr.length;
            int[] arrnew = new int[arr.length * 2];
            for (int i = 0; i < len; i++) {
                arrnew[i] = arr[i];
            }
            arr = arrnew;
            for (int i = count + 1; i >= pos; i--) {
                arr[i + 1] = arr[i];
            }
            arr[pos] = x;
            count++;
        } else {
            for (int i = count + 1; i >= pos; i--) {
                arr[i + 1] = arr[i];
            }
            arr[pos] = x;
            count++;
        }
    }

    public int remove() {
        int el = arr[count];
        if (count > -1) {
            arr[count] = 0;
            count--;
        }
        return el;
    }

    public int remove_at_index(int pos) {
        int r = -1;
        if (pos > count + 1 || pos < 0) {
            System.out.println("Invalid Position");
            return r;
        } else if (pos == count + 1) {
            r = remove();

        } else {
            r = arr[pos];
            arr[pos] = 0;
            for (int i = pos; i <= count; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
        }
        return r;
    }

    public boolean contains(int x) {
        for (int i = 0; i <= count; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return count + 1;
    }

    public void display() {
        for (int i = 0; i <= count; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}

public class ArrayList_demo {

    public static void main(String[] args) {
        Arraylist l = new Arraylist();
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 8) {
            System.out.println(
                    "1.) add at last\n2.) add at position(index)\n3.) delete\n4.) delete at position(index)\n5.) search\n6.) size\n7). display");
            System.out.println("enter your choice :");
            option = sc.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("enter the element to be added : ");
                    int x = sc.nextInt();
                    l.add(x);
                    break;
                }
                case 2: {
                    System.out.println("Enter the element : ");
                    int x = sc.nextInt();
                    System.out.println("Enter the position(Index)");
                    int pos = sc.nextInt();
                    l.add_at_index(x, pos);
                    break;
                }
                case 3: {
                    int r = l.remove();
                    System.out.println("Element " + r + " is removed");
                    break;
                }
                case 4: {
                    System.out.println("enter the position to be deleted : ");
                    int pos = sc.nextInt();
                    int r = l.remove_at_index(pos);
                    System.out.println("Element " + r + " is removed");
                    break;
                }
                case 5: {
                    System.out.println("element to be searched :");
                    int x = sc.nextInt();
                    System.out.println(l.contains(x));
                    break;

                }
                case 6: {
                    System.out.println("size = " + l.size());
                    break;
                }
                case 7: {
                    System.out.println("element = ");
                    l.display();
                    break;
                }
                case 8: {
                    System.out.println("ended");
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                    break;
                }
            }
        }

    }
}
'''
