#include<iostream>

using namespace std;

template<class T>
T Add(T i , T j)
{
    T Ans ;
    Ans = i +j;
    return Ans;
}

int main()
{
    int a = 10 , b = 11 , iRet = 0;
    float x = 90.0f , y = 67.0f , fRet = 0.0;
    double p = 90.1 , q = 67.1f , dRet = 0.0;

    iRet = Add(a, b);
    fRet = Add(x, y);
    dRet = Add(p,q);

    cout<<"\n Addition of Int : "<<iRet;
    cout<<"\n Addition of Float : "<<fRet;
    cout<<"\n Addition of Double : "<<dRet;

    return 0;
}
