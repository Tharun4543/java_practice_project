package java_day7_practice;

import java.util.Arrays;

public class StringMethodsPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creation of strings approach 1
		String s1 = "Tharun";
		String s2 = "tharun";
		String s3 = "Nagiri";
		
		/*
		 * //creation of string approach2 String s2 = new String("Nagiri"); String s3 =
		 * "Mochitha"; System.out.println(s2);
		 * 
		 * //Length of the string System.out.println(s1.length());
		 * 
		 * //Concatenation of the string approach1 System.out.println(s1.concat(s2));
		 * 
		 * //Concatenation of the string approach2 System.out.println(s1 + s2 + s3);
		 * System.out.println(s1.concat(s2).concat(s3));
		 * 
		 * //trim to remove the spaces String s4 = "         Deepu      ";
		 * System.out.println(s4.trim());
		 * 
		 * //charAt for getting character based on index
		 * System.out.println(s1.charAt(4));
		 */
		
		//contains to check mentioned string is present or not
		System.out.println(s1.contains("r"));
		System.out.println(s1.contains("Tharu"));
		
		
		//equals() and equalsIgnoreCase() -- compare strings
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));  //it will ignore the case
		
		//replace() - replace single/multiple sequance of characters in a string
		System.out.println(s1.replace('T', 'M'));
		System.out.println(s1.replace("Tharun", "Mochitha"));
		
		//substring - extract substring from the main string
		System.out.println(s1.substring(1, 4));
		
		//toUpperCase - to convert lower characters into upper characters
		System.out.println(s1.toUpperCase());
		
		//toLowerCase - to convert upper case characters into lower characters
		System.out.println(s1.toLowerCase());
		
		//split() - returns an single dimension array based on delimator
		
		String mail_id = "nagiritharun4543@gmail.com";
		String mail_id_arr[] = mail_id.split("@");
		System.out.println(Arrays.toString(mail_id_arr));
		
		//toCharArray()  - returns single character array from the string
		
		char ch_array[] = s1.toCharArray();
		System.out.println(Arrays.toString(ch_array));
		
		
		
		
		
		
	}

}
