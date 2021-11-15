package oopLabs;
import java.util.Arrays;
import java.util.Scanner;

public class Lab4Prg4 {

	public static void main(String[] args) {
		int m;
		System.out.print("Enter m: ");
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		System.out.println("Enter the elements of the first array");
		
		int a[] = new int[m];
		for(int i=0; i<m; i++) {
			a[i] = sc.nextInt();
		}
		
		int n;
		System.out.print("Enter n: ");
		Scanner sc1 = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.println("Enter the elements of the second array");
		int b[] = new int[n];
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		int[] c = new int[m+n];
		
		for(int i=0; i<m; i++) {
			c[i] = a[i];
		}
		int j=0;
		for(int i=m; i<m+n; i++) {
			c[i] = b[j];
			j++;
		}
		for(int i=0; i<m+n; i++) {
		System.out.print(c[i]);
		System.out.print("  ");
		}
		
		System.out.println();
		
		Arrays.sort(c);
		System.out.println("Array after sorting: ");
		for(int i=0; i<m+n; i++) {
			System.out.print(c[i]);
			System.out.print("  ");
			}
	}

}
