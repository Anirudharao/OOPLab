package oopLabs;
import java.util.Arrays;

public class Lab4Prg4 {

	public static void main(String[] args) {
		int a[] = new int[] {1, 2, 3, 9, 7};
		int m = a.length;
		int b[] = new int[] {4, 8, 6, 5};
		int n = b.length;
		
		
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
		
		for(int i=0; i<m+n; i++) {
			System.out.print(c[i]);
			System.out.print("  ");
			}
	}

}
