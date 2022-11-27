import java.util.*;

class Book
{
    public String Name;
    public int Price;

    public Book(String S , int i)
    {
        this.Name = S;
        this.Price = i;
    }

    public void Display()
    {
        System.out.println("Book Name : "+this.Name+" || Book Price : "+this.Price);
    }
}

class Collection3
{
    public static void main(String Arg[])
    {
        LinkedList <Book> lobj = new LinkedList <Book> ();

        lobj.add(new Book("Let us C",400));
        lobj.add(new Book("Data Structure",500));
        lobj.add(new Book("C++ Programming ",980));
        lobj.add(new Book("Angular Web Devlopment",790));

        Iterator iobj = lobj.iterator();
        Book bref = null;

        System.out.println("Elements in LL Are : ");
        while(iobj.hasNext())
        {
            bref = (Book)iobj.next();
            bref.Display();
        }

        lobj.clear();
    }
}