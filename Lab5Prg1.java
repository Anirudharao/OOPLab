package oopLabs;
import java.util.Scanner;

class Result{
	int mark[][] = new int[3][3];
	int total[] = new int[3];
	
	void getInput() {
		System.out.println("Please enter the details of the student: ");
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter the marks in subject 1, marks in subject 2 and marks in subject 3 of student " + (i+1));
			for(int j=0; j<3; j++) {
				mark[i][j] = sc.nextInt();
			}
		}
		
	}
	
	void display() {
		System.out.println("Roll  Sub1  Sub2  Sub3");
		for(int i=0; i<3; i++) {
			System.out.print((i+1) + "     ");
			for(int j=0; j<3; j++) {
				System.out.print(mark[i][j] + "     ");
			}
			System.out.println();
		}
	}
	
	void displayTotal(){
		for(int i=0; i<3; i++) {
			int sum = 0;
			for(int j=0; j<3; j++) {
				sum += mark[i][j];
			}
			total[i] = sum;
		}
		System.out.println("Total: ");
		for(int i=0; i<3; i++) {
			System.out.print(total[i] + "  ");
		}
		System.out.println();
	}
	
	void SubTopper() {
		
		int max, h;
		
		for(int j=0; j<3; j++) {
			max = mark[0][j];
			h = 0;
			for(int i=0; i<3; i++) {
				if(mark[i][j] > max) {
					max = mark[i][j];
					h = i;
				}
			}
			System.out.println("Highest mark in subject " + (j+1) + " is " + max + ", scored by roll number " + (h+1));
		}
		

	}
	
	void topper(){

		if(total[0] >= total[1]) {
			if(total[0] >= total[2]) {
				System.out.println("Student 1 is the topper of the class");
			} else {
				System.out.println("Student 3 is the topper of the class");
			}
		} else {
			if(total[1] >= total[2]) {
				System.out.println("Student 2 is the topper of the class");
			} else {
				System.out.println("Student 3 is the topper of the class");
			}
		}
			
		
	}
	
	
}

public class Lab5Prg1{
	public static void main(String[] args) {
		Result obj = new Result();
		obj.getInput();
		obj.display();
		obj.displayTotal();
		obj.SubTopper();
		obj.topper();
	}
}