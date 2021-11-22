package oopLabs;

class Stack{
    int capacity;
    int top;
    int arr[];
    
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    
    public void push(int x){
        if(isFull()){
            System.out.println("Stack overflow ");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
    
    public int pop(){
        if(isFull()){
            System.out.println("Stack underflow");
            System.exit(1);
        }
        System.out.println("Removing " + peek());
        return arr[top--];
    }
    
    public int peek(){
        if(!isEmpty()){
            return arr[top];
        } else{
            System.exit(1);
        }
        return -1;
    }
    
    public int size(){
        return top+1;
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public boolean isFull(){
        return top == capacity-1;
    }
}

public class Lab5Prg4 {
    public static void main(String[] args){
        Stack stack = new Stack(3);
        stack.push(5);
        stack.push(10);
        stack.push(69);
        
        stack.pop();
        
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size is " + stack.size());
    }
}