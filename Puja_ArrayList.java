class ArrayList {
    private int[] arr = new int[10];
    private int count = -1;
    
    public void add(int x) {
        if (count + 1 == arr.length) {

            int len = arr.length;
            int[] arrnew = new int[arr.length * 2];
            for (int i = 0; i < len; i++) {
                arrnew[i] = arr[i];
            }
            arr = arrnew;

        }

        count = count + 1;
        arr[count] = x;

    }

    public int size() {
        return count + 1;
    }

    public int remove() {
        int el = arr[count];
        if (count > -1) {
            arr[count] = 0;
            count--;
        }
        return el;
    }

    public void insert(int x, int pos) {
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

    public boolean contains(int x) {
        for (int i = 0; i <= count; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public int delete(int pos) {
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

    public void display() {
        for (int i = 0; i <= count; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class ArraylistDemo {

    public static void main(String[] args) {
        ArrayList l = new ArrayList();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.insert(35, 12);
        // System.out.println(l.remove());
        // l.display();
        // System.out.println(l.size());
        // System.out.println(l.delete(8));
        l.display();
        System.out.println(l.size());
    }
}
