package oopLabs;

class Student_Detail{
	String name;
	int id;
	static String collegeName = "MIT";
	
	Student_Detail(String name, int id){
		this.id = id;
		this.name = name;
	}
	
	void display_details() {
		System.out.println("College name: " + collegeName);
		System.out.println("Student name: " + name);
		System.out.println("Student ID: " + id);
	}
}

public class Lab7Prg1 {

	public static void main(String[] args) {
		Student_Detail s1 = new Student_Detail("Ramesh", 2);
		Student_Detail s2 = new Student_Detail("Mahesh", 1);
		Student_Detail s3 = new Student_Detail("Suresh", 3);
		
		s1.display_details();
		s2.display_details();
		s3.display_details();
	}

}
