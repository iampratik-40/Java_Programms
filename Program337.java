import java.util.*;

class Digits
{
    public int CountDigit(int iValue)
    {  
        int iCnt = 0;
        
        while(iValue != 0)
        {
            iCnt++;
            iValue = iValue / 10;
        }

        return iCnt;
    }
}

class Program337
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