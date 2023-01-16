import java.io.*;
import java.net.*;

public class fileClient{
	public static void main(String args[])throws Exception
	{
	  byte []b=new byte[20020];
	  Socket s=new Socket("localhost", 8080);
	  InputStream sr =s.getInputStream();
	  FileOutputStream fo = new FileOutputStream("C:/Users/Sumit Purandare/OneDrive/Desktop/helo.txt");
	  sr.read(b,0,b.length);
	  fo.write(b,0,b.length);
sr.close();
	}
}
