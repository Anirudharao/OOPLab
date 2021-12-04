package oopLabs;

import java.util.Scanner;

interface Sports{
	void getNumberOfGoals();
	void displayTeam();
}

class Hockey implements Sports{
	int goals;
	
	public void getNumberOfGoals() {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of goals (Hockey): ");
		goals = sc.nextInt();
	}
	
	public void displayTeam() {
		System.out.println("Indian Hockey team");
	}
}

class Football implements Sports{
	int goals;
	
	public void getNumberOfGoals() {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of goals (Football): ");
		goals = sc.nextInt();
	}
	
	public void displayTeam() {
		System.out.println("Indian Football team");
	}
}

public class Lab8Prg3 {

	public static void main(String[] args) {
		Sports obj1 = new Hockey();
		obj1.getNumberOfGoals();
		obj1.displayTeam();
		
		Sports obj2 = new Football();
		obj2.getNumberOfGoals();
		obj2.displayTeam();
	}

}
