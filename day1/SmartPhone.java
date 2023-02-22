package week3.day1;

public class SmartPhone extends AndroidPhone{

	public void connectWhatsapp() {
		System.out.println("connecting whatsapp");
	}
	
	public static void main(String[] args) {
		
		SmartPhone button = new SmartPhone();
		
		button.connectWhatsapp();
		button.saveContact();
		button.sendMsg();
		button.makeCall();
		button.takeVideo();
		
	}
}


