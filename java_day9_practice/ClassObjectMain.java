package java_day9_practice;

public class ClassObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassAndObject cao = new ClassAndObject();
		cao.stu_id = 101;
		cao.stu_name = "Tharun";
		cao.stu_age = 23;
		cao.stu_branch = "BCA";
		cao.stu_marks = 65;
		cao.displayStuInfo();
		
		ClassAndObject cao1 = new ClassAndObject();
		cao1.stu_id = 102;
		cao1.stu_name = "Mochitha";
		cao1.stu_age = 15;
		cao1.stu_branch = "MPC";
		cao.stu_marks = 95;
		cao1.displayStuInfo();
		cao.displayStuInfo();
		

	}

}
