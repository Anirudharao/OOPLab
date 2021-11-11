package oopLabs;

import java.util.Scanner;

public class Lab4Prg5 {

	public static void main(String[] args) {
		int m, n;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter m: ");
		m = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = sc2.nextInt();
		int[][] arr = new int[m][n];
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the elements");
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc3.nextInt();
			} System.out.println();
		}
		
		
		int trace = 0;
		int norm = 0;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(i==j) {
					trace += arr[i][i];
					norm += arr[i][i] * arr[i][i];
				}
			}
		}
		System.out.println("Trace is: " + trace + ". Norm is: " + norm);
	}

}
