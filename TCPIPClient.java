package JavaProgram;

//Client Class: Connection-oriented using TCP/IP
import java.io.*;
import java.net.*;
class TCPIPClient
{
	public static void main(String args[])
	{
		try
		{
			String ip="127.0.0.1";		//IP address of Server
			final int PORT=12345;		//Port number of Server, Socket=IP+Portno.

			Socket skt=new Socket(ip,PORT);

			System.out.println("Client is invoked . . .");
			System.out.println("Port number= "+skt.getPort());
			System.out.println("Local Port number= "+skt.getLocalPort());
			System.out.println("Now, type message that will be sent to connected Server: ");

			BufferedReader in=new BufferedReader(new InputStreamReader(skt.getInputStream()));	//input stream from Network
			BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));		//input stream from keyboard
			PrintWriter out=new PrintWriter(skt.getOutputStream(), true);						//output stream to server

			String str=null;
			do
			{
				str=keyboard.readLine();	//read from keyboard
				out.println(str);			//write to Server

				str=in.readLine();			//receive from Server
				System.out.println("from Server: "+str);
			}
			while(!str.equalsIgnoreCase("quit"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}//main
}//client class
//=====================================================================================


