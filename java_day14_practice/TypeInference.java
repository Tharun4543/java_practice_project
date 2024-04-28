package java_day14_practice;

class TypeInferPractice
{
	//var i = 20; //invalid
	public void sumValue()
	{
		var a = 10;
		var b = 20;
		var c = 20.5;
		var d = 'A';
		var e = "Tharun";
		var f = new int[5];
		var g = new int[]{10, 20, 30};
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		}
		
		
		
		//var c = 10, d = 20;  //invalid
		//var c;
		//c = 20; //invaid
}

public class TypeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TypeInferPractice tip = new TypeInferPractice();
		tip.sumValue();

	}

}
