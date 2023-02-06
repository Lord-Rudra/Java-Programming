package week1.day1;

public class Mobile {

	public void sendSms () {
		System.out.println("From oppo");

		Boolean isfullCharged = true;
		int mobileCost = 25000;
		System.out.println("The cost of the mobile is  "+ mobileCost );
		if(isfullCharged) {
			System.out.println("Is the mobile charged? -- yes");
		}
	}
	public void makeCall(){
		System.out.println("Calling my friend");
		String mobileModel = "oppo";
		Float mobileWeight = 22.01f;
		System.out.println("The Mobile model is  "+ mobileModel + "  and its weight is  "+ mobileWeight);
	}
	public static void main(String[] args) {

		Mobile cellphone = new Mobile();
		System.out.println("This is my mobile ");
		cellphone.sendSms();
		cellphone.makeCall();


	}

}
