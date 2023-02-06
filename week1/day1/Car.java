package week1.day1;

public class Car {

	public void applyBrake() {
		System.out.println("Applied brake");
	}

	public void soundHorn()
	{
		System.out.println("Sound Horn");
	}
	public static void main(String[] args) {

		Car car_object = new Car();

		car_object.applyBrake();
		car_object.soundHorn();


	}
}