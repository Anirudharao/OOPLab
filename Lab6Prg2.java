package oopLabs;

class Bike{
	int speedLimit = 45;
	void run() {
		System.out.println("Speed limit is " + speedLimit);
	}
}

class Splendor extends Bike{
	int speedLimit = 60;
	@Override
	void run() {
		System.out.println("Speed limit is " + speedLimit);
	}
}

public class Lab6Prg2 {
	
	public static void main(String[] args) {
		
		Bike obj = new Splendor();
		obj.run();
	}
}