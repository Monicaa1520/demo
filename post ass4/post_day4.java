package day4;
import java.util.Scanner;

public class post_day4 {

	    class Node {
	        int data;
	        Node next, prev;
	        Node(int data) {
	            this.data = data;
	            next = null;
	            prev = null;
	        }
	    }
	    Node head = null;

	  
	    void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            while (temp.next != null)
	                temp = temp.next;
	            temp.next = newNode;
	            newNode.prev = temp;
	        }
	        System.out.println(data + " inserted.");
	    }

	   
	    void delete(int data) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	       
	        if (head.data == data) {
	            head = head.next;
	            if (head != null)
	                head.prev = null;
	            System.out.println(data + " deleted.");
	            return;
	        }

	        Node temp = head;

	        while (temp != null && temp.data != data) {
	            temp = temp.next;
	        }

	        if (temp == null) {
	            System.out.println(data + " not found.");
	            return;
	        }
     
	        if (temp.prev != null)
	            temp.prev.next = temp.next;

	        if (temp.next != null)
	            temp.next.prev = temp.prev;

	        System.out.println(data + " deleted.");
	    }

	    void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        System.out.print("List: ");
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
   
	    void createList() {
	        int[] List = {10, 20, 30, 40, 50};
	        for (int val : List) {
	            insert(val);
	        }
	    }

	    public static void main(String[] args) {
	        post_day4 list = new post_day4();
	        list.createList();

	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Insert");
	            System.out.println("2. Delete");
	            System.out.println("3. Display");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1 -> {
	                    System.out.print("Enter value to insert: ");
	                    int val = sc.nextInt();
	                    list.insert(val);
	                }
	                case 2 -> {
	                    System.out.print("Enter value to delete: ");
	                    int val = sc.nextInt();
	                    list.delete(val);
	                }
	                case 3 -> list.display();
	                case 4 -> {
	                    System.out.println("Exiting program.");
	                    sc.close();
	                    System.exit(0);
	                }
	                default -> System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	}



