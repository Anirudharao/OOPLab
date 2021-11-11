package oopLabs;

import java.util.Scanner;

public class Lab2Prg2 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter b: ");
		b = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter c: ");
		c = sc3.nextInt();
		
		int ans = (c > ((a>b)? a:b))? c : (a>b)? a:b;
		System.out.println(ans);
	}

}
