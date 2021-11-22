package oopLabs;

class Game{
	static void type() {
		System.out.println("Indoor and outdoor games");
	}
	
	class Cricket{
		void type() {
			System.out.println("Cricket is an outdoor game");
		}
	}
	
	class Chess{
		void type() {
			System.out.println("Chess is an indoor game");
		}
	}
}

public class Lab6Prg1 {

	public static void main(String[] args) {
		
		Game obj1 = new Game();
		Game.type();
		
		Game.Cricket obj2 = obj1.new Cricket();
		obj2.type();
		
		Game.Chess obj3 = obj1.new Chess();
		obj3.type();
	}

}
