package oopLabs;

class Game{
	 void type() {
		System.out.println("Indoor and outdoor games");
	}
}
	class Cricket extends Game{
		void type() {
			super.type();
			System.out.println("Cricket is an outdoor game");
		}
	}
	
	class Chess extends Game{
		void type() {
			//super.type();
			System.out.println("Chess is an indoor game");
		}
	}


public class Lab6Prg1 {

	public static void main(String[] args) {
		
		Cricket obj1 = new Cricket();
		obj1.type();
		
		Game obj2 = new Chess();
		obj2.type();
	}

}
