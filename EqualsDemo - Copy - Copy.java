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

class EqualsDemo
{
    public static void main(String arg[])
    {
        String S1 = "Hello";
        String S2 = "Hello";

        System.out.println("Hashcode of S1 : "+S1.hashCode());
        System.out.println("Hashcode of S2 : "+S2.hashCode());

        if(S1.equals(S2))
        {
            System.out.println("Objects are same ");
        }
        else
        {
            System.out.println("Objects are Diffrent");
        }

        if(S1 == S2)
        {
            System.out.println("Objects are same ");
        }
        else
        {
            System.out.println("Objects are Diffrent");

        }
        
    }
}