package java_day23_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Create property file
		File fpp = new File("./login_info.properties");
		if(!fpp.exists())
		{
			fpp.createNewFile();
		}
//		
		
		
		//FileOutputStream fos = new FileOutputStream(fpp);
		//How to create object for properties
		Properties pr = new Properties();
		
		
		

//		pr.setProperty("Name", "Tharun"); 
//		pr.setProperty("Age", "20"); //
//		pr.setProperty("Color", "Black");
//		pr.store(fos, "Below are properties information");	
		//How to read properties file data
		
		FileInputStream fis = new FileInputStream(fpp);
		pr.load(fis);
		System.out.println(pr);
		
//		Set<String> pr_keys = pr.stringPropertyNames(); //Return property key value in set string format
//		Set<Object> pr_keys_2 = pr.keySet();
//		System.out.println(pr_keys_2);
//		
//		//Return values
//		Collection<Object> pr_values = pr.values();
//		System.out.println(pr_values);
//		
//		//How to retrive single property value from prop file
//		
//		System.out.println(pr.getProperty("Color", "White")); //if key is not present, then given value will return
//		
//		//How to print all values
//		for(String key : pr.stringPropertyNames())
//		{
//			System.out.println(key + "   "+   pr.getProperty(key));
//		}
//		
//		//Using entry set
//		Set<Entry<Object, Object>> pr_entryset = pr.entrySet();
//		System.out.println(pr_entryset);
//		for(Entry<Object, Object> entry : pr_entryset)
//		{
//			System.out.println(entry.getKey() + "   " +  entry.getValue());
//		}
//		
//		//Remove property value 
//		System.out.println(pr.remove("Color"));
		
		//How to know the size value 
		System.out.println(pr.size());
		//how to clear all the properties value 
		pr.clear();
		
//		

	}

}
