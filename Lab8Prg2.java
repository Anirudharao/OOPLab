package oopLabs;

import java.util.Scanner;

interface Shape1{
	void computeArea();
}

class Triangle1 implements Shape1{
	
	public void computeArea() {
		double area;
		int height;
		int base;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height: ");
		height = sc.nextInt();
		System.out.print("Enter the base: ");
		base = sc.nextInt();
		
		area = (0.5 * base * height);
		
		System.out.println("Area of the triangle is " + area);
	}
}

class Square1 implements Shape1{
	public void computeArea() {
		double area;
		int length;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the side: ");
		length = sc.nextInt();
		
		area = (length * length);
		
		System.out.println("Area of the square is " + area);
	}
}

public class Lab8Prg2 {

	public static void main(String[] args) {
		Shape1 tri = new Triangle1();
		tri.computeArea();
		
		Shape1 sq = new Square1();
		sq.computeArea();
	}

}
