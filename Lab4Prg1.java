package oopLabs;

public class Lab4Prg1 {
	
	static boolean isPrime(int x) {
		boolean isPrime = true;
		
		if((x==2) || (x==3)) {
			return true;
			
			
		}
		if((x==1) || (x%2 == 0) || (x%3 == 0)) {
			isPrime = false;
		}
		for(int i=2; i*i<x; i+=6) {
			if((x % i) == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		int[] a = new int[] {5, 1,  2, 6, 7, 9, 3, 6, 4, 8};
		int n = 10;
		for(int i=0; i<n; i++) {
			if(isPrime(a[i])) {
				System.out.print(a[i]);
				System.out.print("  ");
			}
		}
	}

}
