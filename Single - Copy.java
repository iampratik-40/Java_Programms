class Base
{
    public int A , B;
    
    public Base()   
    {
        System.out.println("Base Constructor");
    }

    public void fun()    // Definition
    { 
        System.out.println("Inside Base fun");
    }

    public void gun()      // Definition
    {
        System.out.println("Inside Base gun");
    }

    public void fun(int No)    // Overloaded Definition
    {
        System.out.println("Inside Base fun with one int ");
    }

}

class Derived extends Base    // Inheritance 
{
    public int X , Y;

    public Derived()
    {
        System.out.println("Derived Constructor");
        this.X = 30;
        this.Y = 40;
    }

    public void sun()    // Definition
    {
        System.out.println("Inside Derived Sun");
    }

    public void gun()    // Overrided Definition
    {
        System.out.println("Inside Derived gun");
    }

}
class Single
{
    public static void main(String arg[])
    {
        // Base bobj1 = new Base();         // No Casting
        // Derived dobj1 = new Derived();   // No Casting
         Base bobj2 = new Derived();      // Upcasting
        // Derived dobj2 = new Base();      // Downscasting

        bobj2.fun();
        bobj2.fun(11);
        bobj2.gun();
        //bobj2.sun();
    }
}
