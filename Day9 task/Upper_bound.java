package Day9;

public class Upper_bound {
	    public static void main(String[] args) {
	        int arr[] = {2, 3, 4, 5, 12, 24, 35, 77};
	        int target = 15;

	        int left = 0;
	        int right = arr.length;
	        int mid;

	        while (left < right) {
	            mid = (left + right) / 2;
	            if (arr[mid] <= target) {
	                left = mid + 1; 
	            } else {
	                right = mid;    
	            }
	        }

	        if (left < arr.length) {
	            System.out.println("Upper bound found at index " + left + " and value " + arr[left]);
	        } else {
	            System.out.println("No element greater than target");
	        }
	    }
	}



