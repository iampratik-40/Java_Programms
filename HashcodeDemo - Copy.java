class Demo 
{
    public int iNo1;
    public int iNo2;

    public Demo(int A , int B)
    {
        iNo1 = A;
        iNo2 = B;
    }
} 

class HashcodeDemo
{
    public static void main(String arg[])
    {
        Demo obj = new Demo(11,21);

        System.out.println("Hashcode of the obj is : "+obj.hashCode());

    }
}