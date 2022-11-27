#include<iostream>

using namespace std;
int AddI(int i , int j)
{
    int Ans = 0;
    Ans = i +j;
    return Ans;
}

float AddF(float i , float j)
{
    float Ans = 0;
    Ans = i+j;
    return Ans;
}

int main()
{
    int a = 10 , b = 11 , iRet = 0;
    float x = 90.0f , y = 67.0f , fRet = 0.0;

    iRet = AddI(a, b);
    fRet = AddF(x, y);

    cout<<"\n Addition of Int : "<<iRet;
    cout<<"\n Addition of Float : "<<fRet;

    return 0;
}
