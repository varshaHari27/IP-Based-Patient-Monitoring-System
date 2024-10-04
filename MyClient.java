
import java.io.*;
import java.net.*;
public class MyClient
{
	public static void main(String[] args)
	{
		try
		{
			Socket s= new Socket("localhost",1010);
			DataInputStream dis= new DataInputStream(s.getInputStream());
			DataOutputStream dout= new DataOutputStream(s.getOutputStream());
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			String str2=" ";
			while(!str2.equals("bye"))
			{
				String str1=br.readLine();
				dout.writeUTF(str1);
				str2=(String)dis.readUTF();
				System.out.println("SERVER :"+str2);
				
			}
			s.close();
			dis.close();
			dout.close();
		} 
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
