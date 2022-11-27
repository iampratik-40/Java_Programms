import java.util.*;

class Collection2
{
    public static void main(String Arg[])
    {
        LinkedList <String> lobj = new LinkedList <String> ();
        lobj.add("Kapil");
        lobj.add("Aditya");
        lobj.add("Rohan");
        lobj.add("Rutwik");
        lobj.add("Tejas");

        System.out.println("Elements of Linked List are : "+lobj);

        lobj.addFirst("Pooja");
        System.out.println("Elements of Linked List are : "+lobj);
        
        lobj.addLast("Sneha");
        System.out.println("Elements of Linked List are : "+lobj);

        Iterator iobj = lobj.iterator();
        System.out.println("Data Using Iterator : ");
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

        if(lobj.contains("Rohan"))
        {
            System.out.println("Rohan is Present in LL");
        }
        else
        {
            System.out.println("Rohan is Not Present in LL");
        }
        /* 
        lobj.remove();
        System.out.println("Elements of Linked List are : "+lobj);

        lobj.remove();
        System.out.println("Elements of Linked List are : "+lobj);

        lobj.remove(1);
        System.out.println("Elements of Linked List are : "+lobj);

        lobj.removeLast();
        System.out.println("Elements of Linked List are : "+lobj);

        System.out.println("Number of Elelemts are : "+lobj.size());

        lobj.set(1,500);
        System.out.println("Elements of Linked List are : "+lobj);

        
        lobj.clear();
        System.out.println("Elements of Linked List are : "+lobj);
        */
    }
}