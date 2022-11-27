import java.util.Scanner;

class ArrayUser
{
    public static void main(String Arg[])
    {
        int iCnt = 0;      // Counter
        int iSum = 0;           

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int iSize = sobj.nextInt();

        // int Arr[] = (int*)malloc(iSize * sizeof(int)); Using Malloc in C 
        int Arr[] = new int[iSize];

        System.out.println("Number of Elements in Array : "+Arr.length);

        System.out.println("Enter the Elements of Array : ");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt ++)
        { 
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of Array are : ");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt ++)
        { 
            System.out.println(Arr[iCnt]);
        }

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt ++)
        {
            iSum = iSum+Arr[iCnt];
        }

        System.out.println("Addition is : "+iSum);

    }
}
