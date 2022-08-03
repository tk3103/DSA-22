#include<bits/stdc++.h>
using namespace std;
class Stack{
    int *arr,top=-1,n;
public:
    Stack(int n)
    {
        this->n=n;
        arr = new int[n];
    }
    void push(int data)
    {
        if(isFull()){
            cout<<"\n stack overflow";
        }
        else{
            arr[++top]=data;
        }
    }
    int pop()
    {
        if(isEmpty()){
            cout<<"\n underflow";
            return -1;
        }
        return arr[top--];
    }
    int peek()
    {
        if(isEmpty()){
            cout<<"\n underflow";
            return -1;
        }
        return arr[top];
    }
    bool isFull()
    {
        return top==n-1;
    }
    bool isEmpty()
    {
        return top==-1;
    }
    void print()
    {
        for(int i=top;i>=0;i--)
            cout << arr[i] << " ";
    }
};
