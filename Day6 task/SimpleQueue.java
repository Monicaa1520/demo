package day6;

	import java.util.ArrayList;
	public class SimpleQueue {
	    private ArrayList<Integer> queue;

	    public SimpleQueue() {
	        queue = new ArrayList<>();
	    }

	    
	    public void enqueue(int item) {
	        queue.add(item);
	    }
	    
	    public Integer dequeue() {
	        if (queue.isEmpty()) {
	            return null;
	        }
	        return queue.remove(0);
	    }

	    public static void main(String[] args) {
	        SimpleQueue q = new SimpleQueue();
	        q.enqueue(5);
	        q.enqueue(10);
	        System.out.println(q.dequeue()); 
	        System.out.println(q.dequeue()); 
	        System.out.println(q.dequeue()); 
	    }
	}



