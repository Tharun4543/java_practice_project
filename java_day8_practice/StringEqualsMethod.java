package java_day8_practice;

public class StringEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// == and equals difference if string creates without using new keyword
		String s1 = "Tharun", s2 = "Tharun";
		System.out.println(s1 == s2);   //true
		System.out.println(s1.equals(s2));   //true
		
		// == and equals difference if string creates with using new keyword
		
		String s3 = new String("Mochitha");
		String s4 = new String("Mochitha");
		
		System.out.println(s3 == s4);   //false   //checks the object of a string
		System.out.println(s3.equals(s4));   //true //checks value of the object in a string
		
		System.out.println(s1 == s3);   //false   //checks the object of a string
		System.out.println(s1.equals(s4));   //false //checks value of the object in a string
		
		String s5 = s4;
		System.out.println(s4 == s5);  //true
		System.out.println(s4.equals(s5));  //true
	}

}
