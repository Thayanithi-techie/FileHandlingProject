package InternTask;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		
		String Data="7, Dhoni, CSK";
		
		try {
			FileWriter output=new FileWriter("Data.txt");
			output.write(Data);
			System.out.println("File is Written Successfully");
			output.close();
		} 
		catch (IOException e) {
			System.out.println("File Write Error");
		}
	}

}
