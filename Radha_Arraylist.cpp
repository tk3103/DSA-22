#include<bits/stdc++.h>
using namespace std;

class Arraylist{
    public:
    int capacity;
    int *arr;
    int count;

    Arraylist()
    {
        capacity=5;
        count=0;
        arr=new int[capacity];
    }

    void add(int x)
    {
      if(count==capacity)
      {
        capacity*=2;
        int *Old_arr=arr;
        arr=new int[capacity];
        for(int i=0;i<count;i++)
        arr[i]=Old_arr[i];
        delete [] Old_arr;
      }
      arr[count]=x;
      count++;
    }

    int  Remove()
    {
        int x;
        if(count>=0)
        {
           x=arr[count-1];
           count--;
        }
        return x;
    }

    int size()
    {
        return count;
    }

    void insert(int position,int val)
    {
       if(count==capacity)
      {
        capacity*=2;
        int *Old_arr=arr;
        arr=new int[capacity];
        for(int i=0;i<count;i++)
        arr[i]=Old_arr[i];
        delete [] Old_arr;
      }
      for(int i=count-1;i>=position;i--)
      {
        arr[i+1]=arr[i];
      }
      arr[position]=val;
      count++;
    }

    bool Contains(int n)
    {
        for(int i=0;i<count;i++)
        {
            if(arr[i]==n)
                return true;
        }
        return false;
    }

   int Delete(int pos)
    {
        int val=arr[pos];
        if(count>=0)
        {
            for(int i=pos;i<count;i++)
            {
                arr[i]=arr[i+1];
            }
            count--;
        }
        return val;
    }
  void print()
  {
    for(int i=0;i<count;i++)
    cout<<arr[i]<<" ";
    cout<<endl;
  }

};


int main()
{
    Arraylist a;
    a.add(5);
    a.add(10);
    a.add(8);
    a.add(4);
    a.add(9);
    a.add(1);
    a.add(51);
    a.add(110);
    a.print();
    cout<<a.size()<<endl;
    a.Delete(5);
    cout<<a.size()<<endl;
    a.insert(2,90);
    cout<<a.Remove()<<endl;
    a.print();
}
