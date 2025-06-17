package Day9;
import java.util.Scanner;

public class Target_task3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);	       
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " numbers (sorted):");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }        
	        System.out.print("Enter target number: ");
	        int target = sc.nextInt();
	        
	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == target) {
	                count++;
	            }
	        }	        
	        if (count == 0)
	            System.out.println("Target not found.");
	        else
	            System.out.println("Target found " + count + " time(s).");
	    }
	}


