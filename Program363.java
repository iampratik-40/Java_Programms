import java.util.*;

class StringX
{
    public String Reverse(String str)
    {
        char Arr[] = str.toCharArray();

        char cTemp = ' ';

        int iStart = 0 , iEnd = Arr.length-1;

        while(iStart < iEnd)
        {
            cTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = cTemp;

            iStart++;
            iEnd--;
        }
        return new String(Arr);
    }
    
}

class Program363
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();
        
        String sret = obj.Reverse(name);

        System.out.println("Result is : "+sret);

    }
}