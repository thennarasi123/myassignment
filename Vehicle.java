package week1.day2;

public class Vehicle {
	public void applyBrake() {
		// TODO Auto-generated method stub
		System.out.println("Brake applied->from vehicle class");
	}
	public void applySoundHorn() {
		// TODO Auto-generated method stub
		System.out.println("Hey Please move->from vehicle class");
	}
	public static void main(String[] args) {
		Vehicle vec=new Vehicle();
		vec.applyBrake();
		vec.applySoundHorn();
	}
}