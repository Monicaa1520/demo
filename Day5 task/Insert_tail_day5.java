package day5;

public class Insert_tail_day5 {
	
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
	        Insert_tail_day5 list = new Insert_tail_day5();
	        list.insertAtTail(10);
	        list.insertAtTail(20);
	        list.insertAtTail(30);
	        list.insertAtTail(40);

	        list.display();
	    }
	}


