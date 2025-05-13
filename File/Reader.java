

//	BufferRead + FileReader = Best for reading text file line-by-line
//  FileInputStream = Best for binary files (e.g., images, audio flies)
//  RandomAccesFiles = Best for read/write specific portions of a large file

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) {
		
		String filePath = "";
		
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not locate file");
		}
		catch(IOException e) {
			System.out.println("Something went wrong");
		}
	}

}
