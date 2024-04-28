package java_day22_practice;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FilesOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//How to create an instance
		
		//it just create an object for file
		File fp = new File("D:\\selenium_material_doc"); //we can use double forward slash  or single slash 
		
		//How to create a file in mentioned path location 
		//System.out.println(fp.createNewFile());
		
		//delete a file in mentioned path location 
		//System.out.println(fp.delete());
		
		//to check file exists or not 
		//System.out.println(fp.exists());
		
		//to check file is hidden or not 
		//System.out.println(fp.isHidden());
		
		//check user can write the data into the file
		//System.out.println(fp.canRead());
		
		//To create directory
		//System.out.println(fp.mkdir());
		//To create multiple directories
		System.out.println(fp.mkdirs());
		
		//System.out.println(fp.createNewFile());
		
		//To get entire folders/files list in form of array 
		System.out.println(Arrays.toString(fp.list()));
		
		//To get full path of files in form of array
		System.out.println(Arrays.toString(fp.listFiles()));
		
		//To get the child level folder/file 
		System.out.println(fp.getName());
		//To get the full path of the folder/file 
		System.out.println(fp.getAbsolutePath());
		//To get the parent directory/file 
		System.out.println(fp.getParent());
		
		//it returns different format, we need to format as a date format
		System.out.println(fp.lastModified());
		
		//to know whether path is a directory
		System.out.println(fp.isDirectory());
		
		//to know whether path is a file or not 
		System.out.println(fp.isFile());
		
	
		
		
		
	}

}
