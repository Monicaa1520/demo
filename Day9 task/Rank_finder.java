package Day9;
import java.util.Arrays;
import java.util.Scanner;

public class Rank_finder {
	
  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);	        
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        
	        System.out.print("Enter number to find rank: ");
	        int target = sc.nextInt();
	        
	        Arrays.sort(arr);
	       
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == target) {
	                System.out.println("Rank of " + target + " is: " + (i + 1));
	                return;
	            }
	        }
        
	        System.out.println("Element not found.");
	    }
	}



