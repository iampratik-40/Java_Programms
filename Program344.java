// Approach 2

import java.util.*;

class Program344
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the Elements : ");
        int iCnt = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of Array are : ");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}