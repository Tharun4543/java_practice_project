package java_day28_practice;

import java.util.Arrays;

public class PojoPracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PojoClassPractice pcp1 = new PojoClassPractice();
		pcp1.setId(101);
		pcp1.name = "Tharun";
		pcp1.salary = 15000;
		
		PojoClassPractice pcp2 = new PojoClassPractice();
		pcp2.setId(102);
		pcp2.name = "Puri Jaganadh";
		pcp2.salary = 100000;
		
		PojoClassPractice pcp3 = new PojoClassPractice();
		pcp3.setId(103);
		pcp3.name = "Yadhagiri";
		pcp3.salary = 100000;
		
		System.out.println(pcp1.getId() + " " + pcp1.getName() + "  " + pcp1.getSalary());
		System.out.println(pcp2.getId() + " " + pcp2.getName() + "  " + pcp2.getSalary());
		System.out.println(pcp3.getId() + " " + pcp3.getName() + "  " + pcp3.getSalary());
		
		//Advantage of pojo
		
		PojoClassPractice[] emp_list = {pcp1, pcp2, pcp3};
		
		
		PojoClassPractice pcp_1 = emp_list[0];
		
		System.out.println(pcp_1.getName());

	}

}
