import java.net.*;
import java.io.*;

public class Client
{
    public static void main(String Arr[]) throws Exception
    {
        System.out.println("Client Application is Running ...");

        Socket s = new Socket("LocalHost",2100);

        System.out.println("Client is Waiting for the Server to accept the Request ....");

        PrintStream ps = new PrintStream(s.getOutputStream());
          
        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
 
        String str1 , str2 ;

        while(!(str1 = br2.readLine()).equals("end"))
        {
            ps.println(str1);
            System.out.print("Enter Message for Server : ");
            str2 = br1.readLine();
            System.out.println("Server Says : "+str2);

        }
    }
}