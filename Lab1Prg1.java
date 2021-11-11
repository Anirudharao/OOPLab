package oopLabs;
import java.util.Scanner;

public class Lab1Prg1 {

	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num = sc.nextInt();
		int original = num;
		int temp = 0;
		int last;
		
		while(num>0) {
			last = num%10;
			temp = temp*10 + last;
			num/=10;
		}
		if(original == temp) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

}
