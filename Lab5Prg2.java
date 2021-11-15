package oopLabs;
import java.util.Scanner;

class Array{
	int[] arr = new int[10];
	
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 10 elements of the array: ");
		for(int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	void display() {
		System.out.println("The input array is ");
		
		for(int i=0; i<10; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println();
	}
	
	void largest() {
		int max = -999;
		
		for(int i=0; i<10; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The largest element is " + max);
	}
	
	void average() {
		int avg = 0;
		
		for(int i=0; i<10; i++) {
			avg += arr[i];
		}
		avg = avg/10;
		System.out.println("The average value is " + avg);
	}
	
	void sort() {
		for(int i=1; i<10; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println("The array after sorting is ");
		for(int i=0; i<10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

public class Lab5Prg2 {

	public static void main(String[] args) {
		Array obj = new Array();
		obj.input();
		obj.display();
		obj.largest();
		obj.average();
		obj.sort();
	}

}
