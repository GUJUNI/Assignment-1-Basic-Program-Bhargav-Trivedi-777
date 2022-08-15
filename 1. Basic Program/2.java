// Name:Trivedi Bhargav C
// Roll No:41
// Class: MCA-2
// Subject:Advanced Networking
// Practical Assignment
// -------------------------------------------------------------------------
// 2)
// ***TcpMyClient.java***

import java.io.*;  
import java.net.*;  

public class TcpMyClient 
{  
    public static void main(String[] args) 
    {  
        try
        {      
            Socket s=new Socket("localhost",6666);  
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
            dout.writeUTF("Hello Server");  
            dout.flush();  
            dout.close();  
            s.close();  
        }
        catch(Exception e){System.out.println(e);}  
    }  
} 