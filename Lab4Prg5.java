package oopLabs;

import java.util.Scanner;

public class Lab4Prg5 {

	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m: ");
		m = sc.nextInt();
		System.out.print("Enter n: ");
		n = sc.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("Enter the elements");
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			} System.out.println();
		}
		
		
		int trace = 0;
		int squares = 0;
		int norm = 0;
		
		if(m != n) {
			System.out.println("The entered matrix is not a square matrix");
		}
		else {
			for(int i=0; i<m; i++) {
				for(int j=0; j<n; j++) {
					if(i==j) {
						trace += arr[i][i];
					}
						squares += arr[i][j] * arr[i][j];
				}
			}
		}
		norm = (int)Math.pow(squares, 0.5);
		System.out.println("Trace is: " + trace + ". Norm is: " + norm);
	}

}
