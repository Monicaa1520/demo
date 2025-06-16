package Day8;
import java.util.Scanner;

public class Rotated_search {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements (rotated sorted): ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter element to search: ");
	        int key = sc.nextInt();

	        int index = search(arr, 0, n - 1, key);

	        if (index == -1)
	            System.out.println("Element not found");
	        else
	            System.out.println("Element found at index " + index);
	    }

	    static int search(int[] arr, int low, int high, int key) {
	        if (low > high)
	            return -1;

	        int mid = (low + high) / 2;
	        if (arr[mid] == key)
	            return mid;
	        
	        if (arr[low] <= arr[mid]) {
	            if (key >= arr[low] && key < arr[mid])
	                return search(arr, low, mid - 1, key);
	            else
	                return search(arr, mid + 1, high, key);
	        }       
	        else {
	            if (key > arr[mid] && key <= arr[high])
	                return search(arr, mid + 1, high, key);
	            else
	                return search(arr, low, mid - 1, key);
	        }
	    }
	}



