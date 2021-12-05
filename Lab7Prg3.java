package oopLabs;

public class Lab7Prg3 {

	public static void main(String[] args) {
		int i = 5;
		Integer j = new Integer(i); // Boxing
		
		int k = j.intValue(); // Unboxing
		System.out.println(k);
	}

}
