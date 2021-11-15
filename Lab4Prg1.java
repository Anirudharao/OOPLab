package oopLabs;

import java.util.Scanner;

public class Lab4Prg1 {
	
	static boolean isPrime(int x) {
		boolean isPrime = true;
		
		if((x==2) || (x==3)) {
			return true;
			
			
		}
		if((x==1) || (x%2 == 0) || (x%3 == 0)) {
			isPrime = false;
		}
		for(int i=2; i*i<x; i+=6) {
			if((x % i) == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("Enter the elements of the array: ");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			if(isPrime(a[i])) {
				System.out.print(a[i]);
				System.out.print("  ");
			}
		}
	}

}
