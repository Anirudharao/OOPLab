package oopLabs;
import java.util.Scanner;

public class Lab5Prg5 {
	
	static float square(float x) {
		return x*x;
	}

	public static void main(String[] args) {
		float n;
		System.out.print("Enter the number: ");
		Scanner a = new Scanner(System.in);
		n = a.nextFloat();
		System.out.print("The square of the number is " + square(n));
	}

}
