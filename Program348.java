import java.util.*;

class ArrayX
{
    protected int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }

    protected void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Elements : ");

        for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    protected void Display()
    {
        System.out.println("Elements of Array are : ");

        for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }
        System.out.println();
    }
}

class MyArray extends ArrayX    // Inheritance
{
    public MyArray(int iSize)
    {
        super(iSize);
    }

    public int Summation()
    {
        int iSum = 0;

        for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        return iSum;
    }
}

class Program348
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Elements : ");
        int iSize = sobj.nextInt();

        MyArray mobj = new MyArray(iSize);

        mobj.Accept();
        mobj.Display();
        
        System.out.println("Summation of Elements : "+mobj.Summation());
    }
}