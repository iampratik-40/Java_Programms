import java.util.*;

class Digits
{
    int CountDigit(int iNo)
    {
        int iCount = 0;
        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }
        return iCount;
    }

    int Power(int X , int Y)
    {
        int iPower = 1;

        for(int iCnt = 1 ; iCnt <= Y ; iCnt++)
        {
            iPower = iPower * Y;
        }
        return iPower;
    }

    boolean ChkArmstrong(int iNo)
    {
        int iCount = 0 , iDigit = 0;
        iCount = CountDigit(iNo);

        int iTemp = iNo;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + Power(iDigit , iCount);
            iNo = iNo / 10;
        }

        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

class Program342
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        boolean bRet = dobj.ChkArmstrong(iNo);

        if(bRet == true)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is Not Armstrong");
        }


    }
}

/*

    Input : 371
    3 ^ 3 + 7 ^ 3 + 1 ^ 3
    27+ 343 + 1
    371
 
 */