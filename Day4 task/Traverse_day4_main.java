package day4;

public class Traverse_day4_main {
	    static class LinkedList {
	        Node head;

	        class Node {
	            int data;
	            Node next, prev;
	            Node(int d) { data = d; next = null; prev = null; }
	        }

	        void add(int data) {
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
	        }

	        void printForward() {
	            Node temp = head;
	            while (temp != null) {
	                System.out.print(temp.data + " ");
	                temp = temp.next;
	            }
	            System.out.println();
	        }

	        void printBackward() {
	            if (head == null) return;

	            // Go to tail
	            Node temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }

	            // Traverse backward from tail to head
	            while (temp != null) {
	                System.out.print(temp.data + " ");
	                temp = temp.prev;
	            }
	            System.out.println();
	        }

	        void deleteAt(int pos) {
	            if (head == null) return;

	            Node temp = head;

	            if (pos == 0) {
	                head = head.next;
	                if (head != null) {
	                    head.prev = null;
	                }
	                return;
	            }

	            for (int i = 0; temp != null && i < pos; i++) {
	                temp = temp.next;
	            }

	            if (temp == null) return;

	            if (temp.prev != null) {
	                temp.prev.next = temp.next;
	            }

	            if (temp.next != null) {
	                temp.next.prev = temp.prev;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.add(101);
	        list.add(120);
	        list.add(300);
	        list.add(450);

	        System.out.print("Forward: ");
	        list.printForward();  // 101 120 300 450 

	        System.out.print("Backward: ");
	        list.printBackward(); // 450 300 120 101 

	        list.deleteAt(2);

	        System.out.print("Forward after del: ");
	        list.printForward();  // 101 120 450 

	        System.out.print("Backward after del: ");
	        list.printBackward(); // 450 120 101 
	    }
	}



