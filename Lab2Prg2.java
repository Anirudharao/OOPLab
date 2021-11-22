package oopLabs;

import java.util.Scanner;

public class Lab2Prg2 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		a = sc.nextInt();
		
		System.out.print("Enter b: ");
		b = sc.nextInt();
		
		System.out.print("Enter c: ");
		c = sc.nextInt();
		
		int ans = (c > ((a>b)? a:b))? c : (a>b)? a:b;
		int ans2 = (c < ((a<b)? a:b))? c : (a<b)? a:b;
		System.out.println(ans + " " + ans2);
	}

}
