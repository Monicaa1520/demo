package addon;

public class MinMax {
	static int min, max;
	public static void main(String[]args) {
		int[] array = {10,5,6,70,66};
		min=max=array[0];
		findMinMax(array, 1);
		System.out.println("Minimum: " + min);
	    System.out.println("Maximum: " + max);
		
	}
	public static void findMinMax(int[] array, int i) {
		if (i == array.length) return;
		min=Math.min(min, array[i]);
		max=Math.max(max, array[i]);
		findMinMax(array,i +1);	
		
	}
	}

