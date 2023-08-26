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
        System.out.println("Elements of Matrix are : ");

        for(int i = 0 ; i < Arr.length ; i++)
        {
            for(int j = 0 ; j < Arr[i].length ; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}

class Program388
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iRow = 0 , iCol = 0;

        System.out.println("Enter NUmber of Rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter Number of Coloums : ");
        iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow , iCol);
        
        mobj.Accept();
        mobj.Display();

    }
}