/*
    str1 = Marvellous
    str2 = osulMalver
 
 */
import java.util.*;

class Program385
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First String : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter Second String : ");
        String str2 = sobj.nextLine();

        if(str1.length() != str2.length())
        {
            System.out.println("Strings are not Anagram");
            return;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char Arr[] = str1.toCharArray();
        char Brr[] = str2.toCharArray();

        int Freq[] = new int[26];
        
        int iCnt = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Freq[Arr[iCnt] - 'a']++;
            Freq[Brr[iCnt] - 'a']++;
        }

        /*
            for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
            {
                Freq2[Brr[iCnt] - 'a']++;
            }            
         
         */
        
        for(iCnt = 0 ; iCnt < Freq.length ; iCnt++)
        {
            if(Freq[iCnt] != 0)
            {
                break;
            }
        }

        if(iCnt == Freq.length)
        {
            System.out.println("Strings are Anagram");
        }
        else
        {
            System.out.println("Strings are not Anagram");
        }
    }
}
