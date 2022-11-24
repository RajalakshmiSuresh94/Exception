package ExceptionClass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckMail {
	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Users\\DELL\\Desktop\\mail.txt");
		FileReader fr = new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1){
			System.err.print((char)temp);
		}
		
	}

}
