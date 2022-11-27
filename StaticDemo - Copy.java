class StaticDemo
{
    static
    {
        System.out.println("Inide Static Block of StaticDemo class which contains Main .");
    }

    public StaticDemo()
    {
        System.out.println("Inside Constructor of StaticDemo .");
    }
    public static void main(String arg[])
    {
        System.out.println("Inside Main .");
        //Demo obj1 = new Demo();
        Demo.Gun();
        System.out.println("Value of Static iNo3 : "+Demo.iNo3);
        System.out.println("Value of Static iNo4 : "+Demo.iNo4);

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.Fun();
        
    }
}

class Demo 
{
   public int iNo1 ;            // Non-Static Char
   public int iNo2 ;            // Non-Static Char
   public static int iNo3 ;     // Static Char
   public static int iNo4 ;     // Static Char
 
   static                       //  Static Block
   {
        System.out.println("Inside Static Block of Demo Class .");
        iNo3 = 51;
        iNo4 = 101;
   }

   public Demo()                  // Constructor
   {
        System.out.println("Inside Constructor .");
        iNo1 = 11;
        iNo2 = 21;
   }

   public void Fun()             // Non Static Method
   {
        System.out.println("Inside Non Static Method Fun .");
        System.out.println("Value of iNo1 : "+this.iNo1);
        System.out.println("Value of iNo2 : "+this.iNo2);
        System.out.println("Value of iNo3 : "+this.iNo3);
        System.out.println("Value of iNo4 : "+this.iNo4);
   }

   public static void Gun()      // Static Method
   {
        // Static method can access only static dta
        // We can't use this keywoed here.
        System.out.println("Inside Static Method Gun .");
        //System.out.println("Value of iNo1 : "+iNo1);
        //System.out.println("Value of iNo2 : "+iNo2);
        System.out.println("Value of iNo3 : "+iNo3);
        System.out.println("Value of iNo4 : "+iNo4);
   }  
}