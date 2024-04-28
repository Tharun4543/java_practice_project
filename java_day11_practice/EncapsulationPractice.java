package java_day11_practice;

public class EncapsulationPractice {
	
	private int acc_no;
	private String acc_name;
	private float acc_balance;
	
	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public String getAcc_name() {
		return acc_name;
	}

	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}

	public float getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(float acc_balance) {
		this.acc_balance = acc_balance;
	}


	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationPractice cp = new EncapsulationPractice();
		cp.setAcc_no(1023121);
		System.out.println(cp.getAcc_no());
		cp.setAcc_name("Tharun");
		System.out.println(cp.getAcc_name());
		cp.setAcc_balance(10000);
		System.out.println(cp.getAcc_balance());
		
	

	}

}
