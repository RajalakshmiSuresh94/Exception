package ExceptionClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckMsg {
	public static void main(String[] args) throws IOException {
		try {
		File f = new File ("C:\\Users\\DELL\\Deskop\\sample.txt");
		FileReader fr=new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char) temp);
		}
		}
		catch(FileNotFoundException fe) {
			//fe.printStackTrace();
			System.err.println(fe);
		}
		System.out.println("End");
		
	}

}
