package oopLabs;

public class Lab4Prg3 {

	public static void main(String[] args) {
		int[][] arr = new int[][] {{3,5,7}, {9,5,1}, {2,4,5}};
		int count = 0;
		int ele = 5;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(arr[i][j] == 5) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
