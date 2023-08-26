import java.util.*;

class Program375
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        System.out.println("Enter Word that you want to search : ");
        String Word = sobj.nextLine();

        str = str.replaceAll("\\s+"," ");
        str = str.trim();

        String arr[] = str.split(" ");
        
        int iFrequency = 0;

        for(int iCnt = 0 ; iCnt < arr.length ; iCnt++)
        {
            if(arr[iCnt].equals(Word))
            {
                iFrequency++;
            }
        }
        System.out.println("Freq of india word is : "+iFrequency);
    }
}