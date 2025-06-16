package day7;
import java.util.Scanner;

public class Bubble {
	   public static void bubbleSort(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {	        
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	      
	        System.out.print("Enter the number of elements: ");
	        int size = scanner.nextInt();
    
	        int[] arr = new int[size];
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }
       
	        bubbleSort(arr);
	        
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        scanner.close();
	    }
	}

	


