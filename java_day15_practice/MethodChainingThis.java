package java_day15_practice;

class MethodChain

{
	int age;
	public int getAge() {
		return age;
	}
	public MethodChain setAge(int age) {
		this.age = age;
		return this;
	}
	public String getName() {
		return name;
	}
	public MethodChain setName(String name) {
		this.name = name;
		return this;
	}
	public boolean Is_married() {
		return is_married;
	}
	public MethodChain setIs_married(boolean is_married) {
		this.is_married = is_married;
		return this;
	}
	String name;
	boolean is_married;
	
	

}

public class MethodChainingThis {

	public static void main(String[] args) {
		MethodChain mc = new MethodChain();
		mc.setAge(16).
		setName("Mochitha").
		setIs_married(false);
		System.out.println(mc.getAge());
		System.out.println(mc.getName());
		System.out.println(mc.Is_married());
		
	
	}
}
		
		
		
		