package Day8;

import java.util.Scanner;

public class post_day8 {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter number of elements (sorted): ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " sorted integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	       
	        System.out.print("Enter element to count frequency: ");
	        int key = sc.nextInt();

	        int first = findFirst(arr, key);  
	        if (first == -1) {
	            System.out.println("Element not found");
	            return;
	        }

	        int last = findLast(arr, key);    
            int frequency = last - first + 1;
	        System.out.println("Frequency: " + frequency);
	    }
	   static int findFirst(int[] arr, int key) {
	        int low = 0, high = arr.length - 1, result = -1;
	        while (low <= high) {
	            int mid = (low + high) / 2;
	            if (arr[mid] == key) {
	                result = mid;      
	                high = mid - 1;    
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return result;
	    }
   static int findLast(int[] arr, int key) {
	        int low = 0, high = arr.length - 1, result = -1;
	        while (low <= high) {
	            int mid = (low + high) / 2;
	            if (arr[mid] == key) {
	                result = mid;    
	                low = mid + 1;     
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        return result;
	    }
	}



