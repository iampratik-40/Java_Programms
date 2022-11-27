import java.util.*;

class Collection7
{
    public static void main(String arg[])
    {
        Stack <Character> sobj = new Stack <Character> ();

        sobj.push('a');
        sobj.push('b');
        sobj.push('c');
        sobj.push('d');
        sobj.push('e');

        System.out.println("Elemets of Stack are : "+sobj);

        System.out.println("Pooped Element : "+sobj.pop());

        System.out.println("Elemets of Stack are : "+sobj);
    }
}