package java_day25_practice;

import java_day25_practice.InnerClassesPractice3.InnerClass;
import java_day25_practice.InnerClassesPractice3.InnerClass2;

public class InnerClassesPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class InnerClass1
	{
		//can we create main method in inner class  -- no
		public static void main(String args[])
		{
			InnerClass ic = new InnerClassesPractice3().new InnerClass();
			ic.getOuterDetails();
		}
		
	}

}

class OperatorsPractice   //outer class
{
	//we can create non static inner classes as public, private, protected, abstract
	public class ArthermeticOperators  //inner class
	{
		
	}
	private class LogicalOperators   //inner class 
	{
		
	}
	protected class RelationalOperators  //inner class 
	{
		
	}
	abstract class BitwiseOperators
	{
		
	}
	final class TernaryOperators
	{
		
	}
	static class AssignmentOperators
	{
		
	}
	class InnerClass1
	{
		//can we create main method in inner class  -- no
		public static void main(String args[])
		{
			
		}
		
	}
	
}
