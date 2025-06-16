package Day8;
import java.util.Scanner;
public class Linear_search {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] arr = new int[100];
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

	        System.out.print("Enter number to search: ");
	        int key = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            if (arr[i] == key) {
	                System.out.println("Found at index " + i);
	                return;
	            }
	        }

	        System.out.println("Not found");
	    }
	}



