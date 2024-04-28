package java_day22_practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class FileReadOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File fpr = new File("C:\\FilePractice1\\sample_text.txt");
		if(!fpr.exists())
		{
			fpr.createNewFile();
		}
		
		//Different ways to read a text file 
		/*
		 * FileInputStream
		 * Scanner
		 * FileReader
		 * BufferedReader
		 */
		
		//Using FileInputStream Class
		FileInputStream fis = new FileInputStream(fpr);
	
		//To print first character in a file 
		int ascii_code_value;
//		while ((ascii_code_value = fis.read()) != -1) {
//		    System.out.print((char) ascii_code_value);
//		}
		// fis.close();
//		
//		String file_text = "";
//		
//		while((ascii_code_value = fis.read()) != -1)
//		{
//			file_text = file_text + String.valueOf((char) (ascii_code_value));
//		}
//	
//		System.out.println(file_text);
		
		
		//Using scanner class
		
//		Scanner sc = new Scanner(fpr);   // we can pass here FileInputStream class 
//		
//		String file_text_sc = "";
//		
//		while(sc.hasNextLine())
//		{
//			//System.out.println(sc.nextLine());
//			file_text_sc = file_text_sc + sc.nextLine() + "\n";
//			
//		}
//		sc.close();
//		
//		System.out.println(file_text_sc);
		
		
		//Using FileReader class
		
		FileReader fr = new FileReader(fpr);  // we can pass FileInputStream object also 
//		
//		String file_text_fr = "";
//		while((ascii_code_value = fr.read()) != -1)
//		{
//			file_text_fr = file_text_fr + (char) ascii_code_value;
//			
//		}
//		
//		System.out.println(file_text_fr);
		
		//Using Buffered Reader Class
		
		//Reading data line by line by using read method 
		BufferedReader br = new BufferedReader(fr);  //we can pass reader object, FileInputStream object
//		
//		String file_text_br = "";
//		
//		while((ascii_code_value = br.read() != -1))
//		{
//			file_text_br = file_text_br + (char) ascii_code_value;
//		}
		
		//Reading data using nextLine Method, it charater is none , it returns null value
//		String line, text_br = "";
//		
//		while((line = br.readLine()) != null)
//		{
//			text_br = text_br + line;
//			
//		}
//		System.out.println(text_br);
		
		
		
		
		
		
		
	}

}
