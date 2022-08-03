#include<bits/stdc++.h>

using namespace std;
class Stack{
    vector<int> v;
public:
    void push(int data)
    {
        v.push_back(data);
    }
    int pop()
    {
        int m;
        if(v.empty()){
            cout<<"\n underflow";
            return -1;
        }
        else
            m=v[v.size()-1];
        v.pop_back();
        return m;
    }
    int peek()
    {
        if(v.empty()){
            cout<<"\n underflow";
            return -1;
        }
        return v[v.size()-1];
    }
    void print()
    {
        for(int i=v.size()-1;i>=0;i--)
            cout << v[i] << " ";
    }
};
