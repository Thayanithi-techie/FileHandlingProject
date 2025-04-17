package InternTask;

import java.io.*;
import java.nio.file.*;

public class CreateFile{
	 
	public static void main(String[] args) {
		File myfile = new File("Data.txt");
		
		try {
			if(myfile.createNewFile()) {
				System.out.println("File Created Successfully");
			}
			else {
				System.out.println("File Creation Error");
			}
		} 
		catch (IOException e) {
			System.out.println("Error Occured");
		}
		
	}
}