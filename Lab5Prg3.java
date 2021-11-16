package oopLabs;
import java.util.Scanner;

//Call by value

public class Lab5Prg3 {
	
	static void change(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		System.out.println("Inside the function : The respective values of x and y are " + x + " and " + y);
	}
	

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextInt();

		int b;
		System.out.print("Enter b: ");
		b = sc.nextInt();
		
		System.out.println("Before function call, the values of a and b are " + a + " and " + b);
		
		change(a, b);
		
		System.out.println("After function call, the values of a and b are " + a + " and " + b);
	}

}
