package java_day29_practice;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionInterfacePractice {
	
	int id, sal;
	String name;
	FunctionInterfacePractice(int id, String name, int sal)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//functional interface as Function
		//it will take one parameter, process and return the value 
		
		FunctionInterfacePractice fip = new FunctionInterfacePractice(101, "Uma", 20000);
		
		Function<String, Integer> f1 = (str) -> str.length();
		//System.out.println(f1.apply("Tharun Nagiri"));
		
		//Example 2
		
		ArrayList<FunctionInterfacePractice> arr = new ArrayList<FunctionInterfacePractice>();
		arr.add(new FunctionInterfacePractice(101, "Tharun Nagiri", 10000));
		arr.add(new FunctionInterfacePractice(102, "Priya", 300000));
		arr.add(new FunctionInterfacePractice(103, "Naveen", 100090));
		arr.add(new FunctionInterfacePractice(104, "Akhil", 30000));
		arr.add(new FunctionInterfacePractice(105, "Harika", 30000));
		arr.add(new FunctionInterfacePractice(106, "Nandhitha", 400000));
		
		Function<FunctionInterfacePractice, Integer> f2 = e ->
		{
			int sal_value = e.sal;
			
			if(sal_value<30000)
			{
				return (sal_value * 20/100);
				
			}
			else if(sal_value>=30000 && sal_value<=50000)
			{
				return (sal_value * 30/ 100);
			}
			else if(sal_value>50000)
			{
				return (sal_value * 50/ 100);
			}
			else
			{
				return 0;
			}
			
			
			
		};
		
		for(FunctionInterfacePractice fp : arr)
		{
			int bonus = f2.apply(fp);
	
			if(bonus>20000)
			{
				System.out.println(fp.id   + fp.name   + fp.sal);
				System.out.println("*********            ************");
			
			}
		}
		
		

	}

}
