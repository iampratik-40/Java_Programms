class Employee implements Cloneable
{
    public int Eid;
    public String Name;
    public int Salery;

    public Employee(int No, String str, int Value)
    {
        this.Eid = No;
        this.Name = str;
        this.Salery = Value;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class CloneDemo
{
    public static void main(String Arg[])
    {
        try 
        {
            Employee eobj1 = new Employee(101,"Rahul",11000);
            Employee eobj2 = (Employee)eobj1.clone();

            System.out.println("Name of First Employee : "+eobj1.Name);
            System.out.println("Name of Second Employee : "+eobj2.Name);
            
            System.out.println("Name of First Employee : "+eobj1.Name);
            System.out.println("Name of Second Employee : "+eobj2.Name);

            eobj1.Name = "Sagar";

            System.out.println("Name of First Employee : "+eobj1.Name);
            System.out.println("Name of Second Employee : "+eobj2.Name);

            System.out.println("Salery of First Employee : "+eobj1.Salery);
            System.out.println("Salery of Second Employee : "+eobj1.Salery);

        }
        
        catch(CloneNotSupportedException obj)
        {}
    }
}