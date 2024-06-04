package week1.day2;

public class Car extends Vehicle{
	public void applyGear() {
		// TODO Auto-generated method stub
		System.out.println("Gear applied->from car class");
	}
	public void turnOnAccelerator() {
		// TODO Auto-generated method stub
		System.out.println("Accelerate->from car class");
	}
	public static void main(String[] args) {
		Car cr=new Car();
		cr.applyBrake();
		cr.applySoundHorn();
		cr.applyGear();
		cr.turnOnAccelerator();
	}

}
