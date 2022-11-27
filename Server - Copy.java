import java.net.*;
import java.io.*;

public class Server
{
    public static void main(String Arr[]) throws Exception
    {
        System.out.println("Server Application is Running ...");

        ServerSocket ss = new ServerSocket(2100);

        System.out.println("Server is Running at Port No 2100 and waiting for Client request ..");
        
        Socket s = ss.accept();

        System.out.println("Request of Client gets Accepeted .");

        PrintStream ps = new PrintStream(s.getOutputStream());
        
        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream())); 
        
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        String str1 , str2 ;

        while((str1 = br1.readLine()) != null)
        {
            System.out.println("Client Says : "+str1);
            System.out.println("Enter Message for Client : ");
            str2 = br2.readLine();
            ps.println(str2);

        }
    }
}