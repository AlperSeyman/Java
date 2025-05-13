// 	FileWriter = Good for small or medium-sized text files.
// 	BufferedWriter = Better performance for large amounts of text.
//  PrintWritter = Best for structured data, like reports or logs.
//  FileOutputStream = Best for binary files (e.g., images, audio files)

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) {
		
		String path = "writer.txt";
		String textContent = """
				Roses are Red
				Violets are Blue
				BOOTY BOOTY BOOTY
				ROCKIN' EVERYWHERE!
				""";
		
		try(FileWriter writer = new FileWriter(path)){
			writer.write(textContent);
			System.out.println("File has been written");
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not locate file location");
		}
		catch(IOException e){
			System.out.println("Could not write file");
		}
	}

}
