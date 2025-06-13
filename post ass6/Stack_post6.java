package day6;
import java.util.Scanner;
public class Stack_post6 {
	
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    Node top = null; 
	   
	    void push(int value) {
	        Node newNode = new Node(value);
	        newNode.next = top;
	        top = newNode;
	        System.out.println(value + " pushed to stack");
	    }
   
	    void pop() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	        } else {
	            System.out.println(top.data + " popped from stack");
	            top = top.next;
	        }
	    }
   
	    void display() {
	        if (top == null) {
	            System.out.println("Stack is empty");
	            return;
	        }
	        System.out.print("Stack: ");
	        Node temp = top;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
   
	    public static void main(String[] args) {
	    	Stack_post6 stack = new Stack_post6();
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
	            System.out.print("Enter choice: ");
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
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice");
	            }
	        } while (choice != 4);

	        sc.close();
	    }
	}


