class Maths
{
    public int iNo1 ;   // Characteristics
    public int iNo2 ;   // Characteristics

    public Maths()    // Default Constructor
    {
        System.out.println("Inside Default Constructor .");
    }

    public Maths(int a , int b)  // Parametarised constructor
    {
        System.out.println("Inside Parametarised constructor .");
        iNo1 = a;
        iNo2 = b;
    }

    public int Add()  // Behaviour
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }

    public int Sub()  // Behaviour
    {
        int iAns = 0;
        iAns = iNo1 - iNo2;
        return iAns;
    }
}  // End of Maths Class

class Demo
{
    public static void main(String arr[])
    {
        System.out.println("Inside Main .");

        Maths mobj1 = new Maths();
        Maths mobj2 = new Maths(10,11);

        int iRet = 0;
        
        iRet = mobj1.Add();

        System.out.println("Addition is : "+iRet);

        iRet = mobj2.Add();
        System.out.println("Addition is : "+iRet);    
    }
}