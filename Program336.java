import java.util.*;

class Digits
{
    public int CountDigit(int iValue)
    {  
        int iCnt = 0;
        int iDigit = 0;

        while(iValue != 0)
        {
            iDigit = iValue % 10;
            iCnt++;
            iValue = iValue / 10;
        }

        return iCnt;
    }
}

class Program336
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();

        int iRet = dobj.CountDigit(iNo);

        System.out.println("Nuber of Digits are : "+iRet);

        
    }
}