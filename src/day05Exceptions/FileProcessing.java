package day05Exceptions;
import java.io.*;

public class FileProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("text.txt"));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
		}catch(IOException e) {
			System.out.println("file error:  "+ e.getMessage());
			
		}finally {
			try {
				if(reader != null) reader.close();
			}catch(IOException e) {
				System.out.println("Error closing file: "+ e.getMessage());
			}
		}
	}

}
