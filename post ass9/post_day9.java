package Day9;

public class post_day9 {
	

	    public static int lowerBound(int[] arr, int target) {
	        int low = 0, high = arr.length;
	        while (low < high) {
	            int mid = low + (high - low) / 2;
	            if (arr[mid] < target) {
	                low = mid + 1;
	            } else {
	                high = mid;
	            }
	        }
	        return low;
	    }
  
	    public static int upperBound(int[] arr, int target) {
	        int low = 0, high = arr.length;
	        while (low < high) {
	            int mid = low + (high - low) / 2;
	            if (arr[mid] <= target) {
	                low = mid + 1;
	            } else {
	                high = mid;
	            }
	        }
	        return low;
	    }
    public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 2, 3, 5, 7};

	        int target = 2;
	        int lb = lowerBound(arr, target);
	        int ub = upperBound(arr, target);

	        System.out.println("Lower Bound of " + target + ": " + lb);
	        System.out.println("Upper Bound of " + target + ": " + ub);

	        System.out.println("Count of " + target + ": " + (ub - lb));
	    }
	}
