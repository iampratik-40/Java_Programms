import java.util.*;      // Inbuilt Package
import Marvellous.Arithmatic;  // User Defined Package
import Marvellous.PPA.Loop;

class DemoPackage
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number : ");
        int iNo2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iNo1 , iNo2);

        int iResult = aobj.Addition();
        System.out.println("Addition is : "+iResult); 

        int iResult1 = aobj.Substraction();
        System.out.println("Substraction is : "+iResult1);

        Loop lobj = new Loop();
        lobj.Display();

    }
}
