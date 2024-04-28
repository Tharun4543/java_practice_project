package java_day30_practice;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInterfacePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//it does not take any input but it returns one value, data type can be anything
		Supplier<String> su1 = () -> "Tharun";
		System.out.println(su1.get());
		
		Supplier<Date> su2 = () -> new Date();
		System.out.println(su2.get());
	}

}
