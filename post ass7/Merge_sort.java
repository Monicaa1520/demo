package day7;
import java.util.Scanner;

public class Merge_sort {	
  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	      
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
       
	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
       
	        mergeSort(arr, 0, n - 1);
      
	        System.out.println("Sorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }	   
	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            int mid = (left + right) / 2;

	            mergeSort(arr, left, mid);
	            mergeSort(arr, mid + 1, right);

	            merge(arr, left, mid, right);
	        }
	    }    
	    public static void merge(int[] arr, int left, int mid, int right) {
	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        int[] L = new int[n1];
	        int[] R = new int[n2];

	        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
	        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

	        int i = 0, j = 0, k = left;

	        while (i < n1 && j < n2) {
	            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
	        }

	        while (i < n1) arr[k++] = L[i++];
	        while (j < n2) arr[k++] = R[j++];
	    }
	}



