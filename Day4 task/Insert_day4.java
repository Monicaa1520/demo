package day4;

public class Insert_day4 {
	    static class Node {
	        int data;
	        Node next;
	        Node prev;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	            this.prev = null;
	        }
	    }
	    static class DoublyLinkedList {
	        Node head;
	        Node tail;
	        public void insert(int data) {
	            Node newNode = new Node(data);
	            if (head == null) {
	                head = newNode;
	                tail = newNode;
	            } else {
	                tail.next = newNode;
	                newNode.prev = tail;
	                tail = newNode;
	            }
	        }
	        public void insertAtMiddle(int data) {
	            Node newNode = new Node(data);
	            if (head == null) {
	                head = newNode;
	                tail = newNode;
	                return;
	            }            
	            int count = 0;
	            Node current = head;
	            while (current != null) {
	                count++;
	                current = current.next;
	            }            
	            int mid = count / 2;
	            current = head;
	            for (int i = 0; i < mid; i++) {
	                current = current.next;
	            }          
	            newNode.next = current.next;
	            newNode.prev = current;

	            if (current.next != null) {
	                current.next.prev = newNode;
	            } else {
	                tail = newNode;
	            }

	            current.next = newNode;
	        }

	      
	        public void traverse() {
	            Node current = head;
	            while (current != null) {
	                System.out.print(current.data + ", ");
	                current = current.next;
	            }
	            System.out.println("null");
	        }
	    }

	    // Main method to test
	    public static void main(String[] args) {
	        DoublyLinkedList list = new DoublyLinkedList();

	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);

	        System.out.print("Before insertAtMiddle: ");
	        list.traverse();

	        list.insertAtMiddle(25);  // Insert in the middle

	        System.out.print("After insertAtMiddle: ");
	        list.traverse();
	    }
	}



