package day6;
import java.util.Scanner;

public class Stack_task2 {

	    int[] stack = new int[5];
	    int top = -1;
	    
	    public void push(int value) {
	        if (top == stack.length - 1) {
	            System.out.println("Stack Overflow");
	        } else {
	            stack[++top] = value;
	            System.out.println(value + " pushed to stack.");
	        }
	    }
	  
	    public void pop() {
	        if (top == -1) {
	            System.out.println("Stack Underflow");
	        } else {
	            System.out.println(stack[top] + " popped from stack.");
	            top--;
	        }
	    }
    
	    public void display() {
	        if (top == -1) {
	            System.out.println("Stack is empty.");
	        } else {
	            System.out.print("Stack elements: ");
	            for (int i = 0; i <= top; i++) {
	                System.out.print(stack[i] + " ");
	            }
	            System.out.println();
	        }
	    }
	   
	    public static void main(String[] args) {
	        Stack_task2 stack = new Stack_task2();
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n Stack Menu");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Display");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter value to push: ");
	                    int val = sc.nextInt();
	                    stack.push(val);
	                    break;
	                case 2:
	                    stack.pop();
	                    break;
	                case 3:
	                    stack.display();
	                    break;
	                case 4:
	                    System.out.println("Exiting program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        } while (choice != 4);

	        sc.close();
	    }
	}



