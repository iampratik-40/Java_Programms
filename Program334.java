import java.util.*;

class Numbers
{
    public int EvenFact(int iValue)
    {
        int iMult = 1;

        for(int iCnt = 2 ; iCnt <= iValue ; iCnt+=2)
        {
            if((iValue % iCnt == 0))    // N/2
            {
                iMult = iMult * iCnt;
            }
        }
        return iMult;
    }
}

class Program334
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        int iNo = sobj.nextInt();

        Numbers nobj = new Numbers();

        int iRet = nobj.EvenFact(iNo);

        System.out.println("Multiplication of Even Factors is : "+iRet);
    }
}