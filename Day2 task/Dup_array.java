package day2;

public class Dup_array {
	
	    public static void main(String[] args) {
	        int[] array = {2, 2, 3, 3, 4, 5, 8};
	        int j = 1;
	        for (int i = 1; i < array.length; i++) 
	            if (array[i] != array[i - 1]) 
	                array[j++] = array[i];
	        
	        for (int k = 0; k < j; k++) 
	            System.out.print(array[k] + " ");
	    }
	}


