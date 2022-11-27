class Loops
{
    public static void main(String arg[])
    {
        int Arr[] = {10,20,30,40};
        int iCnt = 0;

        System.out.println("Traversal of Array Using For loop .");
        
        for(iCnt = 0; iCnt < Arr.length ; iCnt ++)  // Same in C , C++ , Java
        {
            System.out.println(Arr[iCnt]);
        }

        System.out.println("Traversal of Array Using While loop .");

        iCnt = 0;

        while(iCnt < Arr.length)   // Same in C , C++ , Java
        {
            System.out.println(Arr[iCnt]);
            iCnt ++;
        }

        System.out.println("Traversal of Array Using do-while loop .");
        
        iCnt = 0;
        
        do   // Same in C , C++ , Java
        {
            System.out.println(Arr[iCnt]);
            iCnt ++;
        }while(iCnt < Arr.length);

        System.out.println("Traversal of Array Using For-Each loop .");

        for (int iNo : Arr)
        {
            System.out.println(iNo);
        }
    }
}