import java.io.*;
import java.net.*;

public class fileServer{
	public static void main(String args[])throws Exception{
	  ServerSocket s =new ServerSocket(8080);
	  Socket sr = s.accept();
	  FileInputStream fr =new FileInputStream("C:/Users/Sumit Purandare/OneDrive/Desktop/hi.txt");
	  byte[] b =new byte[4024];
          fr.read(b,0,b.length);
          OutputStream os = sr.getOutputStream();
          os.write(b,0,b.length);
fr.close();
	}
}
