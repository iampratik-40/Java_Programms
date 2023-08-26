import java.util.*;

class Digits
{
    public int SumDigit(int iValue)
    {  
        int iDigit = 0;
        int iSum = 0;
        
        while(iValue != 0)
        {
            iDigit = iValue % 10;
            iSum = iSum + iDigit;
            iValue = iValue / 10;
        }

        return iSum;
    }
}

class Program338
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