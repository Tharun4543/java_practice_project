package java_day15_practice;



abstract class ThisAccess
{
	int age = 50; 
	public abstract void getAgeValue();
	
}

class DefineThisMul
{
	int age = 10;
	
	//using this in non static block 
	/*
	 * { System.out.println(this.age);
	 * System.out.println("This is non static block"); }
	 */
	
	//using this in constructor
	DefineThisMul(int age)
	{
		this.age = age;
	}
	
	public void getAge()
	{
		System.out.println(age);
	}
}

//abstract class
class ThisAccessChild extends ThisAccess
{

	@Override
	public void getAgeValue() {
		System.out.println(this.age);
		
	}
	
}

interface ThisAccessInter
{
	int age = 50; 
	void getAgeValueInter();
	
	default void getClassName()
	{
		System.out.println(this.getClass().getName());
	}
	
	
}

class ThisAccessInterChild implements ThisAccessInter
{

	@Override
	public void getAgeValueInter() {
		// TODO Auto-generated method stub
		
	}
	

}




public class ThisKeywordPractice3 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefineThisMul dtm = new DefineThisMul(20);
		dtm.getAge();
		
		ThisAccessChild tac = new ThisAccessChild();
		tac.getAgeValue(); 
		
		ThisAccessInterChild tai = new ThisAccessInterChild();
		tai.getClassName();
		

	}

}
