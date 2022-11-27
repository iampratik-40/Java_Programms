class Demo
{
    public int iSize;
    public int Arr[];

    public Demo(int iNo)
    {
        System.out.println("Inside Constructor ");
        iSize = iNo;
        Arr = new int[iSize];
    }

    protected void finalize()
    {
        System.out.println("Inside finalize Method");
        Arr = null;
    }
}

class FinalizeDemo
{
    public static void main(String Arr[])
    {
        Demo obj = new Demo(4);
        obj = null;
        System.gc();

    }
}