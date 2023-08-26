import java.util.*;

class Matrix
{
    public int Arr[][];

    public Matrix(int i , int j)
    {
        Arr = new int[i][j];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Elements : ");

        for(int i = 0 ; i < Arr.length ; i++)
        {
            for(int j = 0 ; j < Arr[i].length ; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.print("Elements of Matrix are : ");

        for(int i = 0 ; i < Arr.length ; i++)
        {
            for(int j = 0 ; j < Arr[i].length ; j++)
            {
                System.out.println(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int Summation()
    {
        int iSum = 0;

        for(int i = 0 ; i < Arr.length ; i++)
        {
            for(int j = 0 ; j < Arr[i].length ; j++)
            {
                iSum = iSum + Arr[i][j];
            }
            System.out.println();
        }
        return iSum;
    }

    public void SummationRow()
    {
        int iSum = 0;

        for(int i = 0 ; i < Arr.length ; i++)
        {
            for(int j = 0 ; j < Arr[i].length ; j++)
            {
                iSum = iSum + Arr[i][j];
            }
            System.out.println("Summation of Rows : "+(i+1)+" is "+iSum);
            iSum = 0;
        }
    }
}

class Program390
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iRow = 0 , iCol = 0;

        System.out.println("Enter Number of Rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter Number of Coloums : ");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow , iCol);
        
        mobj.Accept();
        mobj.Display();

        int iRet = mobj.Summation();
        System.out.println("Summation is : "+iRet);

        mobj.SummationRow();

    }
}