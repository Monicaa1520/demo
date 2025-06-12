package day5;

public class Basic_circular {
	 static class Node {
		int data;
		Node next;
		Node(int data) {
			this.data=data;		
			}
	}
	Node head=null;
	 
	void insert(int data) {
		Node newNode=new Node(data);
		if(head == null ) {
			head = newNode;
			newNode.next= head;
		}
		else {
			Node temp=head;
			while(temp.next != head) {
				temp = temp.next;
			}
			temp.next=newNode;
			newNode.next=head;
		}
		
	}
	void display() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node temp = head;
		System.out.println("Circular linkedlist:");
		do { 
			System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
			
		}
	public static void main(String[] args) {
		 Basic_circular list = new Basic_circular();  
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        list.insert(40);

	        list.display();
	}
}

	


