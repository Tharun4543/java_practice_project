package java_day28_practice;

public class JavaBeanMainPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaBeanPractice jbp1 = new JavaBeanPractice();
		jbp1.setId(101);
		jbp1.setName("Puri Jaganadh");
		jbp1.setSalary(90000);
		
		
		JavaBeanPractice jbp2 = new JavaBeanPractice();
		jbp2.setId(102);
		jbp2.setName("Teja");
		jbp2.setSalary(87900);
		
		JavaBeanPractice jbp3 = new JavaBeanPractice();
		jbp3.setId(103);
		jbp3.setName("Anoob");
		jbp3.setSalary(87900);
		
		System.out.println(jbp1.getId());
		System.out.println(jbp1.getName());
		System.out.println(jbp1.getSalary());
		
		System.out.println(jbp2.getId());
		System.out.println(jbp2.getName());
		System.out.println(jbp2.getSalary());
		
		System.out.println(jbp3.getId());
		System.out.println(jbp3.getName());
		System.out.println(jbp3.getSalary());
	}

}
