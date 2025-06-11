package day4;

public class Basic_day4_doubly {
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

	    static class LinkedList {
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

	        public void traverse() {
	            Node current = head;
	            while (current != null) {
	                System.out.print(current.data + ", ");
	                current = current.next;
	            }
	            System.out.println("null");
	        }
	    }

	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.insert(57);
	        list.insert(68);
	        list.insert(32);
	        list.traverse();
	    }
	}



