class GenericMethod
{
    public static <T> void Display(T Arr[])
    {
        for(int i = 0; i<Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }

    }
    public static void main(String arg[])
    {
        Integer iArr[] = {10,20,30,40};
        Display(iArr);

        Character cArr[] = {'A','B','C','D'};
        Display(cArr);

        Float fArr[] = {10.1f,20.3f,30.6f,40.56f};
        Display(fArr);

    }
}