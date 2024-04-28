package java_day8_practice;

import java.util.Arrays;

public class RemoveSpecialSymbolStr {

	public static void main(String[] args) {
		
		String s1 = "Tharun is a waste fellow";
		
		String s1_arr[] = s1.split(" ");
		int count = 0;
		for(int i = 0; i<s1_arr.length; i++)
		{
			count = count +1;
		}
		System.out.println(count);
		System.out.println(Arrays.toString(s1_arr));
		/*
		 * String s1 = "malayalam"; //output should be m - 2 a - 3 l - 2 y -1
		 * 
		 * char spe_sym_arr[] = {'!', '@', '#', '$', '%', '&', '*'}; //char s1_array[] =
		 * s1.toCharArray(); for(int i = 0; i<s1.length(); i++) { for(int j = 0;
		 * j<spe_sym_arr.length; j++) { if(s1.charAt(i) == spe_sym_arr[j]) { char ch =
		 * s1.charAt(i); } } }
		 * 
		 * //remove white spaces
		 * 
		 * 
		 * //count occurance of a string s1 = s1.replace(" ", ""); char ch_arr[] =
		 * s1.toCharArray(); //System.out.println(Arrays.toString(ch_arr));
		 * 
		 * for(int i = 0; i<ch_arr.length; i++) { int count = 0; char ch = ch_arr[i];
		 * 
		 * 
		 * for(int j = 0; j<ch_arr.length; j++) { if(ch == ch_arr[j]) { count+= 1;
		 * 
		 * } } System.out.println(ch + "          " + count); }
		 */

	}

}
