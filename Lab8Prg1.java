package oopLabs;

import java.util.Scanner;

abstract class Shape{
	abstract public void computeArea();
}

class Triangle extends Shape{
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

class Square extends Shape{
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

public class Lab8Prg1 {

	public static void main(String[] args) {
		Shape trian = new Triangle();
		trian.computeArea();
		
		Shape sq = new Square();
		sq.computeArea();
	}

}
