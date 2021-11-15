package oopLabs;
import java.util.Scanner;

public class Lab4Prg3 {

	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter m: ");
		m = sc.nextInt();
		System.out.print("Enter n: ");
		n = sc.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("Enter the elements of the 2D array");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int count = 0;
		int ele;
		
		System.out.print("Enter the element to be searched: ");
		ele = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] == ele) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
