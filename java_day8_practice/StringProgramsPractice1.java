package java_day8_practice;

public class StringProgramsPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Surender", str_rev = "";
		//Reverse a string using string methods
		/*
		 *  for(int i = s1.length()-1; i>=0; i--) {
		 * str_rev = str_rev + s1.charAt(i); }
		 * 
		 * System.out.println(str_rev);
		 */
		
		//Reverse a string with out using string methods
		
		char char_str_array[] = s1.toCharArray();
		/*
		 * for(int i = char_str_array.length-1; i>=0; i--) { str_rev = str_rev +
		 * char_str_array[i]; } System.out.println(str_rev);
		 */
		
		
		//using stringbuffer class
		
		StringBuffer sb = new StringBuffer("Mochitha");
		System.out.println(sb.reverse());
		
		//using stringbuilder class
		
				StringBuilder sbe = new StringBuilder("Deepika");
				System.out.println(sbe.reverse());
		
		
	}

}
