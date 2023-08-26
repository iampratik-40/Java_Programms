import java.util.*;

class Digits
{
    public int SumDigit(int iValue)
    {  
        while(iValue != 0)
        {
            iSum = iSum + (iValue % 10);
            iValue = iValue / 10;
        }

        return iSum;
    }
}

class Program339
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.SumDigit(iNo);

        System.out.println("Nuber of Digits are : "+iRet);
        
    }
}