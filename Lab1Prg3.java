package oopLabs;
import java.util.Scanner;

public class Lab1Prg3 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		
		for(int i=1; i<=10; i++) {
			
			System.out.print(n*i);
			System.out.print("  ");
		}
		
	}

}
