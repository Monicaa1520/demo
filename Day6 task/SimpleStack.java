package day6;

public class SimpleStack {

	    int maxSize = 5;
	    int[] stack = new int[maxSize];
	    int top = -1;

	    void push(int value) {
	        if (top == maxSize - 1) {
	            System.out.println("Stack overflow");
	            return;
	        }
	        top++;
	        stack[top] = value;
	        System.out.println(value + " pushed");
	    }

	    void pop() {
	        if (top == -1) {
	            System.out.println("Stack underflow");
	            return;
	        }
	        System.out.println(stack[top] + " popped");
	        top--;
	    }

	    public static void main(String[] args) {
	       SimpleStack s = new SimpleStack();
	        s.push(10);
	        s.push(20);
	        s.push(30);	        
	        s.pop();
	        s.pop();
	        s.pop(); 
	    }
	}



