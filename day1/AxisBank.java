package week3.day1;

public class AxisBank extends Bankinginfo{
	
	public void deposit() {
		System.out.println("overridden deposit");
	}

	public static void main(String[] args) {
		
		AxisBank overridden = new AxisBank();
		
		 overridden.deposit();
		
		
	}
}
