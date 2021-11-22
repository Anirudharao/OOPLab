package oopLabs;

class Stack2{
	private int arr[];
    private int size;
    private int index = 0;
 
    public Stack2(int size) {
        this.size = size;
        arr = new int[size];
    }
 
    public void push(int element) {
 
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
 
        arr[index] = element;
        index++;
    }
 
    public int pop() {
 
        if (isEmpty()) {
           System.out.println("Stack underflow");
        }
        return arr[--index];
    }
 
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }
 
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
 
    public int size() {
        return index;
    }
}

public class Lab5Prg4Try {

	public static void main(String[] args) {
		Stack2 s = new Stack2(10);
		s.push(10);
		s.push(69);
		s.push(420);
		s.push(220);
		
		s.pop();
		
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
