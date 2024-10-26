package JavaProgram.BASIC;
//Server using TCP/IP
// 0-1023 � Well known ports. These are allocated to server services by the Internet Assigned Numbers Authority (IANA)
//1024-49151- Registered Port -These can be registered for services with the IANA
//Ports 49152-65535� These are used by client programs and you are free to use these in client programs.


import java.io.*;
import java.net.*;
class TCPIPServer
{
	public static void main(String args[])
	{
		try
		{
			final int PORT=12345;	//Assigned un-reserved PORT NUMBER to our Server

			ServerSocket sskt=new ServerSocket(PORT);

			System.out.println("My Server is started successfully ...");
			System.out.println("Port number:"+sskt.getLocalPort());

			System.out.println("Waiting for Client's Connection. . . ");
			//sskt.setSoTimeout(5000);

			Socket skt=sskt.accept();
			System.out.println("Client is connected now: " +skt);
			// socket ka kaam hai connection build krna server aur client ke bich me

			BufferedReader in=new BufferedReader(new InputStreamReader(skt.getInputStream()));
			BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out=new PrintWriter(skt.getOutputStream(), true);
           // read krne kaa kaam krega bufferreader
		//    print writer ka writing ka
			String str=null;
			do
			{
				str=in.readLine();
				System.out.println("from Client: "+str);

				str=keyboard.readLine();
				out.println(str);
			}
			while(!str.equalsIgnoreCase("quit"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}//main
}//Server class
//=====================================================================================



