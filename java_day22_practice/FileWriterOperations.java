package java_day22_practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Java provides classes to write the data into the file
		/*
		 * FileOutputStream
		 * FileWriter
		 * BufferedWriter
		 * 
		 */
		
		File fl = new File("C:\\FilePractice1\\sample_text2.txt");
		
		fl.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(fl);
		String file_text = "Tharun is a waste fellow, He does not have common sense \n He has dump mind";
		
		for(char ch : file_text.toCharArray())
		{
			fos.write((int) ch);
		}
		
		FileWriter fw = new FileWriter(fl);
		fw.write("You do not know how to talk/interact with people");
		
		//BufferedWriter class
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("You have to maintain your emotions");
		
		System.out.println("Write operation is successful with file output stream");
		
		fos.flush();
		fw.flush();		
		bw.flush();
	}
	


}
