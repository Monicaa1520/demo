package day5;

public class Delete_day5_main {

	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	        }
	    }

	    Node head = null;

	    void insertAtTail(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            newNode.next = head;
	        } else {
	            Node temp = head;
	            while (temp.next != head) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	            newNode.next = head;
	        }
	        System.out.println(data + " inserted at tail.");
	    }

	    void deleteAtPosition(int position) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        
	        if (position == 1) {
	            
	            if (head.next == head) {
	                System.out.println(head.data + " deleted.");
	                head = null;
	                return;
	            }

	          
	            Node last = head;
	            while (last.next != head) {
	                last = last.next;
	            }

	            System.out.println(head.data + " deleted.");
	            head = head.next;
	            last.next = head;
	            return;
	        }

	      
	        Node current = head;
	        Node prev = null;
	        int count = 1;

	        while (count < position && current.next != head) {
	            prev = current;
	            current = current.next;
	            count++;
	        }

	        if (count != position) {
	            System.out.println("Position " + position + " is invalid.");
	            return;
	        }

	        prev.next = current.next;
	        System.out.println(current.data + " deleted.");
	    }

	    void display() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        Node temp = head;
	        System.out.print("Circular List: ");
	        do {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println("(back to head)");
	    }

	    public static void main(String[] args) {
	    	Delete_day5_main list = new Delete_day5_main();
	        list.insertAtTail(10);
	        list.insertAtTail(20);
	        list.insertAtTail(30);
	        list.insertAtTail(40);

	        list.display();

	        System.out.println("\nDeleting position 1:");
	        list.deleteAtPosition(1);
	        list.display();

	        System.out.println("\nDeleting position 2:");
	        list.deleteAtPosition(2);
	        list.display();

	        System.out.println("\nDeleting invalid position 5:");
	        list.deleteAtPosition(5);
	        list.display();
	    }
	}

	
	


