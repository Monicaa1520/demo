package Day8;
import java.util.Scanner;

public class Search_main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter element to search: ");
	        int key = sc.nextInt();

	        int index = linearSearch(arr, key);

	        if (index == -1)
	            System.out.println("Element not found");
	        else
	            System.out.println("Element found at index " + index);
	    }

	    static int linearSearch(int[] arr, int key) {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key)
	                return i;
	        }
	        return -1;
	    }
	}



