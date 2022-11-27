#include<iostream>
using namespace std;

class Array
{
    public :
    int *Arr;
    int iSize;

    Array(int length)
    {
        iSize = length;
        Arr = new int[iSize];
    }

    void Accept()
    {
        cout<<"Enter The values : "<<"\n";
        for(int i ; i<iSize ; i++)
        {
            cin>>Arr[i];
        }
    }

    void Display()
    {
        cout<<"Values of Array  : "<<"\n";
        for(int i ; i<iSize ; i++)
        {
            cout<<Arr[i];
        }
    }
};

int main()
{
    Array obj1(5);

    obj1.Accept();
    obj1.Display();
    return 0;
}