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
		for(int i=0; i<3; i++) {
			System.out.print(total[i] + "  ");
		}
	}
	
	void SubTopper() {
		int highest[] = new int[20];
		int roll[] = new int[3];
		int m = 0;
		int i,j,k = 0;
		int ans=0;
		for(j=0; j<3; j++) {
			for(i=0; i<3; i++) {
				ans = Math.max(ans, mark[i][j]);
			}
				highest[k] = ans;
				k++;
				roll[m] = (i+1);
				m++;
		}
		
		
		System.out.println();
		System.out.println("Subject toppers: ");
		for(k=0; k<3; k++) {
			System.out.println("Subject " + (k+1) + ": Roll number: " + (m) + ", Marks: " + highest[k] + "  ");
			
		}
//		k = 0;
		System.out.println();
//		System.out.println("Roll Numbers of subject toppers: ");
//		for(i=0; i<3; i++) {
//			for(j=0; j<3; j++) {
//				if(mark[i][j] == highest[k]) {
//					System.out.print((i+1) + "  ");
//					k++;
//				}
//			}
//		}
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