package javastreamsapachepoi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testFilereading_writing {


	public static void main(String[] args) throws IOException {
		/*
		//create a file
		File file = new File("c:\\filewriting\\test.txt"); //Location where the file should be created.
		file.createNewFile();
		
		//write inside a file
		FileWriter fw = new FileWriter("c:\\filewriting\\test.txt");
		BufferedWriter filewriter = new BufferedWriter(fw);
		
		filewriter.write("Please write inside this file");
		filewriter.newLine();
		filewriter.write("This is my second line");
		filewriter.flush();
		*/
		
		//read from a file
		FileReader fr = new FileReader("c:\\filewriting\\test.txt");
		BufferedReader filereader = new BufferedReader(fr);
		String i="";
		/*
		System.out.println(filereader.readLine());
		System.out.println(filereader.readLine());
		System.out.println(filereader.readLine());
		System.out.println(filereader.readLine());
		*/
		
		while((i = filereader.readLine())!=null){
			
			System.out.println(i);
		}
		
		

	}

}
