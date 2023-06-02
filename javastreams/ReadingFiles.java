package javastreams;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class ReadingFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Connecting Streams
		
		File f = new File("C:\\filewriting\\myTextFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
//		Read Text File
		System.out.println(reader.readLine());//This will read one line, the first one.
		System.out.println(reader.readLine());//This reads the second line.
		
//		Read the entire file:
		String line = null; // The reason we have to make a variable is because each time you access reader.readLine() it reads one line. So if you use it in the while loop, then a line is skipped as one run of readLine() was used for the conditional check.
		while((line = reader.readLine())!=null) {
			
			System.out.println(line);
		}
		
		//Close Stream
		reader.close();
		
	}

	
	
	
}
