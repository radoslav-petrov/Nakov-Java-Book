package _15_files_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class NamesSort {

	private static final String INPUT_FILE = "src/_15_files_2/input.txt";
	private static final String OUTPUT_FILE = "src/_15_files_2/output.txt";
	
	public static void main(String[] args) {
		Scanner fileInput = null;
		PrintStream fileOutput = null;
		LineNumberReader reader = null;
		int lines;
		
		try {
			fileInput = new Scanner(new File(INPUT_FILE), "UTF-8");
			fileOutput = new PrintStream(OUTPUT_FILE, "UTF-8");
			
	        reader = new LineNumberReader(new FileReader(new File(INPUT_FILE)));
	        while ((reader.readLine()) != null);
	        lines =  reader.getLineNumber();
		    if(reader != null)
		    	reader.close();
			
			String[] inputData = new String[lines];
			int counter = 0;
			while(fileInput.hasNextLine()) {
				inputData[counter] = fileInput.nextLine();
				counter++;
			}
			
			Arrays.sort(inputData);

			for(int i = 0; i < counter; i++) {
		//		System.out.println(inputData[i]);
				fileOutput.println(inputData[i]);
			}
			
		} catch(FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch(UnsupportedEncodingException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			if(fileInput != null)
				fileInput.close();
			if(fileOutput != null)
				fileOutput.close();
		}
	}
}
