import java.util.*;

class AgeInvalid extends Exception
{
    AgeInvalid(String str)
    {
        super(str);
    }

}

class UserDefined
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int iAge = sobj.nextInt();

        try
        {
            if(iAge < 15)
            {
                throw new AgeInvalidException("Your Age is less than 15");
            }

            else 
            {
                System.out.println("Age is Valid");
            }
        }

        catch(AgeInvalidException obj)
        {
            System.out.println(obj);
        }       
    }
}