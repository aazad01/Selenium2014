package text.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class DataReader {

	/**
	 * This class contains a main method which will be able to read a file.
	 */
	public static void main(String[] args){
		/* Use java API to read a file from external sources(can be a text file 
		 * in your documents folder)
		 * You must use Try...catch and finally block.
		 * You must use while loop.Use String array for extra credit.
		 * 
		 */
		
		BufferedReader br = null;
		FileReader fr = null;
		String file = "sample.txt";
		
		try{
			fr = new FileReader(file);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		br = new BufferedReader(fr);
		String read = "";
		
		LinkedList<String> line = new LinkedList<String>();
		int i = 0;
		try {
			while((read = br.readLine())!=null){
				//line[i] = read;
				line.add(read);
				//System.out.println(line[i]);
				System.out.println(line.get(i));
				i++;
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			
		} finally {
			try{
				br.close();				
			} catch(Exception e){
				e.printStackTrace();
			}
			
		}
		


	}

}
