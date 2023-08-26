import java.util.*;

class StringX
{
    public int CountSmall(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;

        for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountCapital(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount = 0;
    
        for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class Program354
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();

        System.out.println("Small Case Letters in String are : "+obj.CountSmall(name));
        System.out.println("Capital Case Letters in String are : "+obj.CountCapital(name));
    }
}