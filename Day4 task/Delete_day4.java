package day4;

public class Delete_day4 {
	    static class LinkedList {
	        Node head;

	        class Node {
	            int data;
	            Node next, prev;
	            Node(int d) { data = d; next = null; prev = null; }
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

	        void print() {
	            Node temp = head;
	            while (temp != null) {
	                System.out.print(temp.data + " ");
	                temp = temp.next;
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.print();  
	        list.deleteAt(2);  
	        list.print();      
	    }
	}



