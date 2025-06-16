package day7;
import java.util.Scanner;

public class Quick {

   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
            int[] a = new int[n];
	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            sort(a, 0, n - 1);

	        System.out.println("Sorted array:");
	        for (int num : a) System.out.print(num + " ");
	    }
	    static void sort(int[] a, int l, int h) {
	        if (l >= h) return;
	        int p = a[h], i = l;
	        for (int j = l; j < h; j++)
	            if (a[j] < p) { int t = a[i]; a[i] = a[j]; a[j] = t; i++; }
	        int t = a[i]; a[i] = a[h]; a[h] = t;
	        sort(a, l, i - 1);
	        sort(a, i + 1, h);
	    }
	}



