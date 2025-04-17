package InternTask;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

	public static void main(String[] args) {
		
		String Data="8, Jaddu, CSK";
		
		try {
			FileWriter output=new FileWriter("Data.txt");
			output.write(Data);
			System.out.println("File is Appended Successfully");
			output.close();
		} 
		catch (IOException e) {
			System.out.println("File Append Error");
		}
	}

}
