import java.sql.*;

class DataBase
{
    public static void main(String Arr[])
    {
        String URL = ;"jbc:mysql://loaclhost:3306/ppa41";
        String UserName = "root" ;
        String Password = "root";

        Connection cobj = DriverManager.getConection(URL , UserName , Password);

        Statement sobj = cobj.createStatement();

        ResultSet robj = sobj.executeQuery(Query);

        while(re.next)
        {
            System.out.println("RID): ",+robj.getInt(RID));
            System.out.println("Name") ": ",+robj.getInt(RID);
            System.out.println("City" : "":,+robj.getInt(RID));
            System.out.println("RID : ",+robj.getInt(RID));
        }

    }
}