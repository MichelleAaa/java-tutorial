package javastreams;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		Stream Connectivity:
		File f = new File("C:\\filewriting\\myTextFile.txt"); //we have to provide the path of the file, including the filename.
//		Note that the file doesn't have to exist yet. You can also make .csv files too... but note that we can't use \t for tab in a csv file.
		
		FileWriter fw = new FileWriter(f, true); //At first there's an error - hover and click to add throws declaration.
//		If you add true as the second parameter (you could leave it blank instead) then it means append it set to true. So if you run the code multiple times it would add to the end of the file.
		BufferedWriter writer = new BufferedWriter(fw);
		
//		Writing inside the File:
		writer.write("First Line"); // When you type writer.write, there's a lot of overloaded options. We are using the one with the string parameter.
//		If you use writer.write() again, it writes in the same line.
		writer.newLine();
		writer.write("Second Line");
		writer.newLine();
		writer.write("Another line");
		writer.newLine();
		writer.write("Another");
//	To make this look better, you could just loop over it.
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				int num = (int)(Math.random()*100);
				writer.write(num + "\t"); // If you create it as a csv file, then we can't use \t for tab, but you could use a comma or something else.
			}
			writer.newLine();
		}
		
//		Closing Stream
		writer.close();
		
		System.out.println("File Created");
		
//		
	}

}
