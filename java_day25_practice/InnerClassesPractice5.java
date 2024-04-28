package java_day25_practice;

public class InnerClassesPractice5 {

	public String Addition1(int a, int b)
	{
		return "Addition of two numbers is" +  (a+b); 
	}
	
	

}

abstract class Operations
{
	public void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	abstract public void subtraction();
	
}

interface Condition
{
	public void eligibleForVote();
	
	
}
