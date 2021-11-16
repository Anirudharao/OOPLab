package oopLabs;
import java.util.Scanner;

//INCOMPLETE

class Result{
	 int sub1, sub2, sub3;
	Result(){
		this.sub1 = 100;
		this.sub2 = 100;
		this.sub3 = 100;
	}
	
	int[][] arr = new int[3][3];
	
	int[] totalmarks = new int[3];
	
	Scanner sc = new Scanner(System.in);
	
	 void getMarks() {
		System.out.print("Enter the marks obtained in the three subjects: ");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
	}
	
	 int SumMarks() {
		int total = sub1 + sub2 + sub3;
		//System.out.println(total);
		return total;
	}
	
	 void setTotal() {
		for(int i=0; i<3; i++) {
			totalmarks[i] = SumMarks();
			System.out.println(totalmarks[i]);
		}
//		for(int i=0; i<3; i++) {
//			
//		}
		
	}

}


public class Lab5Prg1 {

	public static void main(String[] args) {
		Result stu1 = new Result();
		Result stu2 = new Result();
		Result stu3 = new Result();
		
		stu1.getMarks();
		stu2.getMarks();
		stu3.getMarks();
		
		stu1.SumMarks();
		stu2.SumMarks();
		stu3.SumMarks();
		
		stu1.setTotal();
		stu2.setTotal();
		stu3.setTotal();
		
	}

}

