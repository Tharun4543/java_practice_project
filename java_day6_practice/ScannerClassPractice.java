package java_day6_practice;

import java.util.Scanner;

public class ScannerClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer");
		int num = sc.nextInt();
		System.out.println("Integer value is:" + num);
		System.out.println("Enter a float");
		float float_num = sc.nextFloat();
		System.out.println("float value is:" + float_num);
		System.out.println("Enter a boolean");
		boolean value = sc.nextBoolean();
		System.out.println("boolean value is:" + value);
		System.out.println("Enter a string");
		String data = sc.next();
		System.out.println("String value is:" + data);
		
		

	}

}
