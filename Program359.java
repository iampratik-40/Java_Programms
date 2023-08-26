import java.util.*;

class StringX
{
    public String StrLower(String str)
    {
        // Step 1 : Convert String into Array
        char Arr[] = str.toCharArray();

        // Step 2 : Perform Operations on Array
        for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
        }

        // Step 3 : Convert Array into String
        return new String(Arr);
    }

    public String StrUppar(String str)
    {
        // Step 1 : Convert String into Array
        char Arr[] = str.toCharArray();

        // Step 2 : Perform Operations on Array
        for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
        }

        // Step 3 : Convert Array into String
        return new String(Arr);   
    }

    public String StrToggle(String str)
    {
        // Step 1 : Convert String into Array
        char Arr[] = str.toCharArray();

        // Step 2 : Perform Operations on Array
        for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);
            }
            else if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
        }
        
        // Step 3 : Convert Array into String
        return new String(Arr);
    }
}

class Program359
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();

        String sret = obj.StrLower(name);
        System.out.println("Converted String is : "+sret);

        sret = obj.StrUppar(name);
        System.out.println("Converted String is : "+sret);

        sret = obj.StrToggle(name);
        System.out.println("Converted String is : "+sret);
    }
}