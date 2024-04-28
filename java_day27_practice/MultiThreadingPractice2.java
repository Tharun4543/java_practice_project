package java_day27_practice;

public class MultiThreadingPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentData sd = new StudentData(96, 92, 37, 48);
		Thread tsd = new Thread(sd);
		tsd.start();
		
		
		

	}

}

//create a thead using runnable (it is preferable approach because we can extend more than one class)

class StudentData implements Runnable
{
	int tel_marks,
		eng_marks,
		math_marks,
		soc_marks;
	public StudentData(int tel_marks, int eng_marks, int maths_marks, int soc_marks)
	{
		this.tel_marks = tel_marks;
		this.eng_marks = tel_marks;
		this.math_marks = tel_marks;
		this.soc_marks = tel_marks;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The total student marks are " + (tel_marks + 
				eng_marks + 
				math_marks + 
				soc_marks 
			));
		
		
	}
	
}
