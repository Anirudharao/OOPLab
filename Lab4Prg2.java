package oopLabs;
import java.util.Scanner;

public class Lab4Prg2 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter the elements of the Array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = -999;
		int min = 999;
		
		for(int i=0; i<n; i++) {
			if(arr[i] >= max) {
				max = arr[i];
			} else if(arr[i] <= min) {
				min = arr[i];
			}
		}
		
		System.out.println("The maximum and minimum elements of the array are " + max + " and " + min + " respectively.");
	}

}
