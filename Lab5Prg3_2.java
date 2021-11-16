package oopLabs;

import java.util.Scanner;

class callByRef{
	int a, b;
	
	callByRef(int i, int j){
		a = i;
		b = j;
	}
	
	void swap(callByRef obj) {
		int temp = obj.a;
		obj.a = obj.b;
		obj.b = temp;
		
		System.out.println("Inside swap method a = " + a + " and b = " + b);
	}
	
}

public class Lab5Prg3_2 {

	public static void main(String[] args) {
		
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextInt();

		int b;
		System.out.print("Enter b: ");
		b = sc.nextInt();
		
		System.out.println("Before function call, the values of a and b are " + a + " and " + b);
		
		callByRef obj = new callByRef(a, b);
		
		obj.swap(obj);
		System.out.println("After function call, the values of a and b are " + obj.a + " and " + obj.b);
	}

}
