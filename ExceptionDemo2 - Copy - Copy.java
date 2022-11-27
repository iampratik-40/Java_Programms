import java.util.*;

class ExceptionDemo2
{
    public static void main(String arr[])
    {
        Scanner sobj = new Scanner(System.in);
        int Arr[] = {10,20,30,40};

        System.out.println("Enter the Index of Array : ");
        int i = sobj.nextInt();

        System.out.println("Data in Specified Index is : "+Arr[i]);
    }
}