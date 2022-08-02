#include <bits/stdc++.h>

using namespace std;

class Arraylist{
    int *arr;
    int capacity;
    int currSize;
public:
    Arraylist()
    {
         capacity = 10;
         currSize = 0;
         arr = new int[currSize];
    }
    void add(int data)
    {
        if(currSize==capacity)
        {
            capacity*=2;
            int *old_arr=arr;
            arr=new int[capacity];
            for(int i=0;i<currSize;i++)
                arr[i] = old_arr[i];
            delete [] old_arr;
        }
        arr[currSize++] = data;
    }
    int remove()
    {
        int m=arr[currSize-1];
        if(currSize>=0)
            currSize--;
        return m;
    }
    int size()
    {
        return currSize;
    }
    void insert(int x,int data)
    {
        if(currSize==capacity)
        {
            capacity*=2;
            int *old_arr=arr;
            arr=new int[capacity];
            for(int i=0;i<currSize;i++)
                arr[i] = old_arr[i];
            delete [] old_arr;
        }
        currSize++;
        for(int i=currSize-1;i>=x;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[x]=data;
    }
    bool contains(int n)
    {
        for(int i=0;i<currSize;i++)
        {
            if(arr[i]==n)
                return true;
        }
        return false;
    }
    int Delete(int x)
    {
        int m=arr[x];
        if(currSize>=0)
        {
            for(int i=x;i<currSize;i++)
            {
                arr[i]=arr[i+1];
            }
            currSize--;
        }
        return m;
    }
    void print()
    {
        for(int i = 0; i < currSize; i++)
            cout << arr[i] << " ";
    }
};
