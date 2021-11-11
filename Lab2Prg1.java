package oopLabs;
import java.util.Scanner;

public class Lab2Prg1 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter b: ");
		b = sc2.nextInt();
		
		System.out.println((a<<2)+(b>>2));
		System.out.println((b > 0));
		System.out.println((a + b * 100) / 10);
		System.out.println(a&b);
	}

}
